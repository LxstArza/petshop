package com.petshop.petshop.model;

abstract class Animal {
    private String name;

    public Animal(String name) {}

    public String getName() { return name; }

    public void setName(String name) {}

    public abstract void animalSound();
}
