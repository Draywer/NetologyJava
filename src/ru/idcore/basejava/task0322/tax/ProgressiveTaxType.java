package ru.idcore.basejava.task0322.tax;

import java.math.BigDecimal;

/*Прогорессивный налог*/
public class ProgressiveTaxType extends TaxType {

    public ProgressiveTaxType() {
        super("Прогорессивный налог");
    }

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal result;
        BigDecimal percentOne = new BigDecimal("0.10");
        BigDecimal percentTwo = new BigDecimal("0.15");

        int compareAmount = amount.compareTo(new BigDecimal("100000.00"));

        switch (compareAmount) {
            case -1:
            case 0:
                result = amount.multiply(percentOne);
                break;
            default:
                result = amount.multiply(percentTwo);
                break;
        }
        return result;
    }
}
