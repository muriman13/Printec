package com.printec.printecTask.Wrapper;

import com.printec.printecTask.Dto.CatBreed;

import java.util.List;

public class CatBreedResponseWrapper {
    private int current_page;
    private List<CatBreed> data;
    private String first_page_url;
    private int from;
    private int last_page;
    private String last_page_url;
    public int getCurrentPage() { return current_page; }
    public void setCurrentPage(int current_page) { this.current_page = current_page; }
    public List<CatBreed> getData() { return data; }
    public void setData(List<CatBreed> data) { this.data = data; }
}
