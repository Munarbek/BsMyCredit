package com.bssoft.bsmycredit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bssoft.bsmycredit.R;
import com.bssoft.bsmycredit.model.Bid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class BidListAdapter extends  RecyclerView.Adapter<BidListAdapter.BidViewHolder>{
    private Bid [] bids;

    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    public BidListAdapter(Bid[] bids) {
        this.bids=bids;
    }
    @NonNull
    @Override
    public BidViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.bid_item_list_layout,parent,false);
        BidViewHolder bidViewHolder=new BidViewHolder(view);

        return bidViewHolder;
    }
    @Override

    public void onBindViewHolder(@NonNull BidViewHolder holder, int position) {
        holder.textViewNumberBid.setText("Номер заявки : "+bids[position].getCount());
      holder.textViewDateBid.setText("Дата : "+df.format(bids[position].getDate()));
        if(bids[position].getStatus()%2==0){
            holder.imageViewChekbox.setImageResource(R.drawable.ic_baseline_check_box_24);
        }
        else if(bids[position].getStatus()%3==0){
            holder.imageViewChekbox.setImageResource(R.drawable.ic_baseline_error_24);
        }



    }
    @Override
    public int getItemCount() {
        return bids.length;
    }
    public   class BidViewHolder extends RecyclerView.ViewHolder{
        private TextView textViewNumberBid;
        private ImageView imageViewChekbox;
        private TextView textViewDateBid;
        private CardView cardView;

        public BidViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewDateBid=itemView.findViewById(R.id.textViewBidData);
            textViewNumberBid=itemView.findViewById(R.id.textViewBidNumber);
            imageViewChekbox=itemView.findViewById(R.id.imageCheckBox);
            cardView =itemView.findViewById(R.id.cardViewBid);
        }
        public void bind(Bid position) {
            /*textViewNumberBid.setText("Status: :" +position.getStatus());
            textViewDateBid.setText(df.format(position.getDate()));*/
        }
    }
}
