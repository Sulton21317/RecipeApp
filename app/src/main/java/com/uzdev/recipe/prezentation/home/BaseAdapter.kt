package com.uzdev.recipe.prezentation.home

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter : RecyclerView.Adapter<BaseAdapter.BaseViewHolder>() {

    abstract inner class BaseViewHolder(context: View) : RecyclerView.ViewHolder(context)
}