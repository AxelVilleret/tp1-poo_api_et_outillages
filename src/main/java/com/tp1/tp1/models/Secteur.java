package com.tp1.tp1.models;

import java.util.List;

public class Secteur {
    private TypeAnimal typeAnimauxDansSecteur;
    private List<Animal> animauxDansSecteur;

    public Secteur(TypeAnimal typeAnimauxDansSecteur, List<Animal> animauxDansSecteur) {
        this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
        this.animauxDansSecteur = animauxDansSecteur;
    }

    public void ajouterAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
        if (animal.getTypeAnimal().equals(this.typeAnimauxDansSecteur)) {
            this.animauxDansSecteur.add(animal);
        } else {
            throw new AnimalDansMauvaisSecteurException();
        }
        
    }

    public int getNombreAnimaux() {
        return this.animauxDansSecteur.size();
    }

    public TypeAnimal obtenirType() {
        return this.typeAnimauxDansSecteur;
    }


}
