package org.primefaces.test;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Data
@Named
@ViewScoped

public class ProcessView implements Serializable {

    private String firstName;
    private String lastName;
    private String dropDownValue;


    public void save() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("welcome " + firstName + " " + lastName));
    }

    public void handleEvent() {

        this.lastName = lastName.toUpperCase();

    }

}
