package com.example.a11week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("액티비티 테스트: C089038오현준");
        android.util.Log.i("액티비티 테스트", "onCreate()");

        Button btnDial = (Button) findViewById(R.id.btnDial);
        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:01012345678");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });

        Button btnFinish = (Button) findViewById(R.id.btnFinish);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        android.util.Log.i("액티비티 테스트", "onDestroy()");
    }
    protected void onPause(){
        super.onPause();
        android.util.Log.i("액티비티 테스트", "onDestroy()");
    }
    protected void onRestart(){
        super.onRestart();
        android.util.Log.i("액티비티 테스트", "onDestroy()");
    }
    protected void onResume(){
        super.onResume();
        android.util.Log.i("액티비티 테스트", "onDestroy()");
    }
    protected void onStart(){
        super.onStart();
        android.util.Log.i("액티비티 테스트", "onDestroy()");
    }
    protected void onStop(){
        super.onStop();
        android.util.Log.i("액티비티 테스트", "onDestroy()");
    }

}