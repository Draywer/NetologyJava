package ru.idcore.basejava.task0322.tax;

import java.math.BigDecimal;

/*Класс налоговой службы*/
public class TaxService {

    public void payOut(BigDecimal taxAmount) {
        System.out.format("Уплачен налог в размере %.2f%n", taxAmount);
    }
}
