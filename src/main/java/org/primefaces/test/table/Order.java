package org.primefaces.test.table;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;


@Named
@Data
@ViewScoped
public class Order implements Serializable {


    private final int number;
    private final String imagePath;

    public Order(int number, String imagePath) {
        this.number = number;
        this.imagePath = imagePath;
    }

    public Order() {
        imagePath = "";
        number = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return number == order.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }
}
