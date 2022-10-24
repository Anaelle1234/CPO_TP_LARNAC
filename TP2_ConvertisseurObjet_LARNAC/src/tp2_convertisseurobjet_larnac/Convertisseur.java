/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_larnac;

/**
 *
 * @author Anaëlle
 */
public class Convertisseur {
    int nbConversions;
    public  void Convertisseur(){
    nbConversions = 0 ;
}
    public double CelciusVersKelvin(double a){
        a=a+273;
        return a;
    }

    public double KelvinVersCelcius(double b){
        b=b-273;
        return b;
    }
    public double FahrenheitVersCelcius(double c){
        c=(c*1.8)+32;
        return c;
    }
    public double CelciusVersFahrenheit (double d){
        d=(d-32)/1.8;
        return d;
    }
    public double FahrenheitVersKelvin (double e){
        e=(e+459.67)*(5/9);
        return e;
    }
    public double KelvinVersFahrenheit (double f){
        f=(f*(9/5))-459.67;
        return f;
    }
    public String toString(){
         return "nb de conversions"+ nbConversions;  
    }
}
