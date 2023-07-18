package com.example.helloworldjsp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    @JsonProperty("studentID")
    private String studentId;

    @JsonProperty("firstname")
    private String firstName;

    @JsonProperty("secondname")
    private String lastName;

    @JsonProperty("ContactNo")
    private String contactNo;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

}
