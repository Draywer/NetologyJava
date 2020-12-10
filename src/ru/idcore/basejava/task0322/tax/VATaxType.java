package ru.idcore.basejava.task0322.tax;

import java.math.BigDecimal;

/*Класс - НДС*/
public class VATaxType extends TaxType {

    public VATaxType() {
        super("НДС");
    }

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount){
        BigDecimal percent = new BigDecimal("0.18");
        return amount.multiply(percent);
    }
}
