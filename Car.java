package com.collection.class23;

public abstract class Car {

    int carPrice;
    String color;

    abstract void calculateSalesPrice();

}

class Truck extends Car {
    double weight;

    Truck(int carPrice, double weight) {
        this.carPrice = carPrice;
        this.weight = weight;
    }
    @Override
    void calculateSalesPrice() {
        double discount;
        if (weight > 2000) {
            discount = 0.1;

        } else {
            discount = 0.2;
        }
        System.out.println("The Truck price after discount " + discount + " is " + (carPrice - (carPrice * discount)));

    }
}

class Sedan extends Car{
    double length;
    Sedan(double length,int carPrice){
        this.length=length;
        this.carPrice=carPrice;
    }
    @Override
    void calculateSalesPrice(){
        double discount;
    if (length>20){
        discount=0.05;
    }else{
        discount=0.1;

    }
        System.out.println("The Sedan price after discount "+discount+" is: "+(carPrice - (carPrice * discount)));
    }
}
