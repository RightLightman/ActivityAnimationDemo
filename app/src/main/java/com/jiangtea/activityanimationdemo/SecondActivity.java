package com.jiangtea.activityanimationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btn =(Button) findViewById(R.id.second_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this,MainActivity.class));
                SecondActivity.this.finish();

                //overridePendingTransition(enterAnim 进入时的动画, exitAnim 出去时的动画);
                overridePendingTransition(R.anim.activity_left_enter, R.anim.activity_right_exit);
            }
        });
    }
}
