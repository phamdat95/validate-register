package com.codegym.cms.model;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "User_form")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Size(min = 5,max = 45)
    private String firstName;

    @NotEmpty
    @Size(min = 5,max = 45)
    private String lastName;

    @NotEmpty
    @Pattern(regexp = "^$|[0-9]{10}", message = " size must be 10 and style must be integer")
    private String numberPhone;

    @Pattern(regexp = "^$|[0-9]{2}")
    @Range(min = 18, max = 100)
    private String age;

    @NotEmpty
    @Email
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User() {
    }

    public User(@NotEmpty @Size(min = 5, max = 45) String firstName, @NotEmpty @Size(min = 5, max = 45) String lastName, @NotEmpty @Pattern(regexp = "^$|[0-9]{10}") String numberPhone, @Pattern(regexp = "^$|[0-9]{2}") @Range(min = 18, max = 100) String age, @NotEmpty @Email String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.age = age;
        this.email = email;
    }
}
