package com.vaibhavpalande.newsmaster.Models;

import java.util.List;

public class Headlines {

    @com.google.gson.annotations.SerializedName("status")
    private String status;

    @com.google.gson.annotations.SerializedName("totalresults")
    private String totalresults;

    @com.google.gson.annotations.SerializedName("articles")
    private List<Articles> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalresults() {
        return totalresults;
    }

    public void setTotalresults(String totalresults) {
        this.totalresults = totalresults;
    }

    public List<Articles> getArticles() {
        return articles;
    }

    public void setArticles(List<Articles> articles) {
        this.articles = articles;
    }
}
