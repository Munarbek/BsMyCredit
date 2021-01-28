package com.bssoft.bsmycredit;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.bssoft.bsmycredit.adapter.HistroyPaymentAdapter;
import com.bssoft.bsmycredit.model.HistoryPaymentModel;

import java.util.List;

public class HistoryPaymentActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<HistoryPaymentModel> list;
    private HistroyPaymentAdapter histroyPaymentAdapter;
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_payment);
        recyclerView=findViewById(R.id.rv_history_payment);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
          recyclerView.setLayoutManager(layoutManager);
            list= HistoryPaymentModel.getHPlist();
            histroyPaymentAdapter=new HistroyPaymentAdapter(list);
            recyclerView.setAdapter(histroyPaymentAdapter);
            recyclerView.setHasFixedSize(true);

        actionBar = getSupportActionBar();
        actionBar.setTitle("График начислений");
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
