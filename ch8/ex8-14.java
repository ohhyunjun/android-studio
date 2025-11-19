package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
// import androidx.core.app.ActivityCompat; // 이 코드에서는 사용되지 않아 주석 처리해도 됩니다.

// import android.Manifest;
// import android.app.Activity;
// import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
// import android.widget.DatePicker;
import android.widget.EditText;
// import android.widget.Toast;

import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.InputStream;
// import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("C089038 오현준");

        Button btnFilelist;
        final EditText edtFilelist;

        btnFilelist = (Button) findViewById(R.id.btnFilelist);
        // [수정 1] XML의 EditText는 (Button)이 아니라 (EditText)로 캐스팅해야 합니다.
        edtFilelist = (EditText) findViewById(R.id.edtFilelist);

        btnFilelist.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String sysDir = Environment.getRootDirectory().getAbsolutePath();

                // [수정 2] new File[sysDir] (배열 선언 문법) -> new File(sysDir) (객체 생성자)로 변경
                // listFiles()는 해당 경로의 파일 목록을 File 배열로 반환합니다.
                File[] sysFiles = new File(sysDir).listFiles();

                String strFname;

                // [안전 장치 추가] 파일이 없거나 접근 권한 문제로 null일 경우 앱이 죽지 않도록 처리
                if (sysFiles != null) {
                    for (int i = 0; i < sysFiles.length; i++) {
                        if (sysFiles[i].isDirectory() == true)
                            strFname = "<폴더>" + sysFiles[i].toString();
                        else
                            strFname = "<파일>" + sysFiles[i].toString();

                        edtFilelist.setText(edtFilelist.getText() + "\n" + strFname);
                    }
                }
            }
        });
    }
}