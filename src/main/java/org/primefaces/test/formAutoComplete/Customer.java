package org.primefaces.test.formAutoComplete;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


@Data
public class Customer implements Serializable {


    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String company;
    private Country country;
    private LocalDate date;
    private CustomerStatus status;
    private int activity;
    private Representative representative;

    public Customer() {
    }

    public Customer(int id, String name, String company, Country country, LocalDate date, CustomerStatus status, int activity,
                    Representative representative) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.country = country;
        this.date = date;
        this.status = status;
        this.activity = activity;
        this.representative = representative;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Customer customer = (Customer) o;
        return id == customer.id
                && activity == customer.activity
                && Objects.equals(name, customer.name)
                && Objects.equals(company, customer.company)
                && Objects.equals(country, customer.country)
                && Objects.equals(date, customer.date)
                && status == customer.status
                && Objects.equals(representative, customer.representative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, company, country, date, status, activity, representative);
    }

}
