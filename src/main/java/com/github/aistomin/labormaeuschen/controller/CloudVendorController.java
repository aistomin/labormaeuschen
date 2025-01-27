package com.github.aistomin.labormaeuschen.controller;

import com.github.aistomin.labormaeuschen.model.CloudVendor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cloud/vendor")
public class CloudVendorController {

    /**
     * Logger.
     */
    private final Logger logger = LoggerFactory.getLogger(CloudVendorController.class);

    /**
     * Primitive demo storage.
     */
    private final List<CloudVendor> storage = new ArrayList<>();

    /**
     * Get vendor's details by id.
     *
     * @param id Vendor's ID.
     * @return Vendor's details.
     */
    @GetMapping("/{id}")
    public CloudVendor cloudVendorDetails(final @PathVariable String id) {
        logger.info("Search Cloud Vendor with id: {}", id);
        return storage.stream()
            .filter(cloud -> cloud.getId().equals(id))
            .findFirst()
            .orElse(null);
    }

    /**
     * Create a new vendor.
     *
     * @param vendor New vendor.
     * @return Result message.
     */
    @PostMapping
    public String createCloudVendor(final @RequestBody CloudVendor vendor) {
        logger.info("Create Cloud Vendor with id: {}", vendor.getId());
        storage.add(vendor);
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
        logger.info("Update Cloud Vendor with id: {}", vendor.getId());
        deleteVendorDetails(vendor.getId());
        createCloudVendor(vendor);
        return "Cloud vendor updated.";
    }

    /**
     * Delete by id.
     *
     * @param id Vendor's ID.
     * @return Result message.
     */
    @DeleteMapping("/{id}")
    public String deleteVendorDetails(final @PathVariable String id) {
        logger.info("Delete Cloud Vendor with id: {}", id);
        final var old = cloudVendorDetails(id);
        storage.remove(old);
        return "Cloud vendor is deleted.";
    }
}
