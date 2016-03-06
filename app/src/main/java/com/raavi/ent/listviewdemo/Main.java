package com.raavi.ent.listviewdemo;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.List;

public class Main extends ListActivity {

    String [] cars = {
            "toyota",
            "benz",
            "ferrari",
            "lamborghini",
            "ford",
            "land-rover",
            "isuzu"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cars));

    }
}
