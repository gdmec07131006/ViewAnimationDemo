package cn.edu.gdmec.c07131006.animationdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView mytv;
	Button mybtn,translate,scale,rotate,alli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytv = (TextView) findViewById(R.id.textView1);
        mybtn = (Button) findViewById(R.id.button1);
        translate = (Button) findViewById(R.id.button2);
        scale = (Button) findViewById(R.id.button3);
        rotate = (Button) findViewById(R.id.button4);
        alli = (Button) findViewById(R.id.button5);
        mybtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha_animation);
				mytv.startAnimation(animation);
			}
        	
        });
        translate.setOnClickListener(new OnClickListener(){

    			@Override
    			public void onClick(View v) {
    				Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate_animation);
    				mytv.startAnimation(animation);
    			}
            	
            });
        scale.setOnClickListener(new OnClickListener(){

    			@Override
    			public void onClick(View v) {
    				Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale_animation);
    				mytv.startAnimation(animation);
    			}
            	
            });
        rotate.setOnClickListener(new OnClickListener(){

    			@Override
    			public void onClick(View v) {
    				Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate_animation);
    				mytv.startAnimation(animation);
    			}
            	
            });
        alli.setOnClickListener(new OnClickListener(){

    			@Override
    			public void onClick(View v) {
    				Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.all_animation);
    				mytv.startAnimation(animation);
    			}
            	
            });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
