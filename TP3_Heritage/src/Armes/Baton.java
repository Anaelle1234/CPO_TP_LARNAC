/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author Anaëlle
 */
public class Baton extends Arme {
    int age;
    
    public Baton(String n, int i, int b){
        super(n,i);
        if(b<100){
        age=b;
        }else{
            age=0;
        }
    }
    
}
