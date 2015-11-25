package com.bignerdranch.android.dragdraw;

import android.graphics.PointF;

/**
 * Created by cwh on 11/25/15.
 */
public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin){
        mOrigin = origin;
        mCurrent = origin;
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public void setCurrent(PointF mCurrent) {
        this.mCurrent = mCurrent;
    }

    public PointF getOrigin() {
        return mOrigin;
    }
}
