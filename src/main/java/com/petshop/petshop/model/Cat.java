package com.petshop.petshop.model;

public class Cat extends Animal{
    public Cat(String name){
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
        System.out.println("Meow");
    }
}
