/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author amine
 */
public class Compte {
    private int code;
    private double solde;
    private static int nbrCompte=0;

    Compte(double s){
        code=nbrCompte+1;
        solde=s;
        nbrCompte++;
    }
    public void verser(double mt){
        solde+=mt;//solde=solde+mt;
    }
    public void retirer(double mt){
        solde-=mt;//solde=solde-mt;
    }
public void afficher (){
    System.out.println("Code : "+code+" ; Solde"+solde);
}
    public int getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public static int getNbrCompte() {
        return nbrCompte;
    }
    
    
}