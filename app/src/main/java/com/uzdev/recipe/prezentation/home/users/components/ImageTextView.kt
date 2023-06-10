package com.uzdev.recipe.prezentation.home.users.components

import android.content.Context
import android.media.tv.TvView
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.appcompat.widget.AppCompatImageButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import com.uzdev.recipe.R
import java.util.jar.Attributes

class ImageTextView(context: Context, attributes: AttributeSet) : FrameLayout(
    context, attributes
) {

    private lateinit var tvView: AppCompatTextView
    private lateinit var ivBtn: AppCompatImageButton

    init {
        inflate(context, R.layout.image_text_view, this)
        tvView =findViewById(R.id.imb)
    }


}