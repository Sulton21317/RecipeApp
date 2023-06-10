package com.uzdev.recipe.prezentation.home.users.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uzdev.recipe.data.model.ChefFullInfo
import com.uzdev.recipe.databinding.ItemFollowedUserBinding

class FollowedUserAdapter : RecyclerView.Adapter<FollowedUserAdapter.ChefsInfoViewHolder>() {
    val chefsDetails = emptyList<ChefFullInfo>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FollowedUserAdapter.ChefsInfoViewHolder {
        return ChefsInfoViewHolder(
            ItemFollowedUserBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: FollowedUserAdapter.ChefsInfoViewHolder, position: Int) {
//        holder.bindTo(chefsDetails[position])
    }

    override fun getItemCount(): Int {
        return 10
    }


    inner class ChefsInfoViewHolder(private val binding: ItemFollowedUserBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindTo(chefFullInfo: ChefFullInfo) {

        }
    }
}