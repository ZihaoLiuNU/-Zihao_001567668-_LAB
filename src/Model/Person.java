/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Zihao Liu
 */
public class Person {
    int NUID;
    String firstName;
    String lastName;
    String collegeName;
    ContactInformation officeContactInfo;
    ContactInformation personalContactInfo;
    Address permAddress;
    Address currentAddress;
    
    public Person(int idNum, int zip){
        this.NUID = idNum;
        this.firstName = "";
        this.lastName = "";
        this.collegeName = "";
        this.officeContactInfo = new ContactInformation();
        this.personalContactInfo = new ContactInformation();
        this.permAddress = new Address(zip);
        this.currentAddress = new Address(zip);
    }

    public int getNUID() {
        return NUID;
    }

    public void setNUID(int idNum) {
        this.NUID = idNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public ContactInformation getOfficeContactInfo() {
        return officeContactInfo;
    }

    public void setOfficeContactInfo(ContactInformation officeContactInfo) {
        this.officeContactInfo = officeContactInfo;
    }

    public ContactInformation getPersonalContactInfo() {
        return personalContactInfo;
    }

    public void setPersonalContactInfo(ContactInformation personalContactInfo) {
        this.personalContactInfo = personalContactInfo;
    }

    public Address getPermAddress() {
        return permAddress;
    }

    public void setPermAddress(Address permAddress) {
        this.permAddress = permAddress;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    
    
    public static void main(String args[]) {
//        Person obj = new Person();
//        
//        obj.setNUID("001567668");
//        obj.setFirstName("Zihao");
//        obj.setLastName("Liu");
//        obj.setCollegeName("COE");
//        
//        ContactInformation info = obj.getPermContactInfo();
//        info.setEmailID("");
//        info.setPhoneNumber("");
//
//        Address addr = obj.getAddress();
//        addr.setStreetName("Huntington");
//        addr.setAptNumber("");
//        addr.setCityState("");
//        addr.setZipCode("");
//       
//        System.out.println(obj.getFirstName() + " " + addr.getStreetName());
        
    }
}
