/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8extra2;

import guia8extra2.entidades.NIF;
import guia8extra2.servicios.NIFService;

/**
 *
 * @author USUARIO
 */
public class Guia8extra2 {
/*Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF).
Los atributos serán el número de DNI (entero largo) y la letra (String o char) que le corresponde.
En NIFService se dispondrá de los siguientes métodos:
*Métodos getters y setters para el número de DNI y la letra.
*Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá.
Una vez calculado, le asigna la letra que le corresponde según
*Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      NIF dni = new NIF();
      NIFService letra = new NIFService();
      letra.mostrar(dni);
      
    }
    
}
