package org.primefaces.test.formAutoComplete;


import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.model.LazyDataModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Data
@Named
@ViewScoped

public class AutoCompleteView implements Serializable {


    private String txt1;
    private String txt2;
    private String txt3;


    private Country country1;
    private Country country2;
    private Country country3;
    private Country country4;
    private Country country5;

    private List<Country> countries;


    private LazyDataModel<Country> lazyModel;


    @Inject
    private CountryService countryService;


    @Inject

    private CustomerService service;

//    @PostConstruct
//    public void init() {
//        lazyModel = new LazyC
//    }



}
