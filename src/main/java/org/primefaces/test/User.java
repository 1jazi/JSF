package org.primefaces.test;


import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Data;

import java.io.Serializable;

@Named
@Data
@ViewScoped
public class User implements Serializable {
    private String firstname;
    private String lastname;
    private Integer age;
    private String street;
    private String city;
    private String postalCode;
    private String info;
    private String email;
    private String phone;


}
