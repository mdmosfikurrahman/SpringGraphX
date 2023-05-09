package com.epde.sgx.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookInput{
    private String bookTitle;
    private String bookDesc;
    private String bookAuthor;
    private double bookPrice;
    private int bookPages;
}