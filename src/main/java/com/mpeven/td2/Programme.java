package com.mpeven.td2;

import com.mpeven.td2.models.Ecole;
import com.mpeven.td2.models.Etudiant;
import com.mpeven.td2.models.Evaluation;

public class Programme {

    protected static Ecole ecole = new Ecole("4 rue de Mouzon");

    public Programme() {

        Etudiant john = new Etudiant("john Doe", 20);
        System.out.println(john.isMajeur());

//        Ecole ecole = new Ecole("4 rue de Mouzon");
//
//        Etudiant toto = new Etudiant("toto", 15);
//        Etudiant titi = new Etudiant("titi", 16);
//
//        toto.ajoutNote("Java", 20);
//        toto.ajoutNote("anglais", 8);
//        titi.ajoutNote("PHP", 17);
//        titi.ajoutNote("anglais", 5);
//
//
//        ecole.ajoutEtudiant(toto);
//        ecole.ajoutEtudiant(titi);
//
//        System.out.println(ecole.moyenneAge());
    }

    public static void main(String[] args) {
        new Programme();
    }

}
