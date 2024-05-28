package com.petshop.petshop.model;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void animalSound() {
        System.out.println("Guk");
    }
}
