package org.primefaces.test;


import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Named
@ViewScoped
@Data
@Getter
@Setter
public class InputNumberView implements Serializable {


    private Double input1 = Double.valueOf(0);
    private Double input2 = Double.valueOf(0);
    private Double input3 = Double.valueOf(0);
    private Double input4 = Double.valueOf(0);
    private Double input5 = Double.valueOf(0);
    private Double input6 = Double.valueOf(0);
    private Double input7 = null;
    private BigDecimal input8 = BigDecimal.valueOf(0);
    private Double input9 = Double.valueOf(0);


    public InputNumberView() {
        input1 = 0d;
        input2 = 0d;
        input3 = 0d;
        input4 = 0d;
        input5 = 251.31;
        input6 = 60d;
        input8 = new BigDecimal("1234.000000001");
        input9 = 0d;
    }
}
