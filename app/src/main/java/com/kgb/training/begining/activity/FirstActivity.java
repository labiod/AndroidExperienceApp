package com.kgb.training.begining.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.kgb.training.R;
import com.kgb.training.begining.fragment.LinearLayoutFragment;
import com.kgb.training.begining.fragment.ListViewFragment;
import com.kgb.training.begining.fragment.RelativeLayoutFragment;

public class FirstActivity extends Activity {

    public static final String TAG = FirstActivity.class.getSimpleName();

    private FrameLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        mContainer = (FrameLayout) findViewById(R.id.container);
        Button relativeLayout = (Button) findViewById(R.id.relative_layout_fragment);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container, new RelativeLayoutFragment()).commit();
            }
        });
        Button linearLayout = (Button) findViewById(R.id.linear_layout_fragment);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container, new LinearLayoutFragment()).commit();
            }
        });
        Button listLayout = (Button) findViewById(R.id.list_fragment);
        listLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container, new ListViewFragment()).commit();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.first_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                Intent intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.show_info:
                try {
                    PackageInfo info = getPackageManager().getPackageInfo(getPackageName(), 0);
                    Toast.makeText(this, "App version: " + info.versionName, Toast.LENGTH_SHORT).show();
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e(TAG, "onOptionsItemSelected: ", e);
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
