package com.uzdev.recipe.prezentation.home.home.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uzdev.recipe.data.model.Chef
import com.uzdev.recipe.databinding.ItemPopularChefsBinding

class PopularChefsAdapter : RecyclerView.Adapter<PopularChefsAdapter.PopularChefViewHolder>() {

    private var chefList = emptyList<Chef>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularChefViewHolder {
        return PopularChefViewHolder(
            ItemPopularChefsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PopularChefViewHolder, position: Int) {
        holder.bindTo(chefList[position])
    }

    override fun getItemCount(): Int {
        return chefList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setChefList(chefArrayList: ArrayList<Chef>) {
        chefList = chefArrayList
        notifyDataSetChanged()
    }


    inner class PopularChefViewHolder(private val binding: ItemPopularChefsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindTo(chef: Chef) {


            binding.apply {

                imgChef.setImageResource(chef.image)
                tvChefName.text = chef.name

            }

        }
    }
}
