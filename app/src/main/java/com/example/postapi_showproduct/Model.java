package com.example.postapi_showproduct;

import java.util.ArrayList;
import java.util.List;

public class Model {
  int connection;
  int result;
  //Productdata_Model productdata;
  List<Productdata_Model>productdata;
  public Model(int connection, int result, List<Productdata_Model> productdata) {
    this.connection = connection;
    this.result = result;
    this.productdata = productdata;
  }



  public int getConnection() {
    return connection;
  }

  public void setConnection(int connection) {
    this.connection = connection;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public List<Productdata_Model> getProductdata() {
    return productdata;
  }

  public void setProductdata(List<Productdata_Model> productdata) {
    this.productdata = productdata;
  }









}
