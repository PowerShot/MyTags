package com.example.mytags;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView staggeredRv;
    private StaggeredRecyclerAdapter adapter;
    private StaggeredGridLayoutManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        staggeredRv = findViewById(R.id.staggered_rv);
        manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        staggeredRv.setLayoutManager(manager);

        // liste des images
        List<Row> lst = new ArrayList<>();
        lst.add(new Row(R.drawable.arc));
        lst.add(new Row(R.drawable.ballebb));
        lst.add(new Row(R.drawable.ballfitness));
        lst.add(new Row(R.drawable.ballgolf));
        lst.add(new Row(R.drawable.ballonbasket));
        lst.add(new Row(R.drawable.ballonfoot));
        lst.add(new Row(R.drawable.baseball_equipement));
        lst.add(new Row(R.drawable.basket));
        lst.add(new Row(R.drawable.batteballebb));
        lst.add(new Row(R.drawable.boxe));
        lst.add(new Row(R.drawable.btennis));
        lst.add(new Row(R.drawable.clubgolf));
        lst.add(new Row(R.drawable.image_test));
        lst.add(new Row(R.drawable.kayak));
        lst.add(new Row(R.drawable.planchesurf));
        lst.add(new Row(R.drawable.skate));
        lst.add(new Row(R.drawable.skate2));
        lst.add(new Row(R.drawable.tenufoot));
        lst.add(new Row(R.drawable.velocourse1));
        lst.add(new Row(R.drawable.velocourse2));
        lst.add(new Row(R.drawable.veloeli));

        adapter = new StaggeredRecyclerAdapter(this, lst);
        staggeredRv.setAdapter(adapter);

    }
}