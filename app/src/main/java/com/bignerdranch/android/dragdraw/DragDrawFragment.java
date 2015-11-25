package com.bignerdranch.android.dragdraw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cwh on 11/24/15.
 */
public class DragDrawFragment extends Fragment{
    public static DragDrawFragment newInstance(){
        return new DragDrawFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_drag_draw, container, false);
        return v;
    }
}
