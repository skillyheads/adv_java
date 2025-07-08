package com.skillyheads.jetmail.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Objects;

@Table
public class Address {
    @Id
    private int addressId;
    private String alias;
    private String houseNo;
    private String streetName;
    private String pincode;

    public Address() {
    }

    public Address(int addressId, String alias, String houseNo, String pincode, String streetName) {
        this.addressId = addressId;
        this.alias = alias;
        this.houseNo = houseNo;
        this.pincode = pincode;
        this.streetName = streetName;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return addressId == address.addressId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(addressId);
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", alias='" + alias + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", streetName='" + streetName + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
