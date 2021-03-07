package com.example.td_planete;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener{

    MyRecyclerViewAdapter adapter;

    private String nm;
    private String sup;
    private String rot;
    private String grav;
    private String temp;

    private String val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<String> PlaneteNames = new ArrayList<>();
        PlaneteNames.add("Petit pain");
        PlaneteNames.add("Croissant");
        PlaneteNames.add("Tiramisu");
        PlaneteNames.add("Quatre quart");
        PlaneteNames.add("Brownie");

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvPlanete);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, PlaneteNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query)
            {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText)
            {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();

       // val = adapter.getItem(position).getText;

        switch (position){
            case 0:
                Petit_pain();
                break;

            case 1:
                Croissant();
                break;

            case 2:
                Tiramisu();
                break;

            case 3:
                Quatrequarts();
                break;

            case 4:
                Brownie();
                break;
        }
    }


    public void Petit_pain()
    {
        nm = getResources().getString(R.string.PP_Nom);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message_nm", nm);

        sup = getResources().getString(R.string.PP_sup);
        intent.putExtra("message_sup", sup);

        rot = getResources().getString(R.string.PP_rot);
        intent.putExtra("message_rot", rot);


        startActivity(intent);
    }

    public void Croissant()
    {
        nm = getResources().getString(R.string.Cr_Nom);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message_nm", nm);

        sup = getResources().getString(R.string.Cr_sup);
        intent.putExtra("message_sup", sup);

        rot = getResources().getString(R.string.Cr_rot);
        intent.putExtra("message_rot", rot);


        startActivity(intent);
    }

    public void Tiramisu()
    {
        nm = getResources().getString(R.string.Ti_Nom);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message_nm", nm);

        sup = getResources().getString(R.string.Ti_sup);
        intent.putExtra("message_sup", sup);

        rot = getResources().getString(R.string.Ti_rot);
        intent.putExtra("message_rot", rot);

        startActivity(intent);
    }

    public void Quatrequarts()
    {
        nm = getResources().getString(R.string.QQ_Nom);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message_nm", nm);

        sup = getResources().getString(R.string.QQ_sup);
        intent.putExtra("message_sup", sup);

        rot = getResources().getString(R.string.QQ_rot);
        intent.putExtra("message_rot", rot);


        startActivity(intent);
    }

    public void Brownie()
    {
        nm = getResources().getString(R.string.Br_Nom);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message_nm", nm);

        sup = getResources().getString(R.string.Br_sup);
        intent.putExtra("message_sup", sup);

        rot = getResources().getString(R.string.Br_rot);
        intent.putExtra("message_rot", rot);

        startActivity(intent);
    }



/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query)
            {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText)
            {
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}