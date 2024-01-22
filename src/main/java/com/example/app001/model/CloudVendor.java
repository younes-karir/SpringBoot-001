package com.example.app001.model;

public class CloudVendor {
    private String VendorId;
    private String VendorName;
    private String VendorAddress;
    private String VendorPhoneNumber;


    public CloudVendor() {
    }

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        VendorId = vendorId;
        VendorName = vendorName;
        VendorAddress = vendorAddress;
        VendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorId() {
        return VendorId;
    }

    public String getVendorName() {
        return VendorName;
    }

    public String getVendorAddress() {
        return VendorAddress;
    }

    public String getVendorPhoneNumber() {
        return VendorPhoneNumber;
    }

    public void setVendorId(String vendorId) {
        VendorId = vendorId;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    public void setVendorAddress(String vendorAddress) {
        VendorAddress = vendorAddress;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        VendorPhoneNumber = vendorPhoneNumber;
    }
}
