package com.company;

public class produkt
{
    private String name;
    private Double prise;
    private boolean inBox;

    double getPrise()
    {
        return prise;
    }

    public produkt(String name, Double prise) {
        this.name = name;
        this.prise = prise;
    }

    @Override
    public String toString() {
        return "produkt{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                ", inBox=" + inBox +
                '}';
    }
}
