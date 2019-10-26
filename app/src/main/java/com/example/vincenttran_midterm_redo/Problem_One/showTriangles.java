//Vincent Tran 891036956

package com.example.vincenttran_midterm_redo.Problem_One;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.vincenttran_midterm_redo.R;

public class showTriangles extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set Layout params
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout.LayoutParams paramsTri = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        root.setVerticalGravity(Gravity.CENTER_VERTICAL);
        root.setLayoutParams(params);

        //Get sent intent
        String triangleCount = getIntent().getStringExtra("triangleCount");
        Integer triangleUse = Integer.parseInt(triangleCount);

        //Make vars for use
        TextView tv;
        LinearLayout layer;

        //For loop to create a linearLayout and populate
        for(int i = 0; i<triangleUse; i++){
            layer = new LinearLayout(this);
            layer.setLayoutParams(paramsTri);
            layer.setHorizontalGravity(Gravity.CENTER_HORIZONTAL);
            for(int j = 0; j<i+1; j++){
                tv = new TextView(this);
                tv.setBackgroundColor(Color.BLUE);
                tv.setText("|     |");
                tv.setTextColor(Color.WHITE);
                tv.setTextSize(36);
                layer.addView(tv);}
            root.addView(layer);
        }



        setContentView(root);
    }
}
