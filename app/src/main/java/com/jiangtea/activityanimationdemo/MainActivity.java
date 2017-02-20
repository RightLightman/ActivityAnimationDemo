package com.jiangtea.activityanimationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =(Button) findViewById(R.id.main_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                MainActivity.this.finish();

                //overridePendingTransition(enterAnim 进入时的动画, exitAnim 出去时的动画);
                overridePendingTransition(R.anim.activity_right_enter, R.anim.activity_left_exit);
            }
        });
    }
}
