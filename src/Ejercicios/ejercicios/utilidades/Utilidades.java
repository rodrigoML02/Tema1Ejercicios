/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicios.utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rodri
 */
public class Utilidades {
    public static String Limpiadorcadena (String cadena){
            cadena=cadena.replace(" ","").replace("á","a").replace("é","e").replace("í","i").replace("ó","o").replace("ú","u");
            cadena=cadena.toLowerCase();
            return cadena;
        }
    public static boolean DetectorDeMultiplo (int numero, int multiplo){
        int resto;
        boolean detector;
        resto= multiplo%numero;
        detector=(resto==0);
        return detector;   
    }
      
    public static boolean DetectorDePrimos (int numero) {
        int CantidadDeDivisores=0;
        boolean detector;
        //recorremos todos los numero menores e iguales que el dado y vemos los restos
        // como un primo solo es divisible por si mismo y 1 el contador tendra que ser ==2
        //para que el numero sea primo
        for(int i=1;i<=numero;i++){
            if(numero%i==0){
                CantidadDeDivisores++;
            }
        }
        detector=(CantidadDeDivisores==2);
        return detector;
        //se podria poner i=2 y  cambiar la condicion a contador==1;
    }
        public static String LeerFrase (String palabra) {
        System.out.println(palabra);
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
        String name;
        try {
            name = consola.readLine();
        } catch (IOException ex) {
            name = " ";
        }
        //

        return name;
     }
        public static int ContadorDeVocales (String palabra){
            int numDeVocales=0;
            //** convierte las mayusculas en minusculas**// 
            String PEnMinuscula=Limpiadorcadena(palabra);
            char a='a';
            char e='e';
            char i='i';
            char o='o';
            char u='u';
            char character;
            //**el bucle recorre las posiciones de la palabra devolviendo cada uno de los
            //**caracteres y comparandolos con las vocales**//
            for(int j=0;j<palabra.length();j++){
                character=PEnMinuscula.charAt(j);  
                if (character==a | character==e | character==i | character==o | character==u ){
                    numDeVocales++;                    
                }
            }
            return numDeVocales;
        }
        public static void EscribeAlreves (String palabra){
            //al igual que en el bucle anterior este recorre los caracteres de la palabra 1 a 1 pero en sentido contrario.//
            for (int i=palabra.length()-1;i>=0;i--){
                System.out.print(palabra.charAt(i));
            }
            System.out.print("\n");
        }
        
        public static boolean DetectorDePalindromos(String lectura){
            boolean verdad;
            int contador=0;
            String palabra=lectura;
            //quitamos los espacios y las mayusculas//
            palabra=Limpiadorcadena(palabra);
            int i=0;
            int j=palabra.length()-1;
            char char1;
            char char2;
            
            while (i<palabra.length() & j>=0){
                //recorremos la palabra en ambos sentidos y vamos comparando letra a letra//
                char1=palabra.charAt(i);
                char2=palabra.charAt(j);
                
                if(char1==char2){
                   contador ++;
                   i++;
                   j--;
                }
                else{
                    i++;
                    j--;
                }
                
            }
            //sera palindromo cuando el numero de letras iguales sea igual al numero de letras
            //es decir uando todas las letras sean iguales
            verdad=(contador==palabra.length());
            return verdad;   
        }
        public static int leeEntero(String pregunta){
            String CandeNumero=LeerFrase(pregunta);
            int elNumero;
            try{
                elNumero= Integer.parseInt(CandeNumero);
            }
            catch(NumberFormatException nfe){
                elNumero=0;
            }
            return elNumero;
        }
        
        public static void DescomponerEnPrimos(int numero){
            if(DetectorDePrimos(numero)==false){
                System.out.print(numero+"= ");
                while(numero!=1){
                    for (int i=1;i<=15;i++){
                         if(DetectorDePrimos(i)==true & numero%i==0){
                             numero=numero/i;
                             System.out.print(i+"*");
                         }
                    } 
                }
               System.out.print("1");
            }
            else{
                System.out.print("el numero "+numero+" es primo");
            }
                
        }
            
}
      
        
        
    