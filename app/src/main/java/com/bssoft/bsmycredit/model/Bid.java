package com.bssoft.bsmycredit.model;

import java.util.Date;

public class Bid {
    public    int count=0;
    private  int status;
    private Date date;
    private  Double summ;

    public Bid(int count, int status, Date date, Double summ) {
        this.count = count;
        this.status = status;
        this.date = date;
        this.summ = summ;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Double getSumm() {
        return summ;
    }
    public void setSumm(Double summ) {
        this.summ = summ;
    }
    public static Bid [] getBids(int quantity){
        int countBid=0;
        Bid myBids[]=new Bid[quantity];
        for (int i=0;i<quantity;i++)
            {
                int status=(int)(Math.random() * 3) + 1;
                myBids[i]=new Bid(i,status,new Date(),15000.0);
            }
            return  myBids;
    }
}
