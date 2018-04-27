package com.kgb.training.begining.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.kgb.training.R;

public class RelativeLayoutFragment extends Fragment {

    public static final String TAG = LinearLayoutFragment.class.getSimpleName();
    public static final String REPLACE_FRAGMENT_TAG = "replace";

    private View mRoot;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.relative_layout_fragment, container, false);
        return mRoot;
    }
}
