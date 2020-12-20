package ru.idcore.basejava.task0322.tax;

import java.math.BigDecimal;

/*Класс - Подоходный налог*/
public class IncomeTaxType extends TaxType {

    public IncomeTaxType() {
        super("Подоходный налог");
    }

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount){
        BigDecimal percent = new BigDecimal("0.13");
        return amount.multiply(percent);
    }
}
