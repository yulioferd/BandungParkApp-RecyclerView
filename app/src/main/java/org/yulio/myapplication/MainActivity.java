package org.yulio.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<DataClass> list = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_park);
        recyclerView.setHasFixedSize(true);
        list.addAll(DataDescription.getListData());
        listRecycler();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.menu_about:
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                break;
        }
    }
    private void listRecycler(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DataAdapter dataAdapter = new DataAdapter(MainActivity.this, list);
        recyclerView.setAdapter(dataAdapter);
        dataAdapter.setOnItemClickCallback(new DataAdapter.DataViewHolder.OnItemClickCallback(){
            @Override
            public void onItemClicked(DataClass dataClass) {
                showData(dataClass);
            }
        });
    }
    private void showData(DataClass dataClass){
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_PHOTO, dataClass.getPhoto());
        intent.putExtra(DetailActivity.EXTRA_TITLE, dataClass.getTitle());
        intent.putExtra(DetailActivity.EXTRA_DESCRIPTION, dataClass.getDescription());
        startActivity(intent);
    }
}
