package com.fanhl.lottiedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    private LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
    }

    private void assignViews() {
        animationView = ((LottieAnimationView) findViewById(R.id.animation_view));
    }

    @Override protected void onResume() {
        super.onResume();
//        if (!animationView.isAnimating()) {
//            animationView.playAnimation();
//        }
    }

    @Override protected void onPause() {
        super.onPause();
//        animationView.pauseAnimation();
    }
}
