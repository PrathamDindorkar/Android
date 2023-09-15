package com.example.listviewwithimages;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        String[] items = {"Camaro ZL1", "Ford Mustang", "Lamborghini Huracan", "MacLaren P1", "Mercedes AMG One"};
        int[] images = {R.drawable.camarozl1, R.drawable.mustang, R.drawable.lambo, R.drawable.maclarenp1, R.drawable.amgone};

        CustomAdapter adapter = new CustomAdapter(this, items, images);
        listView.setAdapter(adapter);
    }
}
