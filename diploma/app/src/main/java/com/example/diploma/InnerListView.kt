package com.example.diploma
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class InnerListView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : ListView(context, attrs) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val expandSpec = MeasureSpec.makeMeasureSpec(Int.MAX_VALUE shr 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec)
    }

    }