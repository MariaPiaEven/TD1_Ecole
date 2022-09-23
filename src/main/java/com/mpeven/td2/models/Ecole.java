package com.mpeven.td2.models;

import java.util.ArrayList;

public class Ecole {

    protected String adresse;

    public Ecole(String adresse) {
        this.adresse = adresse;
    }

    protected ArrayList<Etudiant> listeEtudiants = new ArrayList<>();

    public float moyenne() {
        float sommeMoyennes = 0;

        for (Etudiant etudiant : listeEtudiants) {
            sommeMoyennes += etudiant.moyenne();
        }

        return sommeMoyennes / listeEtudiants.size();
    }

    public int moyenneAge() {

        int cumulAge = 0;

        for (Etudiant etudiant : listeEtudiants) {
            cumulAge += etudiant.getAge();
        }
        return cumulAge / listeEtudiants.size();
    }


    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public ArrayList<Etudiant> getListeEtudiants() {
        return listeEtudiants;
    }

    public void setListeEtudiants(ArrayList<Etudiant> listeEtudiants) {
        this.listeEtudiants = listeEtudiants;
    }
}
