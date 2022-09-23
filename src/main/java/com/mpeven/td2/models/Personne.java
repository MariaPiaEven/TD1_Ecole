package com.mpeven.td2.models;

public abstract class Personne {

    protected String nom;
    protected int age;

    protected boolean majeur;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.setAge(age);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        this.majeur = age >= 18;
    }

    public boolean isMajeur() {
        return majeur;
    }

//    public void setMajeur(boolean majeur) {
//
//        this.majeur = majeur;
//    }
}
