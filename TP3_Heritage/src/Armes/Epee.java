/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Anaëlle
 */
public class Epee extends Arme {
    int finesse;
     public Epee(String n, int i, int a){
        super(n,i);
        if(a<100){
        finesse=a;
        }else{
            finesse=0;
        }
    }
    
}
