package com.github.aistomin.labormaeuschen.controller;

import com.github.aistomin.labormaeuschen.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud/vendor")
public class CloudVendorController {

    @GetMapping("{id}")
    public CloudVendor cloudVendorDetails(final String id) {
        return new CloudVendor(
            "C1",
            "Max Mustermann",
            "Musterstr. 10\n80336 Munich\nGermany",
            "+49 30 901820"
        );
    }
}
