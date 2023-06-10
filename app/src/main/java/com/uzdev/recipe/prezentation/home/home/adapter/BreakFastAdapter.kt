package com.uzdev.recipe.prezentation.home.home.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uzdev.recipe.data.model.Food
import com.uzdev.recipe.databinding.ItemBreakfastBinding

class BreakFastAdapter : RecyclerView.Adapter<BreakFastAdapter.BreakFastViewHolder>() {

    private var breakFastFoods = emptyList<Food>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BreakFastViewHolder {
        return BreakFastViewHolder(
            ItemBreakfastBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    fun setNewData(foodList: ArrayList<Food>) {
        breakFastFoods = foodList
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = breakFastFoods.size
    override fun onBindViewHolder(holder: BreakFastViewHolder, position: Int) {
        holder.run { bindTo(breakFastFoods[position]) }

    }


    inner class BreakFastViewHolder(val binding: ItemBreakfastBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
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