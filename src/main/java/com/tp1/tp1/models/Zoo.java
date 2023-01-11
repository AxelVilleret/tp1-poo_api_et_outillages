package com.tp1.tp1.models;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private int visiteurs;
    private List<Secteur> secteursAnimaux;
    public List<Secteur> getSecteursAnimaux() {
        return secteursAnimaux;
    }

    private final static int NB_VISITEURS_MAX_SECTEUR = 15;

    public Zoo(int visiteurs, List<Secteur> secteursAnimaux) {
        this.visiteurs = visiteurs;
        this.secteursAnimaux = secteursAnimaux;
    }

    public void ajouterSecteur(TypeAnimal typeAnimal) {
        secteursAnimaux.add(new Secteur(typeAnimal, new ArrayList<>()));
    }

    public void nouveauVisiteur() throws LimiteVisiteurException {
        if (visiteurs+1 > NB_VISITEURS_MAX_SECTEUR*secteursAnimaux.size()) {
            throw new LimiteVisiteurException();
        }
        else {
            this.visiteurs++;
        }
    }

    public int getLimiteVisiteur() {
        return NB_VISITEURS_MAX_SECTEUR;
    }

    public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
        for (int i = 0; i < secteursAnimaux.size(); i++) {
            if (secteursAnimaux.get(i).obtenirType().equals(animal.getTypeAnimal())) {
                secteursAnimaux.get(i).ajouterAnimal(animal);
            }
        }
    }

    public int nombreAnimaux() {
        int somme = 0;
        for (Secteur s : secteursAnimaux) {
            somme+=s.getNombreAnimaux();
        }
        return somme;
    }

}
