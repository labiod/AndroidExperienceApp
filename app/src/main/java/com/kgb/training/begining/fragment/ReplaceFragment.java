package com.kgb.training.begining.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.kgb.training.R;

public class ReplaceFragment extends Fragment {

    public static final String TAG = FirstFragment.class.getSimpleName();

    private View mRoot;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.replace_fragment_layout, container, false);
        Button someAction = (Button)mRoot.findViewById(R.id.some_action2);
        someAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Some action 2", Toast.LENGTH_SHORT).show();
            }
        });
        return mRoot;
    }
}
