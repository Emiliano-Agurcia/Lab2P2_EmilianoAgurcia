/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_emilianoagurcia;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author emili
 */
public class Carros {
    String Marca;
    String Modelo;
    String Estado;
    String Propietario;
    GregorianCalendar FechaC;//Fecha de Creación
    Date FechaI;//Fecha de Ingreso al Taller
    double CostoRep;//Costo de Reparación

    public Carros(String Marca, String Modelo, String Estado, String Propietario, GregorianCalendar FechaC, Date FechaI, double CostoRep){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Estado = Estado;
        this.Propietario = Propietario;
        this.FechaC = FechaC;
        this.FechaI = FechaI;
        this.CostoRep = CostoRep;
    }
    
    public void setEstado(String Estado){
        this.Estado = Estado;
    }
    
    public String toString(){
        return "\nMarca: "+Marca+"\nModelo: "+Modelo+"\nEstado: "+Estado+"\nPropietario: "+Propietario+"\nFecha de Creación: "+FechaC+"Fecha de Ingreso: "+FechaI+"Costo de Reparación: Lps."+CostoRep;    }
    
    
}
