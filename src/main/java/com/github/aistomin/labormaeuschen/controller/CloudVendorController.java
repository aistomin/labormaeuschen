package com.github.aistomin.labormaeuschen.controller;

import com.github.aistomin.labormaeuschen.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud/vendor")
public class CloudVendorController {

    /**
     * Sample object that we can set and get using REST API.
     */
    private CloudVendor vendor;

    @GetMapping("{id}")
    public CloudVendor cloudVendorDetails(final String id) {
        return vendor;
    }

    @PostMapping
    public String createCloudVendor(final @RequestBody CloudVendor newVendor) {
        vendor = newVendor;
        return "SUCCESS";
    }
}
