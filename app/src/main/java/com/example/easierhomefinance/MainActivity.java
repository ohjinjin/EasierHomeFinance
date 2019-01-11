package com.example.easierhomefinance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.d("ACTIVITY_LC","onCreate 호출됨");


        Button button = (Button)findViewById(R.id.newActivity);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),SubActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"내역조회 화면으로 이동합니다 :-)",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
