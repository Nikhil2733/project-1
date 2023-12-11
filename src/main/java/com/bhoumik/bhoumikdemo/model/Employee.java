package com.bhoumik.bhoumikdemo.model;


import lombok.*;

import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id")
    private String emailId;

    public void setfirstName(String Nikhil) {
    }
    public void setlastName(String lihkiN) {
    }
    public void setemailId(String emailId) {
    }

    public Object getFirstName() {
        return firstName;
    }

    public Object getLastName() {
        return lastName;
    }

    public Object getEmailId() {
        return emailId;
    }

    public void setfirstName(Object firstName) {
    }

    public void setlastName(Object lastName) {
    }

    public void setemailId(Object emailId) {
    }


}
