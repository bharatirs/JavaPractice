package com.bharati.learning.practice;

public class HelloWorld {

    // primitive data type
    // int, float, double, char, void, boolean
    // 32 bit int - 000000000000000000000000000000 - 11111111111111111111111111111111111 -


    // Derived Data Type
    // String, Double, Integer, BigDecimal, Boolean

    // attribute
    private int year;

    protected int nepaliYear;

    public int americanYear;


    public HelloWorld() {
    }

    public HelloWorld(int year) {
        this.year = year;
    }

    // public HelloWorld(int,int)
    public HelloWorld(int year, int nepaliYear) {
        this.year = year;
        this.nepaliYear = nepaliYear;
    }

    public HelloWorld(int year, int nepaliYear, int americanYear) {
        this.year = year;
        this.nepaliYear = nepaliYear;
        this.americanYear = americanYear;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNepaliYear() {
        return nepaliYear;
    }

    public void setNepaliYear(int nepaliYear) {
        this.nepaliYear = nepaliYear;
    }

    public int getAmericanYear() {
        return americanYear;
    }

    public void setAmericanYear(int americanYear) {
        this.americanYear = americanYear;
    }


}
