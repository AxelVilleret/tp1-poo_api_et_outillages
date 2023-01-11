package com.tp1.tp1.models;

public class Chien extends Animal{

    public Chien(String nomAnimal) {
        super(nomAnimal, TypeAnimal.CHIEN);
    }

    @Override
    public String getNomAnimal() {
        return "Chien";
    }

    
    
}
