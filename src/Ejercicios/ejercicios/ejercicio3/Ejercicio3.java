/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicios.ejercicio3;
import Ejercicios.ejercicios.utilidades.Utilidades;

/**
 *
 *3. Calcular la suma de todos los múltiplos de 5 comprendidos entre 1 y 100.
Calcular además cuantos hay y visualizar cada uno de ellos
 */
public class Ejercicio3 {
    public static void main (String[] args){
        int a=5;
        int contador=0;
        int suma=0;
        for (int i=1;i<=100;i++){
            if(Utilidades.DetectorDeMultiplo(a, i)==true){
               suma=suma+i;
               contador++;
               System.out.print(i+" ");
            } 
        }
       System.out.println("\n");
       System.out.println("la suma es de: " +suma);
       System.out.println("la cantidad de multiplos es de: " +contador);
    }
}
