package com.example.demo.entities;

public class ProductCategory {

    private String categoryName;
    private int percentage;
    private boolean bestCatgeory;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public boolean isBestCatgeory() {
        return bestCatgeory;
    }

    public void setBestCatgeory(boolean bestCatgeory) {
        this.bestCatgeory = bestCatgeory;
    }

}
