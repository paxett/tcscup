package com.paxet.tcscup.ui.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.cardview.widget.CardView
import com.paxet.tcscup.R
import com.paxet.tcscup.databinding.DsItemCardBinding

class DsItemCardView(
    context: Context,
    attributeSet: AttributeSet
) : CardView(context) {

    private val binding: DsItemCardBinding =
        DsItemCardBinding.inflate(LayoutInflater.from(context), this, false)

    init {
        addView(binding.root)
        val typedArray = context.theme.obtainStyledAttributes(
            attributeSet,
            R.styleable.DsItemCardView, 0, 0
        )

        binding.apply {
            val titleText = typedArray.getString(R.styleable.DsItemCardView_android_title)
            val subtitleText = typedArray.getString(R.styleable.DsItemCardView_android_subtitle)
            val cardBackground = typedArray.getString(R.styleable.DsItemCardView_item_background)
            val isElevated = typedArray.getString(R.styleable.DsItemCardView_item_isElevated)
            val isCloseButtonVisible =
                typedArray.getString(R.styleable.DsItemCardView_close_button_visibility)

            title.text = titleText
            subtitle.text = subtitleText
            card.setBackgroundResource(
                when (cardBackground) {
                    "0" -> R.color.white
                    "1" -> R.color.ds_light_grey
                    else -> R.color.white
                }
            )
            close.visibility = if (isCloseButtonVisible == "0") GONE
            else VISIBLE
        }
    }
}