package com.github.aistomin.labormaeuschen.controller;

import com.github.aistomin.labormaeuschen.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    /**
     * Get vendor's details by id.
     *
     * @param id Vendor's ID.
     * @return Vendor's details.
     */
    @GetMapping("{id}")
    public CloudVendor cloudVendorDetails(final String id) {
        return vendor;
    }

    /**
     * Create a new vendor.
     *
     * @param vendor New vendor.
     * @return Result message.
     */
    @PostMapping
    public String createCloudVendor(final @RequestBody CloudVendor vendor) {
        this.vendor = vendor;
        return "Cloud vendor added.";
    }

    /**
     * Update an existing vendor.
     *
     * @param vendor Updated vendor.
     * @return Result message.
     */
    @PutMapping
    public String updateCloudVendor(final @RequestBody CloudVendor vendor) {
        this.vendor = vendor;
        return "Cloud vendor updated.";
    }
}
