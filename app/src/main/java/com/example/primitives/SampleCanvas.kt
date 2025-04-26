package com.example.primitives

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class SampleCanvas @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val paint = Paint()

        // Draw a red circle
        paint.color = Color.RED
        val circleX = 200f
        val circleY = 200f
        val radius = 100f
        canvas.drawCircle(circleX, circleY, radius, paint)

        // Draw a green square
        paint.color = Color.GREEN
        val left = 400f
        val top = 100f
        val right = 600f
        val bottom = 300f
        canvas.drawRect(left, top, right, bottom, paint)
    }
}