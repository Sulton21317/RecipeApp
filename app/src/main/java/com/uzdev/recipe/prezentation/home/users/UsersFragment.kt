package com.uzdev.recipe.prezentation.home.users

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.uzdev.recipe.R
import com.uzdev.recipe.data.model.Food
import com.uzdev.recipe.data.model.User
import com.uzdev.recipe.databinding.FragmentUsersBinding
import com.uzdev.recipe.prezentation.home.users.adapter.FollowedUserAdapter
import com.uzdev.recipe.prezentation.home.users.adapter.UsersAdapter


class UsersFragment : Fragment() {

    private var _binding: FragmentUsersBinding? = null
    private val binding get() = _binding!!

    private val usersAdapter = UsersAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentUsersBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initializeData()


    }

    private fun initializeData() {
        with(binding) {
            rvFollowedUser.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                adapter = FollowedUserAdapter()
            }
            rvUser.apply {
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
                adapter = usersAdapter
                setHasFixedSize(true)
            }
            usersAdapter.setData(loadUsersData())
        }
    }

    fun loadUsersData(): ArrayList<User> {
        val userDataList = ArrayList<User>()

        userDataList += User(
            name = "Tom",
            image = R.drawable.img,
            like = 30,
            msgCount = 4,
            msg = "This is very awesome food, I recommend it to you",
            timeAgo = "31 min ago",
            food = Food(R.drawable.baseline_fastfood_24, "Break", 32, 10),
            isChef = true
        )
        userDataList.add(
            User(
                name = "Tom",
                R.drawable.img,
                food = null,
                30,
                msg = "This is very awesome food, I recommend it to you",
                4,
                "31 min ago", isChef = false
            )
        )

        userDataList += User(
            name = "Tom",
            image = R.drawable.img,
            like = 30,
            msgCount = 4,
            msg = "This is very awesome food, I recommend it to you",
            timeAgo = "31 min ago",
            food = Food(R.drawable.baseline_fastfood_24, "Break", 32, 10),
            isChef = true
        )
        userDataList.add(
            User(
                name = "Tom",
                image = R.drawable.img,
                like = 30,
                msg = "This is very awesome food, I recommend it to you",
                msgCount = 4,
                timeAgo = "31 min ago",
                isChef = false,
                food = null


            )
        )
        userDataList += User(
            name = "Tom",
            image = R.drawable.img,
            like = 30,
            msgCount = 4,
            msg = "This is very awesome food, I recommend it to you",
            timeAgo = "31 min ago",
            food = Food(R.drawable.baseline_fastfood_24, "Break", 32, 10),
            isChef = true
        )
        userDataList.add(
            User(
                name = "Tom",
                image = R.drawable.img,
                like = 30,
                msg = "This is very awesome food, I recommend it to you",
                msgCount = 4,
                timeAgo = "31 min ago",
                isChef = false,
                food = null
            )
        )

        userDataList += User(
            name = "Tom",
            image = R.drawable.img,
            like = 30,
            msgCount = 4,
            msg = "This is very awesome food, I recommend it to you",
            timeAgo = "31 min ago",
            food = Food(R.drawable.baseline_fastfood_24, "Break", 32, 10),
            isChef = true
        )
        userDataList.add(
            User(
                name = "Tom",
                R.drawable.img,
                food = null,
                30,
                msg = "This is very awesome food, I recommend it to you",
                4,
                "31 min ago", isChef = false
            )
        )

        userDataList += User(
            name = "Tom",
            image = R.drawable.img,
            like = 30,
            msgCount = 4,
            msg = "This is very awesome food, I recommend it to you",
            timeAgo = "31 min ago",
            food = Food(R.drawable.baseline_fastfood_24, "Break", 32, 10),
            isChef = true
        )
        userDataList.add(
            User(
                name = "Tom",
                image = R.drawable.img,
                like = 30,
                msg = "This is very awesome food, I recommend it to you",
                msgCount = 4,
                timeAgo = "31 min ago",
                isChef = false,
                food = null


            )
        )
        userDataList += User(
            name = "Tom",
            image = R.drawable.img,
            like = 30,
            msgCount = 4,
            msg = "This is very awesome food, I recommend it to you",
            timeAgo = "31 min ago",
            food = Food(R.drawable.baseline_fastfood_24, "Break", 32, 10),
            isChef = true
        )
        userDataList.add(
            User(
                name = "Tom",
                image = R.drawable.img,
                like = 30,
                msg = "This is very awesome food, I recommend it to you",
                msgCount = 4,
                timeAgo = "31 min ago",
                isChef = false,
                food = null
            )
        )

        userDataList += User(
            name = "Tom",
            image = R.drawable.img,
            like = 30,
            msgCount = 4,
            msg = "This is very awesome food, I recommend it to you",
            timeAgo = "31 min ago",
            food = Food(R.drawable.baseline_fastfood_24, "Break", 32, 10),
            isChef = true
        )
        userDataList.add(
            User(
                name = "Tom",
                R.drawable.img,
                food = null,
                30,
                msg = "This is very awesome food, I recommend it to you",
                4,
                "31 min ago", isChef = false
            )
        )

        userDataList += User(
            name = "Tom",
            image = R.drawable.img,
            like = 30,
            msgCount = 4,
            msg = "This is very awesome food, I recommend it to you",
            timeAgo = "31 min ago",
            food = Food(R.drawable.baseline_fastfood_24, "Break", 32, 10),
            isChef = true
        )
        userDataList.add(
            User(
                name = "Tom",
                image = R.drawable.img,
                like = 30,
                msg = "This is very awesome food, I recommend it to you",
                msgCount = 4,
                timeAgo = "31 min ago",
                isChef = false,
                food = null


            )
        )
        userDataList += User(
            name = "Tom",
            image = R.drawable.img,
            like = 30,
            msgCount = 4,
            msg = "This is very awesome food, I recommend it to you",
            timeAgo = "31 min ago",
            food = Food(R.drawable.baseline_fastfood_24, "Break", 32, 10),
            isChef = true
        )
        userDataList.add(
            User(
                name = "Tom",
                image = R.drawable.img,
                like = 30,
                msg = "This is very awesome food, I recommend it to you",
                msgCount = 4,
                timeAgo = "31 min ago",
                isChef = false,
                food = null
            )
        )
        return userDataList
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}