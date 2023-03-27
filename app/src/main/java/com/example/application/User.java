package com.example.application;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String degreeProgram;
    private int image;

    // Public constructor
    public User(String firstName, String lastName, String email, String degreeProgram, int image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.image = image;
    }

    // Getters for all user information
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDegreeProgram() {
        return this.degreeProgram;
    }

    public int getImage() {
        return this.image;
    }
}
