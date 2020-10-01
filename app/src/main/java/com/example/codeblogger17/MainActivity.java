package com.example.codeblogger17;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.app.Activity;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends Activity {
    TextView textIK;
    Animation animation, animation2,animation3;
    ImageView imageView, imageView3;
    GifImageView imageView2;
    int count = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
         WindowManager.LayoutParams.FLAG_FULLSCREEN);
        textIK = (TextView) findViewById(R.id.text1K);
        imageView = (ImageView) findViewById(R.id.image);
        imageView3 = (ImageView) findViewById(R.id.image3);
        imageView2 = (GifImageView) findViewById(R.id.image2);
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        animation3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move2);

        animation.setRepeatCount(Animation.INFINITE);
        animation2.setRepeatCount(Animation.INFINITE);
        animation3.setRepeatCount(Animation.INFINITE);

        for (int i = 0; i < count; i++) {
            textIK.startAnimation(animation);
            imageView.startAnimation(animation2);
            imageView3.startAnimation(animation3);
        }

    }
}