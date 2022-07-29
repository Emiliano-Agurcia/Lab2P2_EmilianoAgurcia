/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_emilianoagurcia;

import java.util.ArrayList;

/**
 *
 * @author emili
 */
public class Clientes {
    ArrayList <String> Clientes = new ArrayList();
    
    String Nombre;
    String ID;
    int Edad;
    double Saldo;//Saldo a pagar por carro en reparación
    
    public Clientes(){
        
    }
    
    public Clientes(String Nombre, String ID, int Edad, double Saldo){
        this.Nombre = Nombre;
        this.ID = ID;
        this.Edad = Edad;
        this.Saldo = Saldo;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String getNombre(){
        return Nombre;
    }
    
    public void setID(String ID){
        this.ID = ID;
    }
    public String getID(){
        return ID;
    }
    
    public void setEdad(int Edad){
        this.Edad = Edad;
    }
    public int getEdad(){
        return Edad;
    }
    
    public void setSaldo(double Saldo){
        this.Saldo = Saldo;
    }
    public double getSaldo(){
        return Saldo;
    }
    
    public String toString(){
        return "\nNombre: "+Nombre+"\nNúmero de Identificación: "+ID+"\nEdad: "+Edad+" años"+"\nSaldo a pagar: Lps."+Saldo;
    }
}
