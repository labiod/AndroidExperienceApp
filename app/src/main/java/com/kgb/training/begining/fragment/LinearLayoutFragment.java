package com.kgb.training.begining.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.kgb.training.R;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>.
 * Date: 3/23/18
 */

public class LinearLayoutFragment extends Fragment {

    public static final String TAG = LinearLayoutFragment.class.getSimpleName();

    private View mRoot;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.linear_layout_fragment, container, false);
        Button someAction = (Button)mRoot.findViewById(R.id.some_action);
        someAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Some action", Toast.LENGTH_SHORT).show();
            }
        });
        return mRoot;
    }
}
