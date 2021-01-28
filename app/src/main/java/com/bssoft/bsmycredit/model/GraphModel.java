package com.bssoft.bsmycredit.model;

import java.util.Date;
import java.util.List;

public class GraphModel {

    private static double  summa;
    private Date dates;

    public GraphModel(double summa, Date dates) {
        this.summa = summa;
        this.dates = dates;
    }

    public double getSumma() {
        return summa;
    }

    public void setSumma(double summa) {
        this.summa = summa;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }
    public static GraphModel[] getModel(){
         GraphModel[] graphModels=new GraphModel[20];
        for(int i=0;i<20;i++){
            graphModels[i]=new GraphModel(15000,new Date());
        }
        return graphModels;
    }
}
