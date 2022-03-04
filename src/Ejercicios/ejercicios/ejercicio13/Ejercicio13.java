
package Ejercicios.ejercicios.ejercicio13;
import Ejercicios.ejercicios.utilidades.Utilidades;

/**
13. Escribe un programa que acepte una cadena de caracteres (que podrá contener
cualquier carácter a excepción del retorno de carro) y que la escriba al revés.
 */
public class Ejercicio13 {
    public static void main (String[] args){
        String palabra=" ";
        //leemos la palabra introducida por el usuario
        System.out.println("Introduce la palabra que quieras al reves: ");
        palabra=Utilidades.LeerFrase(palabra);
        //la devolvemos alreves
        System.out.println("Tu palabra alreves es: ");
        Utilidades.EscribeAlreves(palabra);
    }
}
