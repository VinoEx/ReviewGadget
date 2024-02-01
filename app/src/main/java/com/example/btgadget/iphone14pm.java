package com.example.btgadget;

import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

public class iphone14pm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone14pm);

        // Retrieve ImageView
        ImageView imageView = findViewById(R.id.imageView);

        // Apply transition
        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        fade.excludeTarget(android.R.id.statusBarBackground, true);
        fade.excludeTarget(android.R.id.navigationBarBackground, true);

        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

        // Set transition name for shared element
        ViewCompat.setTransitionName(imageView, "transitionIphone14pm");
    }
}
