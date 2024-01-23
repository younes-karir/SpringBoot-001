package com.example.app001.controller;


import com.example.app001.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

import java.util.Vector;

@RestController
@RequestMapping("/cloud-vendor")
public class CloudAPIService {

    Vector<CloudVendor> data = new Vector<CloudVendor>();

    @GetMapping("{VendorId}")
    public CloudVendor getCloudVendorDetails (@PathVariable String VendorId){
        for (CloudVendor item :data ) {
            if(item.getVendorId().equals(VendorId))
                return item;
        }
        return null;
    }

    @GetMapping("/all")
    public Vector<CloudVendor> getAll(){
        return data;
    }



    @PostMapping
    public String postCloudVendor (@RequestBody CloudVendor item){
        if(data.add(item))
            return "added";
        else return "Error";
    }

    @PutMapping
    public String putCloudVendor (@RequestBody CloudVendor CloudVendor){
        for (CloudVendor item:data) {
            if(item.getVendorId().equals(CloudVendor.getVendorId()))
            {
                item.setVendorName(CloudVendor.getVendorName());
                item.setVendorAddress(CloudVendor.getVendorAddress());
                item.setVendorPhoneNumber(CloudVendor.getVendorPhoneNumber());
                return "modified";
            }

        }
        return "item couldn't be found";
    }



    @DeleteMapping("{VendorId}")
    public String deleteCloudVendor(@PathVariable  String VendorId){
        for (CloudVendor item: data) {
                if(item.getVendorId().equals(VendorId))
                {
                    data.remove(item);
                    return "item removed";
                }


        }
        return "item couldn't be found";
    }
}

