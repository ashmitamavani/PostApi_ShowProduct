package com.example.postapi_showproduct;

public class Productdata_Model {
    String ID;
    String UID;
    String PRO_NAME;
    String PRO_DES;
    String PRO_PRICE;
    String PRO_IMAGE;



    public Productdata_Model(String ID, String UID, String PRO_NAME, String PRO_PRICE, String PRO_IMAGE, String PRO_DES) {
        this.ID = ID;
        this.UID = UID;
        this.PRO_NAME = PRO_NAME;
        this.PRO_PRICE = PRO_PRICE;
        this.PRO_IMAGE = PRO_IMAGE;
        this.PRO_DES=PRO_DES;

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getPRO_NAME() {
        return PRO_NAME;
    }

    public void setPRO_NAME(String PRO_NAME) {
        this.PRO_NAME = PRO_NAME;
    }
    public String getPRO_DES() {
        return PRO_DES;
    }

    public void setPRO_DES(String PRO_DES) {
        this.PRO_DES = PRO_DES;
    }

    public String getPRO_PRICE() {
        return PRO_PRICE;
    }

    public void setPRO_PRICE(String PRO_PRICE) {
        this.PRO_PRICE = PRO_PRICE;
    }

    public String getPRO_IMAGE() {
        return PRO_IMAGE;
    }

    public void setPRO_IMAGE(String PRO_IMAGE) {
        this.PRO_IMAGE = PRO_IMAGE;
    }

    @Override
    public String toString() {
        return "Productdata_Model{" +
                "ID='" + ID + '\'' +
                ", UID='" + UID + '\'' +
                ", PRO_NAME='" + PRO_NAME + '\'' +
                ", PRO_DES='" + PRO_DES + '\'' +
                ", PRO_PRICE='" + PRO_PRICE + '\'' +
                ", PRO_IMAGE='" + PRO_IMAGE + '\'' +
                '}';
    }
}
