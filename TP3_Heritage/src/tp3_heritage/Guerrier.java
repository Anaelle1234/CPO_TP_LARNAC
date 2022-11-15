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
    
    public Guerrier(String nom, int vie, boolean b) {
        super(nom, vie);
        if (b==true){
            System.out.println("a cheval");
        }else{
            System.out.println("a pied");
        }
        
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
