package com.uzdev.recipe.prezentation.home.users.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.uzdev.recipe.data.model.User
import com.uzdev.recipe.databinding.ItemChefUserBinding
import com.uzdev.recipe.databinding.ItemJustUserBinding

@Suppress("CAST_NEVER_SUCCEEDS")
class UsersAdapter : RecyclerView.Adapter<ViewHolder>() {
    companion object {
        private const val TYPE_USER = 0
        private const val TYPE_CHEF = 1
    }

    private var userList = emptyList<User>()


    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): ViewHolder {
        return when (viewType) {
            TYPE_USER -> JustUserViewHolder(
                ItemJustUserBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            TYPE_CHEF -> ChefUserViewHolder(
                ItemChefUserBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            else -> JustUserViewHolder(
                ItemJustUserBinding
                    .inflate(
                        LayoutInflater.from(parent.context), parent, false
                    )
            )
        }


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (userList[position].isChef) {
            holder as ChefUserViewHolder
            holder.bindTo(userList[position])
        } else {
            holder as JustUserViewHolder
            holder.bindTo(userList[position])
        }
    }


    override fun getItemCount(): Int {
        return userList.size
    }

    override fun getItemViewType(position: Int): Int {
        return when (userList[position].isChef) {
            true -> TYPE_CHEF
            else -> TYPE_USER

        }

    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(userList: ArrayList<User>) {
        this.userList = userList
        notifyDataSetChanged()

    }


    inner class JustUserViewHolder(binding: ItemJustUserBinding) : ViewHolder(binding.root) {
        fun bindTo(user: User) {

        }
    }

    inner class ChefUserViewHolder(binding: ItemChefUserBinding) : ViewHolder(binding.root) {
        fun bindTo(chef: User) {

        }
    }
}