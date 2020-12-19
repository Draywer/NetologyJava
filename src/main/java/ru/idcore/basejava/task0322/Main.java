package ru.idcore.basejava.task0322;

import ru.idcore.basejava.task0322.bill.Bill;
import ru.idcore.basejava.task0322.tax.IncomeTaxType;
import ru.idcore.basejava.task0322.tax.ProgressiveTaxType;
import ru.idcore.basejava.task0322.tax.TaxService;
import ru.idcore.basejava.task0322.tax.VATaxType;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        IncomeTaxType incomeTaxType = new IncomeTaxType();
        ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType();
        VATaxType vaTaxType = new VATaxType();

        Bill[] bills = new Bill[]{
                new Bill(new BigDecimal("10000.00"), incomeTaxType, taxService),
                new Bill(new BigDecimal("20000.00"), incomeTaxType, taxService),
                new Bill(new BigDecimal("30000.00"), incomeTaxType, taxService),
                new Bill(new BigDecimal("40000.00"), progressiveTaxType, taxService),
                new Bill(new BigDecimal("100000.00"), progressiveTaxType, taxService),
                new Bill(new BigDecimal("150000.00"), progressiveTaxType, taxService),
                new Bill(new BigDecimal("50000.00"), vaTaxType, taxService),
                new Bill(new BigDecimal("60000.00"), vaTaxType, taxService),
                new Bill(new BigDecimal("70000.00"), vaTaxType, taxService)
        };

        for (Bill bill: bills
             ) {
            bill.payTaxes();
        }
    }
}
