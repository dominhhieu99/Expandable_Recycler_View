package com.dohieu19999.expandablerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Versions> versionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        serRecyclerView();
        initData();
    }

    private void initData() {
        VersionsAdapter versionsAdapter = new VersionsAdapter(versionsList);
        recyclerView.setAdapter(versionsAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void serRecyclerView() {
        versionsList = new ArrayList<>();
        versionsList.add(new Versions("Android 10", "version 10", "API 29", "Description"));
        versionsList.add(new Versions("Android 9", "version 9", "API 28", "Description"));
        versionsList.add(new Versions("Android 8", "version 8", "API 27", "Description"));
        versionsList.add(new Versions("Android 7", "version 7", "API 26", "Description"));
        versionsList.add(new Versions("Android 6", "version 6", "API 25", "Description"));
        versionsList.add(new Versions("Android 5", "version 5", "API 24", "Description"));


    }
}
