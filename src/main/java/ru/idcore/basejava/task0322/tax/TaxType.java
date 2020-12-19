package ru.idcore.basejava.task0322.tax;

import java.math.BigDecimal;

/*Класс - Тип налогообложения*/
public class TaxType {
    protected String name;

    public TaxType(String name) {
        this.name = name;
    }

    public BigDecimal calculateTaxFor(BigDecimal amount) {
        System.out.println("Метод должен быть переопределен");

        return BigDecimal.valueOf(0.0);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        TaxType taxType = (TaxType) object;
        return name.equals(taxType.name);
    }



}
