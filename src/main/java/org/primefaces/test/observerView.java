package org.primefaces.test;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Setter
@Getter
@Named
@ViewScoped
public class observerView implements Serializable {
    private String text;

}
