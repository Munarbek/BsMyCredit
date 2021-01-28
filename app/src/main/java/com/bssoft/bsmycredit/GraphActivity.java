package com.bssoft.bsmycredit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.bssoft.bsmycredit.adapter.GraphListAdapter;
import com.bssoft.bsmycredit.model.GraphModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GraphActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private GraphListAdapter graphListAdapter;
    private ActionBar actionBar;
    private GraphModel graphModels[];
    private DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    private Date dateobj = new Date();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        graphModels = GraphModel.getModel();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView = findViewById(R.id.rv_list);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        graphListAdapter = new GraphListAdapter(graphModels);
        recyclerView.setAdapter(graphListAdapter);

        actionBar = getSupportActionBar();
        actionBar.setTitle("История начислений и погашений");
        actionBar.setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}