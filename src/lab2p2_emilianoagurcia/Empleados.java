/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_emilianoagurcia;

import java.util.Date;

/**
 *
 * @author emili
 */
public class Empleados {
    String Nombre;
    String RRHH;//Num. de Cuenta
    int Edad;
    double Sueldo;
    String Estado;//Si está trabajando o No
    
    public Empleados(){
        
    }
    
    public Empleados(String Nombre, String RRHH, int Edad, double Sueldo, String Estado){
        this.Nombre = Nombre;
        this.RRHH = RRHH;
        this.Edad = Edad;
        this.Sueldo = Sueldo;
        this.Estado = Estado;
    }
    
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public void setRRHH(String RRHH){
        this.RRHH = RRHH;
    }
    
    public void setEdad(int Edad){
        this.Edad = Edad;
    }
    
    public void setSueldo(double Sueldo){
        this.Sueldo = Sueldo;
    }
    
    public String getEstado(){
        return Estado;
    }
    public void setEstado(String Estado){
        this.Estado = Estado;
    }
    
    public String toString(){
        return "\nNombre: "+Nombre+"\nNumero de Cuenta: "+RRHH+"\nEdad: "+Edad+" años"+"\nSueldo: Lps."+Sueldo+"\nEstado de Trabajo: "+Estado;
    }
}
