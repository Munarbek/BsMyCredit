package com.bssoft.bsmycredit.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistoryPaymentModel {
    private  Double p,p2,p3,p4;
    private Date date;

    public HistoryPaymentModel(Double p, Double p2, Double p3, Double p4,Date date) {
        this.p = p;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.date=date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getP() {
        return p;
    }
    public void setP(Double p) {
        this.p = p;
    }

    public Double getP2() {
        return p2;
    }

    public void setP2(Double p2) {
        this.p2 = p2;
    }

    public Double getP3() {
        return p3;
    }

    public void setP3(Double p3) {
        this.p3 = p3;
    }

    public Double getP4() {
        return p4;
    }

    public void setP4(Double p4) {
        this.p4 = p4;
    }

    public  static List<HistoryPaymentModel> getHPlist(){
        List<HistoryPaymentModel> list=new ArrayList<>();
        for(int i=0;i<15;i++){
            double status=Math.random() * 10000 + 1;
            list.add(new HistoryPaymentModel(15000.0,15000.0,15000.0,status,new Date()));
        }
        return list;
    }


}
