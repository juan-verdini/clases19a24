/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8extra1.servicios;

import guia8extra1.entidades.Raices;
import java.util.Scanner;

/*Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos,
llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto a través de un método constructor.
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
*Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
*Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
*Método obtenerRaices(): llama a tieneRaices() y si devolvió true, imprime las 2 posibles soluciones.
*Método obtenerRaiz(): llama a tieneRaiz() y si devolvió true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
*Método calcular(): este método llamara tieneRaices() y a tieneRaiz(), y mostrara por pantalla las posibles soluciones que tiene nuestra ecuación
con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrara un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
/**
 *
 * @author USUARIO
 */
public class RaicesServicios {

    Scanner leer = new Scanner(System.in);

    public void asignarValores(Raices datos) {
        System.out.println("Ingrese el valor de a");
        datos.setA(leer.nextInt());
        System.out.println("Ingrese el valor de b");
        datos.setB(leer.nextInt());
        System.out.println("Ingrese el valor de c");
        datos.setC(leer.nextInt());
        System.out.println("Su ecuación de segundo grado será: " + datos.getA() + "x^2 + " + datos.getB() + "x + " + datos.getC());
    }

    public double getDiscriminante(Raices datos) {
        double discriminante = (datos.getB() * datos.getB()) - (4 * datos.getA() * datos.getC());
        return discriminante;
    }

    public boolean tieneRaices(Raices datos) {
        boolean raices;
        raices = getDiscriminante(datos) >= 0;
        return raices;
    }

    public boolean tieneRaiz(Raices datos) {
        boolean raiz;
        raiz = getDiscriminante(datos) == 0;
        return raiz;
    }

    public void obtenerRaices(Raices datos) {
        if (tieneRaices(datos) == true) {
            double x1 = ((-(datos.getB())) + Math.sqrt((getDiscriminante(datos)))) / (2 * datos.getA());
            double x2 = ((-(datos.getB())) - Math.sqrt((getDiscriminante(datos)))) / (2 * datos.getA());
            System.out.println("Las raices de la ecuación son " + x1 + " y " + x2);
        }
    }
    
    public void obtenerRaiz(Raices datos){
        if(tieneRaiz(datos)==true){
            double raiz = (-(datos.getB()))/(2*datos.getA());
            System.out.println("La raiz de la ecuación es " + raiz);
        }
    }
    
    public void calcular(Raices datos){
        if(tieneRaiz(datos)==true){
            obtenerRaiz(datos);
        }else if(tieneRaices(datos)==true){
            obtenerRaices(datos);
        }else{
            System.out.println("La ecuación no tiene soluciones reales");
        }
        //System.out.println(getDiscriminante(datos));
    }

}
