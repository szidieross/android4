package com.example.android4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        List<Money> list = new ArrayList<>();
        list.add(new Money("EUR", "Euro", 4.41, 4.55));
        list.add(new Money("USD", "Dollar american", 5.41, 1.55));
        list.add(new Money("GBP", "Lira sterlina", 3.41, 2.55));
        list.add(new Money("AUD", "Dolar australian", 2.41, 3.55));
        list.add(new Money("CAD", "Dolar canadian", 1.41, 5.55));
        list.add(new Money("CHF", "Franc elvetian", 8.41, 6.55));
        list.add(new Money("DKK", "Coroana deneya", 3.41, 7.55));
        list.add(new Money("HUF", "Forint maghiar", 7.41, 8.55));

    }
}