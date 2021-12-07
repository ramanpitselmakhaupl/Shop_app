package com.company;

public class klient
{
    private Double toPayment = 0.0;


    public Double getToPayment() {
        return toPayment;
    }

    public void addToBox(produkt k)
    {
        toPayment += k.getPrise();
    }

    public void delFromBox(produkt k)
    {
        toPayment -= k.getPrise();
    }
}
