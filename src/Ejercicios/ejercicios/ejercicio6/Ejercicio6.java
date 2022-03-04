package Ejercicios.ejercicios.ejercicio6;
import Ejercicios.ejercicios.utilidades.Utilidades;


/**
6. Escribe un programa que muestre por pantalla la lista de los 100 primeros
números primos
 */
public class Ejercicio6 {
    
    public static void main(String[] args) {
        int numerosPrimos=0;
        int contador=1;
        boolean primo;
        //el bucle devuelve los 100 primeros numeros primos
        while(numerosPrimos<=100){
        
            primo= Utilidades.DetectorDePrimos(contador);
            if(primo==true){
                System.out.print(contador+" ");
                numerosPrimos++;
                contador++;
            }
            else{
                contador++;
            }
        }
    }
}
    

