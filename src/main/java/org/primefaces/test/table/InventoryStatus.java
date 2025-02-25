package org.primefaces.test.table;

import lombok.Getter;

@Getter
public enum InventoryStatus {

    INSTOCK("In Stock"),
    OUTOFSTOCK("Out of Stock"),
    LOWSTOCK("Low Stock");

    private String text;

    InventoryStatus(String text) {
        this.text = text;
    }

}
