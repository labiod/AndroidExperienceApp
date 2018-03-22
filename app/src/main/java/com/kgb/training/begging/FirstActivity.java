package com.kgb.training.begging;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.kgb.training.R;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button someAction = (Button)findViewById(R.id.some_action);
        someAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FirstActivity.this, "Some action", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
