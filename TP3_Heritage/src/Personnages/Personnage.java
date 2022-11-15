/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author Anaëlle
 */
public class Personnage {
    String nom;
    int vie;

    
public Personnage(String nom, int vie) {//constructeur
 this.nom = nom;
 this.vie = vie;
}

 ArrayList<Arme> tabarme = new ArrayList<Arme>();
 Arme Arme_en_Main;

    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }
    

 Arme Armeactuelle= null;
 
 
 public ArrayList<Arme> ajouter_arme (Arme nvarme) {//constructeur

 if (tabarme.size()<5){
     tabarme.add(nvarme);
 }
        return tabarme;
 
 }
    
}
