package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.Table;

@Entity

@Table(name = "CompanyRevenue", schema = "ecomDeshApp")
public class CompanyRevenue extends KeyEntity {


    @Column(name = "Revenue_Month", nullable = false)
    private String _month;
    @Column(name = "revenue", nullable = false)
    private double revenue;
    @Column(name = "expense", nullable = false)
    private double expense;
    @Column(name = "margin", nullable = false)
    private double margin;

    public String get_month() {
        return _month;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public void set_month(String _month) {
        this._month = _month;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public double getMargin() {
        return margin;
    }

    public void setMargin(double margin) {
        this.margin = margin;
    }
}
