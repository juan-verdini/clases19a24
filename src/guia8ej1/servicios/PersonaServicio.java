/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej1.servicios;

import guia8ej1.entidades.Persona;
import java.util.Scanner;

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
/*Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays),
para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima,
y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.

/**
 *
 * @author PC
 */
public class PersonaServicio {
Scanner leer = new Scanner(System.in);
public boolean esMayorDeEdad(Persona datos){
    boolean edad;
    if(datos.getEdad()>=18){
        edad=true;
    }else{
        edad=false;
    }
    return edad;
}  

public void crearPersona(Persona datos){
    System.out.println("Ingrese el nombre");
    datos.setNombre(leer.next());
    System.out.println("Ingrese la edad");
    datos.setEdad(leer.nextInt());
    System.out.println("Ingrese el sexo (H, M o O)");
    datos.setSexo(leer.next());
    while(!datos.getSexo().equalsIgnoreCase("h")&&!datos.getSexo().equalsIgnoreCase("m")&&!datos.getSexo().equalsIgnoreCase("o")){
        System.out.println("El sexo no es válido, ingrese otro");
        datos.setSexo(leer.next());
    }
    System.out.println("Ingrese el peso en kg");
    datos.setPeso(leer.nextDouble());
    System.out.println("Ingrese la altura en mts");
    datos.setAltura(leer.nextDouble());
}

public int calcularIMC(Persona datos){
    double imc;
    int ret;
    imc = datos.getPeso()/(datos.getAltura()*datos.getAltura());
    if(imc<20){
      ret=-1;  
    }else if(imc>=20 && imc<=25){
        ret=0;
    }else{
        ret=1;
    }
    return ret;
}
}
