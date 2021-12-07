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
        k.setInBox(true);
    }

    public void delFromBox(produkt k)
    {
        if(this.toPayment < k.getPrise()) this.toPayment = 0.0;
        else toPayment -= k.getPrise();
    }
}
