package org.primefaces.test;


import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Named("selectorView")
@ViewScoped
@Getter
@Setter
@Data
public class SelectorView implements Serializable {

    private String txt1;
    private String txt2;

}
