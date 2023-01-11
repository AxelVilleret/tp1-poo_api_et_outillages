package com.tp1.tp1.models;

public class Animal {
    private String nomAnimal;
    public String getNomAnimal() {
        return nomAnimal;
    }
    private TypeAnimal typeAnimal;
    public TypeAnimal getTypeAnimal() {
        return typeAnimal;
    }
    public Animal(String nomAnimal, TypeAnimal typeAnimal) {
        this.nomAnimal = nomAnimal;
        this.typeAnimal = typeAnimal;
    }
}
