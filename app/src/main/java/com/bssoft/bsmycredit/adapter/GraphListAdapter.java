package com.bssoft.bsmycredit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bssoft.bsmycredit.R;
import com.bssoft.bsmycredit.model.GraphModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class GraphListAdapter extends RecyclerView.Adapter<GraphListAdapter.GraphViewHolder> {
      //  private   static int viewHolderCount=0;
      //   private  int numberItems;
      DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    private GraphModel graphModels[];
    public GraphListAdapter (GraphModel grahpModels[]){
      this.graphModels=grahpModels;
    }

        @NonNull
    @Override
    public GraphViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.graph_item_list_layout;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForListItem, parent, false);
        GraphViewHolder viewHolder = new GraphViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull GraphViewHolder holder, int position) {
        holder.bind(graphModels[position]);

    }

    @Override
    public int getItemCount() {
        return graphModels.length;
    }

    class GraphViewHolder extends RecyclerView.ViewHolder {
        private TextView itemTextViewDates;
        private TextView itemTextViewZachisleno;
        private TextView itemTextViewPogaseno;

        public GraphViewHolder(@NonNull View itemView) {
            super(itemView);
            itemTextViewDates = itemView.findViewById(R.id.itemTextviewDate);
            itemTextViewZachisleno = itemView.findViewById(R.id.textviewZachisleno);
            itemTextViewPogaseno = itemView.findViewById(R.id.textviewPogasheno);
        }

        void bind(GraphModel graphModel) {
            itemTextViewDates.setText("Дата : "+df.format(graphModel.getDates()));
            itemTextViewPogaseno.setText("Погашено : "+String.valueOf(graphModel.getSumma()));
            itemTextViewZachisleno.setText("Зачислено : "+"--");
        }
    }

}
