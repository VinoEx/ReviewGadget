package com.example.btgadget;

import android.content.Intent;
import android.os.Bundle;

import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;

import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView imageView;
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private ImageView imageView6;
    private ImageView imageView7;
    private ImageView imageView8;
    private ImageView imageView9;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Set up transition animation
        Fade fade = new Fade();
        View decor = requireActivity().getWindow().getDecorView();
        fade.excludeTarget(decor.findViewById(android.R.id.statusBarBackground), true);
        fade.excludeTarget(decor.findViewById(android.R.id.navigationBarBackground), true);

        requireActivity().getWindow().setEnterTransition(fade);
        requireActivity().getWindow().setExitTransition(fade);

        // Find ImageViews in the layout
        imageView1 = view.findViewById(R.id.imageView);
        imageView2 = view.findViewById(R.id.imageView2);
        imageView3 = view.findViewById(R.id.imageView3);
        imageView4 = view.findViewById(R.id.imageView4);
        imageView5 = view.findViewById(R.id.imageView5);
        imageView6 = view.findViewById(R.id.imageView6);
        imageView7 = view.findViewById(R.id.imageView7);
        imageView8 = view.findViewById(R.id.imageView8);
        imageView9 = view.findViewById(R.id.imageView9);

        // Set up click listeners with transition animation
        imageView1.setOnClickListener(v -> navigateToActivityWithTransition(iphone14pm.class, imageView1));
        imageView2.setOnClickListener(v -> navigateToActivityWithTransition(Iphone15pm.class, imageView2));
        imageView3.setOnClickListener(v -> navigateToActivityWithTransition(asusrog7.class, imageView3));
        imageView4.setOnClickListener(v -> navigateToActivityWithTransition(pixel8pro.class, imageView4));
        imageView5.setOnClickListener(v -> navigateToActivityWithTransition(samsungzfold.class, imageView5));
        imageView6.setOnClickListener(v -> navigateToActivityWithTransition(pocof5.class, imageView6));
        imageView7.setOnClickListener(v -> navigateToActivityWithTransition(xiaomi13t.class, imageView7));
        imageView8.setOnClickListener(v -> navigateToActivityWithTransition(samsung23.class, imageView8));
        imageView9.setOnClickListener(v -> navigateToActivityWithTransition(opporeno10.class, imageView9));

        return view;
    }

    // Inside HomeFragment.java
    private void navigateToActivityWithTransition(Class<?> activityClass, ImageView imageView) {
        Intent intent = new Intent(requireContext(), activityClass);

        // Set up transition animation
        String transitionName = ViewCompat.getTransitionName(imageView);
        intent.putExtra("transitionName", transitionName);

        // Start the activity with the specified transition
        startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(requireActivity(), imageView, transitionName).toBundle());
    }

}