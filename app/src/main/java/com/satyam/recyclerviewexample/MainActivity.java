package com.satyam.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    RecyclerView recycler_first;
    RecyclerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler_first= (RecyclerView) findViewById(R.id.recycler_first);
        adapter = new RecyclerAdapter();
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recycler_first.setLayoutManager(mLayoutManager);
        recycler_first.setItemAnimator(new DefaultItemAnimator());
        recycler_first.addItemDecoration(new DividerItemDecoration(getApplicationContext(), null));
        recycler_first.setAdapter(adapter);
        recycler_first.addOnItemTouchListener(new RecyclerTouchListener(this, recycler_first, new RecyclerTouchListener.ClickListener() {
                    @Override
                    public void onClick(View view, int position) {
                        Toast.makeText(getApplicationContext(), "Click=" + position, Toast.LENGTH_SHORT).show();
                    }
                    @Override
                    public void onLongClick(View view, final int position) {
                        Toast.makeText(getApplicationContext(), "LongClick=" + position, Toast.LENGTH_SHORT).show();
                    }
                })
        );
    }
}
