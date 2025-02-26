package org.primefaces.test;


import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Data;
import org.primefaces.event.FlowEvent;

import java.io.Serializable;

@Named
@Data
@ViewScoped
public class UserWizard implements Serializable {


    private User user = new User();
    private boolean skip;

    public void save() {
        FacesMessage msg = new FacesMessage("succefully", "welcome: " + user.getFirstname() + " " + user.getLastname());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }


    public String onFlowProgress(FlowEvent event) {
        if (skip) {
            skip = false;
            return "confirm";
        } else {
            return event.getNewStep();
        }
    }

}
