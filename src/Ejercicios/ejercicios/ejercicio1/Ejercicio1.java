
package Ejercicios.ejercicios.ejercicio1;

/**
 *
 * 1. Escribir un programa que defina variables que representen el número de días
de un año, el número de horas que tiene un día, el número de minutos que
tiene una hora y el número de segundos que tiene un minuto. Emplear las
variables que ocupen el mínimo espacio de memoria posible. A continuación,
calcular el número de segundos que tiene un año y almacenar el valor del
cálculo en otra variable
 */

public class Ejercicio1 {
    public static void main (String[] args){
        int diasDelAno=365;
        int min=60;
        int hora=24;
        int segundos=60;
        int result;
        result=diasDelAno*hora*min*segundos;
        System.out.print("los segundos en un año son: "+result);
        
    }
    
}
