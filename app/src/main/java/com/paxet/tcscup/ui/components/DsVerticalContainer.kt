package com.paxet.tcscup.ui.components

import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.RemoteViews
import com.paxet.tcscup.R
import com.paxet.tcscup.databinding.DsVerticalContainerBinding

@RemoteViews.RemoteView
class DsVerticalContainer(
    context: Context,
    attributeSet: AttributeSet,
) : LinearLayout(context) {
    private val binding: DsVerticalContainerBinding =
        DsVerticalContainerBinding.inflate(LayoutInflater.from(context), this, false)

    private var mLeftWidth: Int = 0
    private var mRightWidth: Int = 0
    private val mTmpContainerRect: Rect = Rect()
    private val mTmpChildRect: Rect = Rect()

    init {
        addView(binding.root)
        val typedArray = context.theme.obtainStyledAttributes(
            attributeSet,
            R.styleable.DsVerticalContainer, 0, 0
        )

        binding.apply {

        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        if (childCount <= 1) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        } else {
            for (i in 0 until childCount) {

            }
            setMeasuredDimension(widthMeasureSpec, heightMeasureSpec)
        }
    }
}