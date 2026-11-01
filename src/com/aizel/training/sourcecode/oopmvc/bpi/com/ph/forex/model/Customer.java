package com.aizel.training.sourcecode.oopmvc.bpi.com.ph.forex.model;

import java.io.Serializable;

public class Customer implements Serializable {
    //input instance variables (owned by the object)
    private String name; //default value is null
    private String currencySelected; //default value is null
    private double pesoAmount; //default value is 0.0

    //computed instance variables (owned by the object)
    private double convertedAmount;//default value is 0.0
    private String currencyEquivalent; //default value is null;
    private boolean isValid; //default value is false

    /////////////////////
    //constructor declaration
    public Customer() { //a no-arg constructor
        isValid = true;

        System.out.println("no-arg constructor executed.\n");
    }

    public Customer(String name, String currencySelected, double pesoAmount) { //parameterized constructor
        isValid = true;

        this.name = name;
        this.currencySelected = currencySelected;
        this.pesoAmount = pesoAmount;

        System.out.println("parameterized constructor executed.\n");
    }

    ////////////////////
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrencySelected() {
        return currencySelected;
    }

    public void setCurrencySelected(String currencySelected) {
        this.currencySelected = currencySelected;
    }

    public double getPesoAmount() {
        return pesoAmount;
    }

    public void setPesoAmount(double pesoAmount) {
        this.pesoAmount = pesoAmount;
    }

    public double getConvertedAmount() {
        return convertedAmount;
    }

    public void setConvertedAmount(double convertedAmount) {
        this.convertedAmount = convertedAmount;
    }

    public String getCurrencyEquivalent() {
        return currencyEquivalent;
    }

    public void setCurrencyEquivalent(String currencyEquivalent) {
        this.currencyEquivalent = currencyEquivalent;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    public void convertAmount() { //instance method
        //process
        switch(currencySelected) {
            case "1":
                convertedAmount = pesoAmount / 64.35;
                currencyEquivalent = "USD$";
                break;
            case "2":
                convertedAmount = pesoAmount / 73.3531;
                currencyEquivalent = "€";
                break;
            case "3":
                convertedAmount = pesoAmount / 0.4166;
                currencyEquivalent = "¥";
                break;
            case "4":
                convertedAmount = pesoAmount / 46.1469;
                currencyEquivalent = "AUD$";
                break;
            default:
                isValid = false;
                break;
        }
    }
}
