package com.sparklingspur.sreeragnampoothiri.learncrud;

/**
 * Created by sreerag.nampoothiri on 11-May-15.
 */
public class Contact {



    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    int id;
    String name;
    int phoneNumber;

    public Contact(){

    }

    public Contact(int id, String name, int phoneNumber){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name, int phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
