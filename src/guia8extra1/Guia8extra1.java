/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8extra1;

import guia8extra1.entidades.Raices;
import guia8extra1.servicios.RaicesServicios;

/*Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos,
llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto a través de un método constructor.
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
*Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
*Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
*Método obtenerRaices(): llama a tieneRaices() y si devolvió true, imprime las 2 posibles soluciones.
*Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
*Método calcular(): este método llamara tieneRaices() y a tieneRaiz(), y mostrara por pantalla las posibles soluciones que tiene nuestra ecuación
con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrara un mensaje.

/**
 *
 * @author USUARIO
 */
public class Guia8extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Raices ec = new Raices();
        RaicesServicios r = new RaicesServicios();
        r.asignarValores(ec);
        r.calcular(ec);
        
    }
    
}
