package com.uzdev.recipe.prezentation.home.home.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uzdev.recipe.data.model.Food
import com.uzdev.recipe.databinding.ItemTrendingNowBinding

class TrendingNowAdapter : RecyclerView.Adapter<TrendingNowAdapter.TrendingNowViewHolder>() {

    private var trendFoodList = emptyList<Food>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TrendingNowAdapter.TrendingNowViewHolder {
        return TrendingNowViewHolder(
            ItemTrendingNowBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    @SuppressLint("NotifyDataSetChanged")
    fun setTrendingFoodList(foodList: ArrayList<Food>) {
        trendFoodList = foodList
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: TrendingNowAdapter.TrendingNowViewHolder, position: Int) {
        holder.bindTo(trendFoodList[position])
    }

    override fun getItemCount(): Int = trendFoodList.size

    inner class TrendingNowViewHolder(private val binding: ItemTrendingNowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindTo(food: Food) {
            with(binding) {
                ivFood.setImageResource(food.image)
                tvFoodName.text = food.name
                tvFoodKal.text = food.kKal.toString() + " kcal"
                tvPreparationTime.text = food.preparedTime.toString() + " mins"
            }
        }

    }
}