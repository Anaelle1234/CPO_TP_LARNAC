/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage;

/**
 *
 * @author Anaëlle
 */
public class Personnage {
    String nom;
    int vie;
    boolean b;
    
public Personnage(String nom, int vie ) {//constructeur
 this.nom = nom;
 this.vie = vie;
}
    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", vie=" + vie + '}';
    }

}
