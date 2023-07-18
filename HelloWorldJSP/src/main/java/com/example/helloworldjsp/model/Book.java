package com.example.helloworldjsp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
    @JsonProperty("bookId")
    private int bookId;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    @JsonProperty("bookname")
    private String bookname;

    @JsonProperty("BookCategory")
    private String bookCategory;
}
