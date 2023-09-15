package com.example.restbasicspringboot.controller;

import com.example.restbasicspringboot.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService  {

    //inject the cloud object
    CloudVendor cloudVendor;
    //get the vendor details from the model
    @GetMapping("/{vendorId}")
    public CloudVendor getVendorDetails(String id){
        //return vendor object with model details
        return  cloudVendor;
//               new CloudVendor("C1","Vendor 1",
//                "Address One","xxxxxx");
    }

    //create cloudVendor details
    //filling details for the object
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){

    //filling the cloud vendor
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor created Successfully";
    }
    //update Vendor details
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {

        //filling the cloud vendor
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor updated Successfully";
    }
    //delete
    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendorDetails(String id) {

        //filling the cloud vendor
        this.cloudVendor = null;
        return "Cloud Vendor delete Successfully";
    }



}
