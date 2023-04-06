/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej2.servicios;

import guia8ej2.entidades.Cafetera;

/*Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual 
(la cantidad actual de café que hay en la cafetera).
Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio
en el paquete Servicios con los siguiente:
*Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
*Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula
la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza”
para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza,
y de no haberse llenado en cuanto quedó la taza.
*Método vaciarCafetera(): pone la cantidad de café actual en cero. 
*Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade
a la cafetera la cantidad de café indicada.
/**
 *
 * @author PC
 */
public class CafeteraServicio {

    public void llenarCafetera(Cafetera cant) {
        cant.setCapacidadMaxima(40);
        cant.setCantidadActual((int) cant.getCapacidadMaxima());
    }

    public void servirTaza(int cant, Cafetera can) {
        if (can.getCantidadActual() < cant) {
            System.out.println("La cantidad que hay en la cafetera no alcanza para llenar su taza");
            System.out.println("Se llenará hasta " + can.getCantidadActual() + "cc");
            can.setCantidadActual(0);
        } else {
            can.setCantidadActual((int) (can.getCantidadActual() - cant));
            System.out.println("Su taza se ha llenado!");
        }
    }
    
    public void vaciarCafetera(Cafetera cant){
        cant.setCantidadActual(0);
    }
    
    public void agregarCafe(int cant, Cafetera can){
        can.setCantidadActual((int) (can.getCantidadActual()+cant));
    }
}
