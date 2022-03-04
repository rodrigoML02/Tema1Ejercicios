package Ejercicios.ejercicios.ejercicio7;
import Ejercicios.ejercicios.utilidades.Utilidades;

/**
 *
 * 7. Escribe un programa que lea un número entero de teclado y lo descomponga
en factores primos; por ejemplo 40 = 2 * 2 * 2 * 5.
 */
public class Ejercicio7 {
    public static void main(String[] args){
        String pregunta="";
        System.out.println("introduce el numero que quieres descomponer: ");
        int numero=Utilidades.leeEntero(pregunta);
        Utilidades.DescomponerEnPrimos(numero);    
    }
}
