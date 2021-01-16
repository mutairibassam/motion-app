package com.datum.android.motion_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // to make status bar transparent
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }


        /**
         *
         * Def:
         *
         * @motion_layout = xml file that defines all animations for the scene
         *
         * @ConstraintSet = xml tag that acting as a resting state the motion scene will take
         *
         * @Transition = defines the way in which two states will be transformed between -
         *               it accepts some behaviors such as onClick
         *
         * @KeyFramesSets = allow you to define different key points of a transition
         *
         *
         */

        /**
         *
         * How to do:
         *
         * TODO 1: add motion layout dependency
         * TODO 2: create a new motion layout
         * TODO 3: create a new motion scene layout under xml folder
         * TODO 4: link motion scene with motion-layout by adding app:layoutDescription="@xml/activity_main_scene.xml"
         * TODO 4: add tools:showPaths="true" kinda debugging tool
         */
    }
}