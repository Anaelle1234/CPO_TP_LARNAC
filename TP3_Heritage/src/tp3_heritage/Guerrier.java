/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage;

/**
 *
 * @author Anaëlle
 */
public class Guerrier extends Personnage {
    boolean cheval;
    public Guerrier(String nom, int vie, boolean cheval) {
        super(nom, vie);
        this.cheval=cheval;  
        
        
    }
@Override
    public String toString() {
        return "Guerrier{"+ "nom= " + nom + ", vie= " + vie + " confirme= " + cheval + '}';
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
