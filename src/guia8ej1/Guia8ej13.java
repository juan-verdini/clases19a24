/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej1;

import guia8ej1.entidades.Persona;
import guia8ej1.servicios.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Guia8ej13 {
/*Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos:
nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura.
Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
*Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
*Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y
después se le asignan a sus respectivos atributos para llenar el objeto Persona.
Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá
mostrar un mensaje
*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal
y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos),
significa que la persona está en su peso ideal y la función devuelve un 0.
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso,
y la función devuelve un 1.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        PersonaServicio ps1 = new PersonaServicio();
        int imc [] = new int [4];
        boolean edad [] = new boolean [4];
        ps1.crearPersona(p1);
        if(ps1.esMayorDeEdad(p1)==false){
            System.out.println("MENOR DE EDAD");  
        }else{
            System.out.println("MAYOR DE EDAD");
        }
        edad[0]=ps1.esMayorDeEdad(p1);
        if(ps1.calcularIMC(p1)==1){
            System.out.println("SOBREPESO");   
        }else if(ps1.calcularIMC(p1)==-1){
            System.out.println("DELGADEZ");
        }else{
            System.out.println("PESO IDEAL");
        } 
        imc[0]=ps1.calcularIMC(p1);
        ps1.crearPersona(p2);
        if(ps1.esMayorDeEdad(p2)==false){
            System.out.println("MENOR DE EDAD");  
        }else{
            System.out.println("MAYOR DE EDAD");
        }
        edad[1]=ps1.esMayorDeEdad(p2);
        if(ps1.calcularIMC(p2)==1){
            System.out.println("SOBREPESO");   
        }else if(ps1.calcularIMC(p2)==-1){
            System.out.println("DELGADEZ");
        }else{
            System.out.println("PESO IDEAL");
        }
        imc[1]=ps1.calcularIMC(p2);
        ps1.crearPersona(p3);
        if(ps1.esMayorDeEdad(p3)==false){
            System.out.println("MENOR DE EDAD");  
        }else{
            System.out.println("MAYOR DE EDAD");
        }
        edad[2]=ps1.esMayorDeEdad(p3);
        if(ps1.calcularIMC(p3)==1){
            System.out.println("SOBREPESO");   
        }else if(ps1.calcularIMC(p3)==-1){
            System.out.println("DELGADEZ");
        }else{
            System.out.println("PESO IDEAL");
        }
        imc[2]=ps1.calcularIMC(p3);
        ps1.crearPersona(p4);
        if(ps1.esMayorDeEdad(p4)==false){
            System.out.println("MENOR DE EDAD");  
        }else{
            System.out.println("MAYOR DE EDAD");
        }
        edad[3]=ps1.esMayorDeEdad(p4);
        if(ps1.calcularIMC(p4)==1){
            System.out.println("SOBREPESO");   
        }else if(ps1.calcularIMC(p4)==-1){
            System.out.println("DELGADEZ");
        }else{
            System.out.println("PESO IDEAL");
        }
        imc[3]=ps1.calcularIMC(p4);
        double pi=0, pm=0, ps=0, me=0, mene=0;
        for(int i=0; i<=3; i++){
            switch (imc[i]) {
                case 1:
                    ps++;
                    break;
                case -1:
                    pm++;
                    break;
                default:
                    pi++;
                    break;
            }
        }
        for(int i=0; i<=3; i++){
            if(edad[i]==false){
                mene++;
            }else{
                me++;
            }
        }
        System.out.println("MAYORES DE EDAD: " + (me/4)*100 + "%");
        System.out.println("MENORES DE EDAD: " + (mene/4)*100 + "%");
        System.out.println("POR ENCIMA DE SU PESO IDEAL: " + ((ps/4)*100) + "%");
        System.out.println("POR DEBAJO DE SU PESO IDEAL: " + ((pm/4)*100) + "%");
        System.out.println("PESO IDEAL: " + ((pi/4)*100) + "%");
    }

}
