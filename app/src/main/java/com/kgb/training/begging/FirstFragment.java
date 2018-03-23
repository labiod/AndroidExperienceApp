package com.kgb.training.begging;

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

public class FirstFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.first_fragment_layout, container, false);
        Button someAction = (Button)root.findViewById(R.id.some_action);
        someAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Some action", Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
}
