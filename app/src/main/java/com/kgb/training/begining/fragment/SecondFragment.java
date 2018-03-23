package com.kgb.training.begining.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.kgb.training.R;

public class SecondFragment extends Fragment {

    public static final String TAG = FirstFragment.class.getSimpleName();
    public static final String REPLACE_FRAGMENT_TAG = "replace";

    private View mRoot;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.second_fragment_layout, container, false);
        Button someAction = (Button)mRoot.findViewById(R.id.replace_button);
        someAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.container, new ReplaceFragment()).addToBackStack(REPLACE_FRAGMENT_TAG).commit();
            }
        });
        return mRoot;
    }
}
