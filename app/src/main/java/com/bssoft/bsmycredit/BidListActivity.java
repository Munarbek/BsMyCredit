package com.bssoft.bsmycredit;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.bssoft.bsmycredit.adapter.BidListAdapter;
import com.bssoft.bsmycredit.model.Bid;

public class BidListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private BidListAdapter bidListAdapter;
    private Bid [] bids;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bid_list);

        actionBar = getSupportActionBar();
        actionBar.setTitle("Заявки");
        actionBar.setDisplayHomeAsUpEnabled(true);

       bids=Bid.getBids(15);

        recyclerView=findViewById(R.id.rv_bid_list);
        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        bidListAdapter=new BidListAdapter(bids);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(bidListAdapter);
        recyclerView.setHasFixedSize(true);

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