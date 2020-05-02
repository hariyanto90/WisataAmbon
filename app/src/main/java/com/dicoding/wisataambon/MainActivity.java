package com.dicoding.wisataambon;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.dicoding.wisataambon.adapter.ListTourAdapter;
import com.dicoding.wisataambon.model.Tour;
import com.dicoding.wisataambon.model.ToursData;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTours;
    private ArrayList<Tour> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvTours = findViewById(R.id.rv_tours);
        rvTours.setHasFixedSize(true);


        list.addAll(ToursData.getListData());
        showRecyclerList();
    }


    private void showRecyclerList() {
        rvTours.setLayoutManager(new LinearLayoutManager(this));
        ListTourAdapter listTourAdapter = new ListTourAdapter(list);
        rvTours.setAdapter(listTourAdapter);

        listTourAdapter.setOnItemClickCallback(new ListTourAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Tour data) {
                showSelectedTour(data);
            }
        });

    }


    private void showSelectedTour(Tour tour) {
        // membuat onClick intent Explisit pada Detail Activity

        Intent moveDetail = new Intent(MainActivity.this, DetailActivity.class);
        moveDetail.putExtra(String.valueOf(DetailActivity.EXTRA_ITEM_PHOTO), tour.getPhoto());
        moveDetail.putExtra(DetailActivity.EXTRA_ITEM_NAME, tour.getName());
        moveDetail.putExtra(DetailActivity.EXTRA_ITEM_LOCATION, tour.getLocation());
        moveDetail.putExtra(DetailActivity.EXTRA_ITEM_DETAIL, tour.getDetail());

        startActivity(moveDetail);

    }

    @Override //membuat icon menu di Action Bar
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.about, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        // membuat onClick intent explisit menu ke AboutActivity

        switch (item.getItemId()) {
            case R.id.action_about:
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                intent.putExtra(AboutActivity.EXTRA_NAMA, "Anton Al'Buthuuni");
                intent.putExtra(AboutActivity.EXTRA_EMAIL, "anton.ambon90@gmail.com");


                startActivity(intent);

                return true;

        }
        return false;
    }

}
