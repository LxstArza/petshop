package com.petshop.petshop.model;

public class Bird extends Animal {
    public Bird(String name){
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
