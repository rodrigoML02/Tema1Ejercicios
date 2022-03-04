
package Ejercicios.ejercicios.ejercicio2;

/**
 *
 * 2. Escribir un programa que muestre por consola los mayores números enteros
que se pueden representar mediante un char, short e int.
 */
public class Ejercicio2 {
    public static void main(String[] args) {

        short masGrande1 = Short.MAX_VALUE;
        char masGrande2 = Character.MAX_VALUE;
        int masGrande3 = Integer.MAX_VALUE;

        System.out.println("El short más garnde es:" + masGrande1);
        System.out.println("El char más garnde es:" + masGrande2);
        System.out.println("El int más garnde es:" + masGrande3);

    }

}
