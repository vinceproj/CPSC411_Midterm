//Vincent Tran 891036956

package com.example.vincenttran_midterm_redo.Problem_One;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.vincenttran_midterm_redo.R;

public class getTriangles extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set content view
        setContentView(R.layout.get_triangles);

        //Set button and set event listener
        //Choose intent for nav; Get value from EditText; Send value to next screen; Move screen
        Button button = (Button)findViewById(R.id.triangle_button_id);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getTriangles.this, showTriangles.class);
                EditText edit = (EditText) findViewById(R.id.triangle_count_id);
                String result = edit.getText().toString();
                intent.putExtra("triangleCount", result);
                startActivity(intent);
            }
        });

    }
}
