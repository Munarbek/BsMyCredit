package com.bssoft.bsmycredit.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bssoft.bsmycredit.R;
import com.bssoft.bsmycredit.model.HistoryPaymentModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class HistroyPaymentAdapter  extends  RecyclerView.Adapter<HistroyPaymentAdapter.HistoryViewHolder>{
private  List<HistoryPaymentModel> list;
    private DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    public HistroyPaymentAdapter(List<HistoryPaymentModel> list) {
        this.list=list;
    }

    @NonNull
    @Override
    public HistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.histiry_list_item_layout,parent,false);
        HistoryViewHolder historyViewHolder =new HistoryViewHolder(view);
        return historyViewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull HistoryViewHolder holder, int position) {
        HistoryPaymentModel historyPayment=list.get(position);
        holder.tv1.setText("Остаток после плотежа :"+historyPayment.getP());
        holder.tv2.setText("По основной сумме:"+historyPayment.getP2());
        holder.tv3.setText("По процентам :"+historyPayment.getP3());
        holder.tv4.setText("По плановым платежам :"+historyPayment.getP4());
        holder.tvDate.setText("Дата : "+ df.format(historyPayment.getDate()));


    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    public   class HistoryViewHolder extends RecyclerView.ViewHolder{
        private TextView tv1,tv2,tv3,tv4,tvDate;

        public HistoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1=itemView.findViewById(R.id.textView);
            tv2=itemView.findViewById(R.id.textView2);
            tv3=itemView.findViewById(R.id.textView3);
            tv4=itemView.findViewById(R.id.textView4);
            tvDate=itemView.findViewById(R.id.textViewHistoryDate);
        }
    }

}
