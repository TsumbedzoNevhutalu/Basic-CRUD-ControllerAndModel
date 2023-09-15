package com.example.restbasicspringboot.model;

public class CloudVendor {
    private  String id;
    private String vendorName;
    private String address;
    private String phoneNumber;

    public CloudVendor(){}

    public CloudVendor(String id, String vendorName, String address, String phoneNumber){
        this.id = id;
        this.vendorName = vendorName;
        this.phoneNumber = address;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
