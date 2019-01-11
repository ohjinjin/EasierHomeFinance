package com.example.easierhomefinance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView myListView;
    DBHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.d("ACTIVITY_LC","onCreate 호출됨");

        mydb = new DBHelper(this);

        //임의로 데이터 삽입
        mydb.deleteHistory(1);
        mydb.insertHistory("20190111", 1, 0, 0, "5000");

        ArrayList arrayList = mydb.getAllHistory();

        Button button = (Button)findViewById(R.id.newActivity);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                //Bundle bundle = new Bundle();
                //bundle.putInt("id",0);
                Intent intent = new Intent(getApplicationContext(),SubActivity.class);
                //intent.putExtras(bundle);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"내역조회 화면으로 이동합니다 :-)",Toast.LENGTH_SHORT).show();
            }
        });



    }
}
