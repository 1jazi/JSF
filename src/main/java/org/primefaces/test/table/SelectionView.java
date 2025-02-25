package org.primefaces.test.table;


import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Data;
import org.primefaces.event.SelectEvent;

import java.io.Serializable;
import java.util.List;


@Named("dtSelectionView")
@Data
@ViewScoped
public class SelectionView implements Serializable {


    private List<Product> products1;
    private List<Product> products2;
    private List<Product> products3;
    private Product selectedProduct;
    private List<Product> selectedProducts;

    @Inject
    private ProductService services;


    @PostConstruct
    public void init() {
        products1 = services.getProducts(10);
        products2 = services.getProducts(10);
        products3 = services.getProducts(10);
    }


    public void onRowSelect(SelectEvent<Product> event) {
        FacesMessage msg = new FacesMessage("Product Selected", String.valueOf(event.getObject().getId()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onRowUnselect(SelectEvent<Product> event) {
        FacesMessage msg = new FacesMessage("Product Unselected", String.valueOf(event.getObject().getId()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }


}
