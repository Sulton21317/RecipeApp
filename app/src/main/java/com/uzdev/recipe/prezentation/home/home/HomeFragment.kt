package com.uzdev.recipe.prezentation.home.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.uzdev.recipe.R
import com.uzdev.recipe.data.model.Chef
import com.uzdev.recipe.data.model.Food
import com.uzdev.recipe.databinding.FragmentHomeBinding
import com.uzdev.recipe.prezentation.home.home.adapter.BreakFastAdapter
import com.uzdev.recipe.prezentation.home.home.adapter.PopularChefsAdapter
import com.uzdev.recipe.prezentation.home.home.adapter.TrendingNowAdapter
import com.uzdev.recipe.prezentation.home.home.component.FilterBottomSheetFragment

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    private val breakFastAdapter = BreakFastAdapter()
    private val popularChefsAdapter = PopularChefsAdapter()
    private val trendingNowAdapter = TrendingNowAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            btnSettings.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_settingsFragment)
            }

            ivbFilter.setOnClickListener {
                showFilterDialog()
            }


            rvBreakfast.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                adapter = breakFastAdapter
            }
            breakFastAdapter.setNewData(loadFakeBreakfastData())



            rvPopularChief.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                adapter = popularChefsAdapter
            }
            popularChefsAdapter.setChefList(loadFakeChefData())

            rvTrendingNow.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                adapter = trendingNowAdapter
            }

            trendingNowAdapter.setTrendingFoodList(loadFakeBreakfastData())

        }


    }

    private fun loadFakeBreakfastData(): ArrayList<Food> {
        val foodList = ArrayList<Food>()

        foodList.add(Food(R.drawable.ic_food_cup, "Coffee", 42, 10))
        foodList.add(Food(R.drawable.baseline_fastfood_24, "Break", 32, 10))
        foodList.add(Food(R.drawable.ic_food_cup, "Coffee", 42, 14))
        foodList.add(Food(R.drawable.baseline_fastfood_24, "Break", 22, 3))
        foodList.add(Food(R.drawable.ic_food_cup, "Nano", 42, 5))
        foodList.add(Food(R.drawable.ic_food_cup, "Coffee", 42, 10))
        foodList.add(Food(R.drawable.baseline_fastfood_24, "Break", 32, 10))
        foodList.add(Food(R.drawable.ic_food_cup, "Coffee", 42, 14))
        foodList.add(Food(R.drawable.baseline_fastfood_24, "Break", 22, 3))
        foodList.add(Food(R.drawable.ic_food_cup, "Nano", 42, 5))
        return foodList
    }


    private fun loadFakeChefData(): ArrayList<Chef> {
        val chefArrayList = ArrayList<Chef>()

        chefArrayList.add(Chef(image = R.drawable.ic_food_cup, name = "Tom Shelby"))
        chefArrayList.add(Chef(image = R.drawable.baseline_fastfood_24, name = "Alex John"))
        chefArrayList.add(Chef(image = R.drawable.ic_food_cup, name = "Holland J"))
        chefArrayList.add(Chef(image = R.drawable.ic_food_cup, name = "Di Maria"))
        chefArrayList.add(Chef(image = R.drawable.baseline_fastfood_24, name = "Bob Pris"))
        chefArrayList.add(Chef(image = R.drawable.ic_food_cup, name = "Tim Cook"))
        return chefArrayList
    }


    private fun showFilterDialog() {
        val filterBottomSheet = FilterBottomSheetFragment()
        filterBottomSheet.show(parentFragmentManager, "filter_dialog")
    }


}