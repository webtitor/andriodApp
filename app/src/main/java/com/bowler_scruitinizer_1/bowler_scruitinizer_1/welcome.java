package com.bowler_scruitinizer_1.bowler_scruitinizer_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class welcome extends AppCompatActivity implements View.OnClickListener {

    LinearLayout l1,l2;
    Animation uptodown;
    Animation downtoup;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        init();
    }

    public void init(){
        l1 = (LinearLayout)findViewById(R.id.layout1);
        l2 = (LinearLayout) findViewById(R.id.layout2);
        uptodown = AnimationUtils.loadAnimation(this , R.anim.uptodown);
        l1.setAnimation(uptodown);

        downtoup = AnimationUtils.loadAnimation(this , R.anim.downtoup);
        l2.setAnimation(downtoup);

        bt = (Button) findViewById(R.id.registeation);
        bt.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent inte = new Intent(this , MainActivity.class);
        startActivity(inte);
    }
}
