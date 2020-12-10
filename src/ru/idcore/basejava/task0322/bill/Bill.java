package ru.idcore.basejava.task0322.bill;

import ru.idcore.basejava.task0322.tax.TaxService;
import ru.idcore.basejava.task0322.tax.TaxType;

import java.math.BigDecimal;

public class Bill {
    private BigDecimal amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(BigDecimal amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.amount = taxAmount;
    }

    public void setTaxType(TaxType taxType) {
        this.taxType = taxType;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    public BigDecimal getTaxAmount() {
        return amount;
    }

    public TaxType getTaxType() {
        return taxType;
    }

    public TaxService getTaxService() {
        return taxService;
    }

    public void payTaxes() {
        BigDecimal taxAmount = taxType.calculateTaxFor(amount);

        taxService.payOut(taxAmount);
    }

    @Override
    public String toString() {
        return "\nСумма операции: " + amount +
                "\nТип налога: " + taxType +
                "\nРазмер налога: " + taxType.calculateTaxFor(amount);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Bill bill = (Bill) object;

        return amount.equals(bill.amount) && taxType.equals(bill.taxType);
    }


}
