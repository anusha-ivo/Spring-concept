package org.example;
import javax.annotation.PreDestroy;




public class Bike {
    String name;
    double price;

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setName(String name){
        this.name=name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void init(){
        System.out.println("bean started");
    }
    public void destroy(){
        System.out.println("bean destroyed");
    }
    public void drive(){
        System.out.println("bike started");
    }
    @PreDestroy
    public void driveclose(){
        System.out.println("bike stopped");
    }



}

