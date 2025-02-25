package org.primefaces.test;

import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
@Data
@Named
@ViewScoped
public class BasicView implements Serializable {


    private String text1;
    private String text2;
    private int number;
    private Map<String, Map<String, String>> data = new HashMap<>();
    private String country;
    private String city;
    private Map<String, String> countries;
    private Map<String, String> cities;


    @PostConstruct
    public void init() {
        countries = new HashMap<>();
        countries.put("USA", "USA");
        countries.put("Germany", "Germany");
        countries.put("Brazil", "Brazil");

        Map<String, String> map = new HashMap<>();
        map.put("New York", "New York");
        map.put("San Francisco", "San Francisco");
        map.put("Denver", "Denver");
        data.put("USA", map);

        map = new HashMap<>();
        map.put("Berlin", "Berlin");
        map.put("Munich", "Munich");
        map.put("Frankfurt", "Frankfurt");
        data.put("Germany", map);

        map = new HashMap<>();
        map.put("Sao Paulo", "Sao Paulo");
        map.put("Rio de Janerio", "Rio de Janerio");
        map.put("Salvador", "Salvador");
        data.put("Brazil", map);

    }


    public int increment() {
        return number++;
    }

    public int startFromZero() {
        number = 0;

        return number;
    }

    public void onCountChange() {
        if (country != null && !country.isEmpty()) {
            cities = data.get(country);
        } else {
            cities = new HashMap<>();
        }
    }

    public void display() {
        FacesMessage msg;
        if (cities != null && country != null) {
            msg = new FacesMessage("Selected", city + " of" + country);
        } else {
            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Invalid", "city is not selected");
        }
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

}
