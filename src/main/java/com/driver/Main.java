package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly  obj=new RWOnly();
//        obj.name="Akash";
        //cannot change name here as it is a private member of the class RWOnly
        obj.setName("Govind");
        obj.getName();
    }
  
}