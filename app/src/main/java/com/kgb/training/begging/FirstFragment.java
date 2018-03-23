package com.kgb.training.begging;

import android.app.Fragment;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    public static final String TAG = FirstFragment.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

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

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.first_fragment_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.show_info:
                try {
                    PackageInfo info = getActivity().getPackageManager().getPackageInfo(getActivity().getPackageName(), 0);
                    Toast.makeText(getActivity(), "version: " + info.versionName, Toast.LENGTH_SHORT).show();
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e(TAG, "onOptionsItemSelected: ", e);
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
