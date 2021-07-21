package com.quintus.labs.grocerystore.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VoucherListData {
   
    @SerializedName("total_pages")
   
    private Integer totalPages;
    @SerializedName("total_items")
   
    private Integer totalItems;
    @SerializedName("page_size")
   
    private Object pageSize;
    @SerializedName("results")
   
    private List<VoucherList> results = null;


    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public Object getPageSize() {
        return pageSize;
    }

    public void setPageSize(Object pageSize) {
        this.pageSize = pageSize;
    }

    public List<VoucherList> getResults() {
        return results;
    }

    public void setResults(List<VoucherList> results) {
        this.results = results;
    }

   

}


