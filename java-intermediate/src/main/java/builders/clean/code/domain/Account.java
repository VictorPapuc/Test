package builders.clean.code.domain;

import java.util.List;

public class Account {

    private int id;
    private String email;
    private String firstName;
    private List<String> middlenames;
    private String surnamae;
    private int houseNumber;
    private String street;
    private String zipCode;
    private String city;


    public Account(int id, String email, String firstNameList, List<String> middlenames, String surnamae, int houseNumber, String street,
                   String zipCode, String city) {

        this.id = id;
        this.email = email;
        this.firstName = firstNameList;
        this.middlenames = middlenames;
        this.surnamae = surnamae;
        this.houseNumber = houseNumber;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }

}
