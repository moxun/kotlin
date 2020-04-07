package com.example.sch.myapplication;

import android.content.Context;

import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by shichaohui on 2015/7/9 0009.
 * <p>
 * 重写GridLayoutManager，在{@link RecyclerView#setLayoutManager(RecyclerView.LayoutManager)}使用
 * 此类替换{@link GridLayoutManager}，使{@link RecyclerView}能够自使用内容的高度
 * </p>
 */
public class AutoGridLayoutManager extends GridLayoutManager {

    private int measuredWidth = 0;
    private int measuredHeight = 0;
    private View view;

    public AutoGridLayoutManager(Context context, AttributeSet attrs,
                                 int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public AutoGridLayoutManager(Context context, int spanCount) {
        super(context, spanCount);
    }

    public AutoGridLayoutManager(Context context, int spanCount,
                                 int orientation, boolean reverseLayout) {
        super(context, spanCount, orientation, reverseLayout);
    }

    @Override
    public void onMeasure(RecyclerView.Recycler recycler,
                          RecyclerView.State state, int widthSpec, int heightSpec) {
        if (measuredHeight <= 0) {
            int count = state.getItemCount();
            if (count > 0) {

                    view = recycler.getViewForPosition(0);

            }
            if (view != null) {
                measureChild(view, widthSpec, heightSpec);
                measuredWidth = View.MeasureSpec.getSize(widthSpec);
                measuredHeight = view.getMeasuredHeight() * getSpanCount();
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

}