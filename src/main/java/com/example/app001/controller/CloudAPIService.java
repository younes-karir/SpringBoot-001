package com.example.app001.controller;


import com.example.app001.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud-vendor")
public class CloudAPIService {

    @GetMapping("{VendorId}")
    public CloudVendor getCloudVendorDetails (@PathVariable String VendorId){
        return new CloudVendor(VendorId,"younes karir","beni mellal, maroc", "0623423423");
    }
}
