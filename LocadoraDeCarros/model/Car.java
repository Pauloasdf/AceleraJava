package LocadoraDeCarros.model;

public abstract class Car {

    public double tax = 1.05;

    public double calculatePrice(int days){
        if(days>10){
            tax = 1.20;
        }else if(days>5){
            tax = 1.10;
        }

        double priceWithoutTax = days * getPrice();
        return  priceWithoutTax * tax ;
    }

    public abstract double getPrice();

}
