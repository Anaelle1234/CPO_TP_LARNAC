/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage;

/**
 *
 * @author Anaëlle
 */
public class Magicien extends Personnage{
    boolean confirme;
    public Magicien(String nom, int vie,boolean confirme) {
        super(nom, vie);
        this.confirme=confirme;
        
    }

    @Override
    public String toString() {
        return "Magicien{"+ "nom= " + nom + ", vie= " + vie + " confirme= " + confirme + '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
        
    }
    
    
}
