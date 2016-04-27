package com.rock.hello;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/**
 * Created by Rock on 16/4/27.
 */
public class ExpandVideoView extends VideoView {

    public ExpandVideoView(Context context) {
        super(context);
    }

    public ExpandVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ExpandVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int widthSpecSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightSpecSize = MeasureSpec.getSize(heightMeasureSpec);

        setMeasuredDimension(widthSpecSize, heightSpecSize);
    }
}
