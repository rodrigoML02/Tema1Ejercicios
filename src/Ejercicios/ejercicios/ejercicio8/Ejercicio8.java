package Ejercicios.ejercicios.ejercicio8;

import java.util.ArrayList;
import Ejercicios.ejercicios.utilidades.Utilidades;

/**
 * 8. Empleando un array, escribir un programa que pida al usuario números enteros
hasta que se introduzca el número 0. A continuación, calcular la media, el
mínimo y el máximo de los datos introducidos.
 */
public class Ejercicio8 {
   public static void main(String[] args){
       ArrayList<Integer> numeros = new ArrayList<Integer>();
       String pregunta="";
       int numero;
       int media=0, min, max;
       System.out.println("introduce la lista de numeros deseada:");
       System.out.println("El programa acabará cuando se introduzca un 0");
       do{
           numero=Utilidades.leeEntero(pregunta);
           numeros.add(numero);
           
       }while(numero !=0);
       max=numeros.get(0);
       min=numeros.get(0);
       for(int i=0;i<numeros.size();i++){
           int j=numeros.get(i);
           if(j>max){
               max=j;
           }
           else if (j<min){
               min=j;
           }
           media=j+media;
           
       }
       int divisor= numeros.size();
       System.out.println("el maximo es:"+max);
       System.out.println("el minimo es:"+min);
       System.out.println("la media es:"+ media/divisor);
       
   } 
   
}
