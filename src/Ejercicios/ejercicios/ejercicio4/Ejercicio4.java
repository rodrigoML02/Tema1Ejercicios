
package Ejercicios.ejercicios.ejercicio4;
import Ejercicios.ejercicios.utilidades.Utilidades;

/**
 *
 * 4. Escribe un programa que calcule el mínimo y el máximo de una lista de
números enteros positivos introducidos por el usuario. La lista finalizará
cuando se introduzca un número negativo.
 */
public class Ejercicio4 {
    public static void main (String[] args){
        String pregunta=" ";
        int numero;
        System.out.print(" introduce una lista de valores, la lista finalizara al introducir un numero negativo.");
        numero=Utilidades.leeEntero(pregunta);
        int min=numero;
        int max=numero;
        do{
            numero=Utilidades.leeEntero(pregunta);
            if(numero>max){
                max=numero;
            }
            else if(numero<min & numero>=0){
                min=numero;
            }
        }while(numero>0);
        System.out.println("el maximo es: " +max);
        System.out.println("el minimo es: " +min);
    }
    
    
}
