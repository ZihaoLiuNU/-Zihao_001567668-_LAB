/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 
 */
public class Address {
    String streetName;
    String aptNumber;
    String cityState;
    int zipCode;
    
    public Address(int zip) {
        this.streetName = "";
        this.aptNumber = "";
        this.cityState = "";
        this.zipCode = zip;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(String aptNumber) {
        this.aptNumber = aptNumber;
    }

    public String getCityState() {
        return cityState;
    }

    public void setCityState(String cityState) {
        this.cityState = cityState;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zip) {
        this.zipCode = zip;
    }

}
    
