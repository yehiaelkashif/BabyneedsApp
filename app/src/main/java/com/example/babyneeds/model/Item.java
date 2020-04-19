package com.example.babyneeds.model;
import java.security.PrivateKey;
public class Item {

     private int iteamId;
     private   int iteamSize;
     private  int iteamquantity;
     private  String iteamColor;
     private  String iteamName;
     private  String dateIteamAdded;

    public Item() {

    }

    public int getIteamId() {
        return iteamId;
    }

    public void setIteamId(int iteamId) {
        this.iteamId = iteamId;
    }

    public String getDateIteamAdded() {
        return dateIteamAdded;
    }

    public void setDateIteamAdded(String dateIteamAdded) {
        this.dateIteamAdded = dateIteamAdded;
    }

    public Item(int iteamSize, int iteamquantity, String iteamColor, String iteamName, String dateIteamAdded) {
        this.iteamSize = iteamSize;
        this.iteamquantity = iteamquantity;
        this.iteamColor = iteamColor;
        this.iteamName = iteamName;
        this.dateIteamAdded = dateIteamAdded;
    }

    public Item(int iteamSize, int iteamquantity, String iteamColor, String iteamName) {
        this.iteamSize = iteamSize;
        this.iteamquantity = iteamquantity;
        this.iteamColor = iteamColor;
        this.iteamName = iteamName;
    }

    public int getIteamSize() {
        return iteamSize;
    }

    public void setIteamSize(int iteamSize) {
        this.iteamSize = iteamSize;
    }

    public int getIteamquantity() {
        return iteamquantity;
    }

    public void setIteamquantity(int iteamquantity) {
        this.iteamquantity = iteamquantity;
    }

    public String getIteamColor() {
        return iteamColor;
    }

    public void setIteamColor(String iteamColor) {
        this.iteamColor = iteamColor;
    }

    public String getIteamName() {
        return iteamName;
    }

    public void setIteamName(String iteamName) {
        this.iteamName = iteamName;
    }
}
