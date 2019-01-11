package com.example.easierhomefinance;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity implements View.OnClickListener {

    private Animation fab_open, fab_close;
    private Boolean isFabOpen = false;
    private FloatingActionButton fab, fab1, fab2,fab3;
    private TextView txt1,txt2,txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        fab3 = (FloatingActionButton) findViewById(R.id.fab3);
        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);
        fab.setOnClickListener(this);
        fab1.setOnClickListener(this);
        fab2.setOnClickListener(this);
        fab3.setOnClickListener(this);
        /*Toast.makeText(this, "testtttttt", Toast.LENGTH_SHORT).show();
        Log.e(this.getClass().getName(),"testttttttttttttttttttttttttttttttttttttt");*/
        /*Log.d(this.getClass().getName(),"testttttttttttttt");
        Log.i(this.getClass().getName(),"testttttttttttttt");
        Log.w(this.getClass().getName(),"testttttttttttttt");Log.e(this.getClass().getName(),"testttttttttttttttttttttttttttttttttttttt");
*/


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        /*Log.d(this.getClass().getName(),"tttttttttttttttttestt");
        Log.i(this.getClass().getName(),"tttttttttttttttttestt");
        Log.w(this.getClass().getName(),"tttttttttttttttttestt");Log.e(this.getClass().getName(),"tttttttttttttttttestt");*/
        switch (id) {
            case R.id.fab:
                //Log.e(this.getClass().getName(),"0000000000000000000000000000000000000000 호출됨");
                anim();
                //Toast.makeText(this, "check", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fab1:
                //Log.e(this.getClass().getName(),"1111111111111111111111111111111111111111 호출됨");
                anim();
                //Toast.makeText(this, "Button1", Toast.LENGTH_SHORT).show();
                new AlertDialog.Builder(this)
                        .setTitle("삭제 확인 창")
                        .setMessage("정말로 삭제하시겠습니까?")
                        .setIcon(android.R.drawable.ic_menu_delete)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                // 확인시 처리 로직
                                Toast.makeText(SubActivity.this, "삭제를 완료했습니다.", Toast.LENGTH_SHORT).show();
                                //finish();
                            }})
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                // 취소시 처리 로직
                                Toast.makeText(SubActivity.this, "취소하였습니다.", Toast.LENGTH_SHORT).show();
                            }})
                        .show();

                break;
            case R.id.fab2:
                //Log.e(this.getClass().getName(),"2222222222222222222222222222222222222222 호출됨");
                anim();
                //Toast.makeText(this, "Button2", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(getApplicationContext(),InsertActivity.class);
                startActivity(intent1);
                Toast.makeText(getApplicationContext(),"수정입력 화면으로 이동합니다 :-)",Toast.LENGTH_SHORT).show();
                break;
            case R.id.fab3:
                //Log.e(this.getClass().getName(),"3333333333333333333333333333333333333333 호출됨");
                anim();
                //Toast.makeText(this, "Button3", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(getApplicationContext(),InsertActivity.class);
                startActivity(intent2);
                Toast.makeText(getApplicationContext(),"신규입력 화면으로 이동합니다 :-)",Toast.LENGTH_SHORT).show();
                break;
        }


    }

    public void anim() {

        if (isFabOpen) {
            fab1.startAnimation(fab_close);
            fab2.startAnimation(fab_close);
            fab3.startAnimation(fab_close);
            txt1.startAnimation(fab_close);
            txt2.startAnimation(fab_close);
            txt3.startAnimation(fab_close);
            fab1.setClickable(false);
            fab2.setClickable(false);
            fab3.setClickable(false);
            isFabOpen = false;
        } else {
            fab1.startAnimation(fab_open);
            fab2.startAnimation(fab_open);
            fab3.startAnimation(fab_open);
            txt1.startAnimation(fab_open);
            txt2.startAnimation(fab_open);
            txt3.startAnimation(fab_open);
            fab1.setClickable(true);
            fab2.setClickable(true);
            fab3.setClickable(true);
            isFabOpen = true;
        }
    }
}
        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
*/