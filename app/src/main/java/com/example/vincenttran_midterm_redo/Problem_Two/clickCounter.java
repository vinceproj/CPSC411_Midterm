//Vincent Tran 891036956

package com.example.vincenttran_midterm_redo.Problem_Two;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.vincenttran_midterm_redo.R;

import java.util.ArrayList;

public class clickCounter extends Activity {

    //Set vars for use
    protected ListView mListView;
    private int counterOne = 0;
    private int counterTwo = 0;
    private int counterThree = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set basic view
        setContentView(R.layout.click_counter_lv);
        mListView = (ListView) findViewById(R.id.click_counter_lv);

        //Create an ArrayList to hold strings
       final ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Click Counter");
        arrayList.add("0");
        arrayList.add("0");
        arrayList.add("0");

        //Create an Adapter for the ArrayList for functionality; Use R.layout.list_item as custom item for adapter use
        final ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.list_item, arrayList);
        mListView.setAdapter(arrayAdapter);

        //Set event listener for arrayList items
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Get index of arrayList item; Increase var counter; set to new var value; refresh screen
                if(position == 1){
                    counterOne++;
                    arrayList.set(1, new String(Integer.toString(counterOne)));
                    arrayAdapter.notifyDataSetChanged();
                }
                if(position == 2){
                    counterTwo++;
                    arrayList.set(2, new String(Integer.toString(counterTwo)));
                    arrayAdapter.notifyDataSetChanged();
                }
                if(position == 3){
                    counterThree++;
                    arrayList.set(3, new String(Integer.toString(counterThree)));
                    arrayAdapter.notifyDataSetChanged();
                }
            }
        });


    }
}
