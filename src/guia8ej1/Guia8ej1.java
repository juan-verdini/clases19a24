/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej1;

import guia8ej1.Servicios.CuentaBancariaServicio;
import guia8ej1.entidades.CuentaBancaria;

/*Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero),
dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

/**
 *
 * @author PC
 */
public class Guia8ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        CuentaBancaria cb = new CuentaBancaria();
        cb = cbs.crearCuenta();
        System.out.println(cb.toString());
        cb = cbs.ingresarDinero(cb);
        cbs.retirarDinero(cb);
        cbs.extraccionRapida(cb);
        cbs.consultarSaldo(cb);
        cbs.consultarDatos(cb);
        //System.out.println(cb.toString());
    }

}
