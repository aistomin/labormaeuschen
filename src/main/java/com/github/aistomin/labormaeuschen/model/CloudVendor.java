package com.github.aistomin.labormaeuschen.model;

/**
 * Sample model that we are going to use in the REST API.
 */
public class CloudVendor {

    /**
     * Vendor's identifier.
     */
    private String id;

    /**
     * Vendor's name.
     */
    private String name;

    /**
     * Vendor's address.
     */
    private String address;

    /**
     * Vendor's phone number.
     */
    private String phone;

    /**
     * Default ctor.
     */
    public CloudVendor() {
    }

    /**
     * Parametrised ctor.
     *
     * @param id Vendor's identifier.
     * @param name Vendor's name.
     * @param address Vendor's address.
     * @param phone Vendor's phone number.
     */
    public CloudVendor(
        final String id,
        final String name,
        final String address,
        final String phone
    ) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    /**
     * Get vendor's identifier.
     *
     * @return Vendor's identifier.
     */
    public String getId() {
        return id;
    }

    /**
     * Set vendor's identifier.
     *
     * @param id Vendor's identifier.
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Get vendor's name.
     *
     * @return Vendor's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set vendor's name.
     *
     * @param name Vendor's name.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Get vendor's address.
     *
     * @return Vendor's address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set vendor's address.
     *
     * @param address Vendor's address.
     */
    public void setAddress(final String address) {
        this.address = address;
    }

    /**
     * Get vendor's phone.
     *
     * @return Vendor's phone.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set vendor's phone.
     *
     * @param phone Vendor's phone.
     */
    public void setPhone(final String phone) {
        this.phone = phone;
    }
}
