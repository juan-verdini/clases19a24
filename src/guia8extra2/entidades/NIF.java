/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8extra2.entidades;
/*Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF).
Los atributos serán el número de DNI (entero largo) y la letra (String o char) que le corresponde.
En NIFService se dispondrá de los siguientes métodos:
*Métodos getters y setters para el número de DNI y la letra.
*Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá.
Una vez calculado, le asigna la letra que le corresponde según
*Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
/**
 *
 * @author USUARIO
 */
public class NIF {
   private long dni;
   private String letra;
   private String[] cadena = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    public NIF(long dni, String letra, String[] cadena) {
        this.dni = dni;
        this.letra = letra;
        this.cadena = cadena;
    }

    public NIF() {
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getCadena(int indice) {
        return cadena[indice];
    }

    public void setCadena(String[] cadena, int indice) {
    }
        
   
}
