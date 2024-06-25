package com.example.spacex_api.models.Test;

import java.util.ArrayList;

public class ListUsersResponse {
    public int page;
    public int per_page;
    public int total;
    public int total_pages;
    public ArrayList<UserResponse> data;
    public Support support;

    public ListUsersResponse(int page, int per_page, int total, int total_pages, ArrayList<UserResponse> data, Support support) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_pages = total_pages;
        this.data = data;
        this.support = support;
    }

    public int getPage() {
        return page;
    }

    public int getPer_page() {
        return per_page;
    }

    public int getTotal() {
        return total;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public ArrayList<UserResponse> getData() {
        return data;
    }

    public Support getSupport() {
        return support;
    }
}