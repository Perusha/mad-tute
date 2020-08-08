package com.example.activityone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtview2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.i("Lifecycle", "Oncreate() invoked");

        txtview2 = findViewById(R.id.textView2);
        txtview2.setText(R.string.Msg2);
    }
    protected void onStart() {
        super.onStart();

        Log.i("Lifecycle", "onStart() invoked");
    }
    protected void onRestart() {
        super.onRestart();

        Log.i("Lifecycle", "onRestart() invoked");
    }
    protected void onResume() {
        super.onResume();
    }
}