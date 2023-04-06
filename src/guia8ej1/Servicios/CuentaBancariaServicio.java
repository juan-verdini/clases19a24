/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej1.Servicios;

import guia8ej1.entidades.CuentaBancaria;
import java.util.Scanner;

/*/*Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero),
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
public class CuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        System.out.println("Bienvenido! A continuación le pediremos algunos datos para poder ingresar a su cuenta");
        System.out.println("Ingrese su número de cuenta");
        int nc = leer.nextInt();
        System.out.println("Ingrese su DNI");
        long dni = leer.nextLong();
        double saldo = Math.round((Math.random()*300000+1)*100.0)/100.0;
        return new CuentaBancaria(nc, dni, saldo);
    }
    
   public CuentaBancaria ingresarDinero(CuentaBancaria saldo){
       System.out.println("Cuanto dinero desea ingresar?");
       double dinero = leer.nextDouble();
       saldo.setSaldoActual(saldo.getSaldoActual() + dinero);
       return saldo;
    }
   
   public void retirarDinero(CuentaBancaria saldo){
       System.out.println("Cuanto dinero desea retirar?");
       double retiro = leer.nextDouble();
       if(retiro > saldo.getSaldoActual()){
           System.out.println("Usted puede retirará el total del dinero");
           System.out.println("$" + saldo.getSaldoActual());
           saldo.setSaldoActual(0);
       }else{
           System.out.println("Usted va a retirar $" + retiro);
           saldo.setSaldoActual(saldo.getSaldoActual()-retiro);
           System.out.println("Su saldo actual es de: $" + saldo.getSaldoActual());
       }
   }
   
   public void extraccionRapida(CuentaBancaria saldo){
      System.out.println("Cuanto dinero desea retirar? Podrá sacar hasta un 20%");
       double retiro = leer.nextDouble();
       if(retiro > saldo.getSaldoActual()*0.2){
           System.out.println("Usted no puede retirar esa cantidad de dinero");
       }else{
           System.out.println("Usted va a retirar $" + retiro);
           saldo.setSaldoActual(saldo.getSaldoActual()-retiro);
           System.out.println("Su saldo actual es de: $" + saldo.getSaldoActual());
       } 
   }
   
   public void consultarSaldo(CuentaBancaria saldo){
       System.out.println("Su saldo actual es de $" + saldo.getSaldoActual());
   }
   
   public void consultarDatos(CuentaBancaria datos){
       System.out.println("DNI: " + datos.getDniCliente());
       System.out.println("Número de cuenta: " + datos.getNumeroCuenta());
       System.out.println("Saldo Actual: $" + datos.getSaldoActual());
   }

   

  
}
