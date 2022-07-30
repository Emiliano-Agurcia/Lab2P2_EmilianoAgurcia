/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_emilianoagurcia;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Lab2P2_EmilianoAgurcia {
static Scanner lea = new Scanner(System.in);
static Clientes CL = new Clientes();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList ListaClientes = new ArrayList();
        ArrayList ListaEmpleados = new ArrayList();
        ArrayList ListaCarros = new ArrayList();
        
        boolean C0 = true;
        while(C0 == true){
            System.out.println("\n=======MENU PRINCIPAL=======");
            System.out.println("0) Salir");
            System.out.println("1) Clientes");
            System.out.println("2) Empleados");
            System.out.println("3) Carros");
            System.out.println("============================");
            System.out.print("Elija la opcion: ");
            int opcionC0 = lea.nextInt();
            System.out.println();
            
            switch(opcionC0){
                case 0:{
                    C0 = false;
                }break;
                   
                //Menu Clientes
                case 1:{
                    boolean C1 = true;
                    while(C1 == true){
                        System.out.println("\n--------------Clientes-------------");
                        System.out.println("0) Salir");
                        System.out.println("1) Crear");
                        System.out.println("2) Modificar");
                        System.out.println("3) Eliminar");
                        System.out.println("4) Listar Clientes en Sistema");
                        System.out.println("5) Listar Carros por Cliente");
                        System.out.println("-----------------------------------");
                        System.out.print("Elija la Opcion: ");
                        int opcionC1 = lea.nextInt();
                        System.out.println();

                        switch(opcionC1){
                            case 0:{
                                C1 = false;
                            }break;
                            
                            
                            case 1:{
                                System.out.print("Ingrese el nombre del cliente: ");
                                lea.nextLine();
                                String Nombre = lea.nextLine();
                                
                                System.out.print("Ingrese el número de Identidad del cliente: ");
                                String ID = lea.nextLine();
                                
                                System.out.print("Ingrese la edad del cliente: ");
                                int Edad = lea.nextInt();
                                
                                System.out.print("Ingrese el saldo a pagar por reparación del cliente: ");
                                double Sueldo = lea.nextDouble();
                                
                                ListaClientes.add(new Clientes(Nombre, ID, Edad, Sueldo));
                            }break;

                            
                            case 2:{
                                
                                if(ListaClientes.isEmpty()){
                                    System.out.println("Aún no hay clientes en el Sistema");
                                }else{
                                    System.out.print("\nIngrese el indice del Cliente a modificar: ");
                                    int nCliente = lea.nextInt();

                                    if(nCliente <= ListaClientes.size()-1 && ListaClientes.get(nCliente) instanceof Clientes){
                                        System.out.println("\n---------------|Atributos|---------------");
                                        System.out.println("1) Nombre");
                                        System.out.println("2) ID");
                                        System.out.println("3) Edad");
                                        System.out.println("4) Saldo a pagar");
                                        System.out.println("-----------------------------------------");
                                        System.out.print("Ingrese el atributo a modificar del Cliente: ");
                                        lea.nextLine();
                                        String nMod = lea.nextLine();
                                        System.out.println();

                                        switch(nMod.toLowerCase()){
                                            case "1":
                                            case "nombre":{
                                                System.out.print("Ingrese el Nombre nuevo: ");
                                                lea.nextLine();
                                                String Nombre = lea.nextLine();

                                                ( (Clientes)ListaClientes.get(nCliente) ).setNombre(Nombre);
                                            }break;

                                            case "2":
                                            case "id":{
                                                System.out.print("Ingrese el nuevo numero de Identificacion: ");
                                                String ID = lea.next();

                                                ( (Clientes)ListaClientes.get(nCliente) ).setID(ID);
                                            }break;

                                            case "3":
                                            case "edad":{
                                                System.out.print("Ingrese la nueva Edad: ");
                                                int Edad = lea.nextInt();

                                                ( (Clientes)ListaClientes.get(nCliente) ).setEdad(Edad);
                                            }break;

                                            case "4":
                                            case "saldo":
                                            case "saldo a pagar":{
                                                System.out.print("Ingrese el nuevo Saldo: ");
                                                double Saldo = lea.nextDouble();

                                                ( (Clientes)ListaClientes.get(nCliente) ).setSaldo(Saldo);
                                            }break;

                                            default: System.out.println("Opcion Incorrecta");
                                        }    
                                    }else{
                                        System.out.println("Indice invalido");
                                    }                                    
                                }                                
                            }break;

                            
                            case 3:{
                                System.out.print("Ingrese el indice del Cliente a eliminar: ");
                                int nCliente = lea.nextInt();
                                
                                if(nCliente <= ListaClientes.size()-1 && ListaClientes.get(nCliente) instanceof Clientes){
                                    ListaClientes.remove(nCliente);
                                    System.out.println("El cliente ha sido eliminado exitosamente");
                                }else{
                                    System.out.println("Indice invalido");
                                }
                            }break;

                            
                            case 4:{
                                if(ListaClientes.isEmpty()){
                                    System.out.println("Aún no hay clientes en el Sistema");
                                }else{
                                    for (int i = 0; i < ListaClientes.size(); i++) {
                                        System.out.println("Cliente#"+(i+1)+ListaClientes.get(i));
                                        System.out.println();
                                    }
                                }
                            }break;

                            
                            case 5:{
                                
                            }break;

                            default: System.out.println("Opcion Incorrecta");
                        }
                    }
                }break;
                //Fin Menu Clientes
                
                //Menu Empleados
                case 2:{
                    boolean C2 = true;
                    while(C2 == true){
                        System.out.println("\n-------------Empleados-------------");
                        System.out.println("0) Salir");
                        System.out.println("1) Crear");
                        System.out.println("2) Modificar");
                        System.out.println("3) Eliminar");
                        System.out.println("4) Listar");
                        System.out.println("5) Marcar Asistencia");
                        System.out.println("-----------------------------------");
                        System.out.print("Elija la Opcion: ");
                        int opcionC2 = lea.nextInt();
                        System.out.println();

                        switch(opcionC2){
                            case 0:{
                                C2 = false;
                            }break;
                            
                            case 1:{
                                System.out.print("Ingrese el nombre del empleado: ");
                                lea.nextLine();
                                String Nombre = lea.nextLine();
                                
                                System.out.print("Ingrese el número de cuenta del empleado: ");
                                String RRHH = lea.nextLine();
                                
                                System.out.print("Ingrese la edad del empleado: ");
                                int Edad = lea.nextInt();
                                
                                System.out.print("Ingrese el sueldo del empleado: ");
                                double Sueldo = lea.nextDouble();
                                
                                String Estado = "Pendiente";
                                
                                ListaEmpleados.add(new Empleados(Nombre, RRHH, Edad, Sueldo, Estado));                                
                            }break;

                            case 2:{
                                
                                if(ListaEmpleados.isEmpty()){
                                    System.out.println("Aún no hay Empleados en el Sistema");
                                }else{
                                    System.out.print("\nIngrese el indice del Empleado a modificar: ");
                                    int nEmpleado = lea.nextInt();

                                    if(nEmpleado <= ListaEmpleados.size()-1 && ListaEmpleados.get(nEmpleado) instanceof Empleados){
                                        System.out.println("\n---------------|Atributos|---------------");
                                        System.out.println("1) Nombre");
                                        System.out.println("2) RRHH (Num. de Cuenta)");
                                        System.out.println("3) Edad");
                                        System.out.println("4) Sueldo");
                                        System.out.println("5) Estado de Trabajo");
                                        System.out.println("-----------------------------------------");
                                        System.out.print("Ingrese el atributo a modificar del Cliente: ");
                                        lea.nextLine();
                                        String nMod = lea.nextLine();
                                        System.out.println();

                                        switch(nMod.toLowerCase()){
                                            case "1":
                                            case "nombre":{
                                                System.out.print("Ingrese el Nombre nuevo: ");
                                                lea.nextLine();
                                                String Nombre = lea.nextLine();

                                                ( (Empleados)ListaEmpleados.get(nEmpleado) ).setNombre(Nombre);
                                            }break;

                                            case "2":
                                            case "rrhh":{
                                                System.out.print("Ingrese el nuevo numero de Cuenta: ");
                                                String RRHH = lea.next();

                                                ( (Empleados)ListaEmpleados.get(nEmpleado) ).setRRHH(RRHH);
                                            }break;

                                            case "3":
                                            case "edad":{
                                                System.out.print("Ingrese la nueva Edad: ");
                                                int Edad = lea.nextInt();

                                                ( (Empleados)ListaEmpleados.get(nEmpleado) ).setEdad(Edad);
                                            }break;

                                            case "4":
                                            case "sueldo":{
                                                System.out.print("Ingrese el nuevo Saldo: ");
                                                double Sueldo = lea.nextDouble();
                                                
                                                ( (Empleados)ListaEmpleados.get(nEmpleado) ).setSueldo(Sueldo);
                                            }break;
                                            
                                            case "5":
                                            case "estado":
                                            case "estado de trabajo":{
                                                String Estado = "";
                                                System.out.println("Ingrese si el empleado está trabajando actualmente[Si,No]: ");
                                                char resp = lea.next().charAt(0);
                                                if(resp == 'S' || resp == 's'){
                                                    Estado = "Activo";
                                                }else{
                                                    Estado = "Inactivo";
                                                }
                                                
                                                ( (Empleados)ListaEmpleados.get(nEmpleado) ).setEstado(Estado);
                                            }break;
                                            
                                            default: System.out.println("Opcion Incorrecta");
                                        }
                                    }
                                }
                            }break;

                            case 3:{
                               System.out.print("Ingrese el indice del Empleado a eliminar: ");
                                int nEmpleado = lea.nextInt();
                                
                                if(nEmpleado <= ListaEmpleados.size()-1 && ListaEmpleados.get(nEmpleado) instanceof Empleados){
                                    ListaEmpleados.remove(nEmpleado);
                                    System.out.println("El Empleado ha sido eliminado exitosamente");
                                }else{
                                    System.out.println("Indice invalido");
                                }
                            }break;

                            case 4:{
                                if(ListaEmpleados.isEmpty()){
                                    System.out.println("Aún no hay Empleados en el Sistema");
                                }else{
                                    for (int i = 0; i < ListaEmpleados.size(); i++) {
                                        System.out.println("Empleado#"+(i+1)+ListaEmpleados.get(i));
                                        System.out.println();
                                    }
                                }
                            }break;

                            case 5:{
                                ArrayList Asistencia = new ArrayList();
                                
                                if(ListaEmpleados.isEmpty()){
                                    System.out.println("Aún no hay Empleados en el Sistema");
                                }else{
                                    System.out.println("          -Lista de Asistencia-");
                                    for (int i = 0; i < ListaEmpleados.size(); i++) {
                                        System.out.println("\nEmpleado #"+(i+1));
                                        System.out.println(( (Empleados)ListaEmpleados.get(i) ).getNombre());
                                        System.out.println("Estado: "+( (Empleados)ListaEmpleados.get(i) ).getEstado());
                                        System.out.println();
                                    }
                                    
                                    char resp = 's';
                                    while(resp == 's' || resp == 'S'){
                                        System.out.print("\nIngrese el indice del Empleado a marcar: ");
                                        int nEmpleado = lea.nextInt();
                                        nEmpleado--;

                                        if(nEmpleado <= ListaEmpleados.size()-1 && ListaEmpleados.get(nEmpleado) instanceof Empleados){
                                            ( (Empleados)ListaEmpleados.get(nEmpleado) ).setEstado("Activo");
                                            System.out.println("El Empleado ha sido marcado");
                                            
                                            System.out.print("\n Desea marcar otro empleado? [Si/No]: ");
                                            resp = lea.next().charAt(0);
                                        }else{
                                            System.out.println("Indice invalido");
                                        }
                                        
                                        for (int i = 0; i < ListaEmpleados.size(); i++) {
                                            if(( (Empleados)ListaEmpleados.get(i) ).getEstado() == "Pendiente"){
                                                ( (Empleados)ListaEmpleados.get(i) ).setEstado("Inactivo");
                                            }
                                        }
                                    }
                                }
                            }break;

                            default: System.out.println("Opcion Incorrecta");
                        }
                    }                    
                }break;
                //Fin Menu Empleados

                //Menu Carros
                case 3:{
                    boolean C3 = true;
                    while(C3 == true){
                        System.out.println("\n--------------Carros---------------");
                        System.out.println("0) Salir");
                        System.out.println("1) Agregar Carro a Sistema");
                        System.out.println("2) Modificar Estado");
                        System.out.println("3) Listar Carros");
                        System.out.println("4) Eliminar Carro");
                        System.out.println("-----------------------------------");
                        System.out.print("Elija la Opcion: ");
                        int opcionC3 = lea.nextInt();
                        System.out.println();

                        switch(opcionC3){
                            case 0:{
                                C3 = false;
                            }break;
                            
                            case 1:{
                                System.out.print("Ingrese la marca del Carrro: ");
                                lea.nextLine();
                                String Marca = lea.nextLine();
                                
                                System.out.print("Ingrese el modelo del Carro: ");
                                lea.nextLine();
                                String Modelo = lea.nextLine();
                                
                                String Estado = "En espera de entrar a reparación";
                                
                                System.out.print("Ingrese el nombre del propietario: ");
                                lea.nextLine();
                                String Propietario = lea.nextLine();
                                
                                System.out.println("Fecha de Creación");
                                System.out.print("Ingrese el año de creación: ");
                                int year = lea.nextInt();
                                year -= 1900;
                                System.out.println("Ingrese el mes de creación (en formato numerico): ");
                                int month = lea.nextInt();
                                System.out.println("Ingrese el día de creación: ");
                                int day = lea.nextInt();
                                GregorianCalendar FechaC = new GregorianCalendar(year, month, day);
                                
                                Date FechaI = new Date();
                                
                                System.out.print("Ingrese el costo de reparación del Carro: ");
                                double CostoRep = lea.nextDouble();
                                
                                ListaCarros.add(new Carros(Marca, Modelo, Estado, Propietario, FechaC, FechaI, CostoRep));
                            }break;

                            case 2:{
                                if(ListaEmpleados.isEmpty()){
                                    System.out.println("Aún no hay Carros en el Sistema");
                                }else{
                                    System.out.print("\nIngrese el indice del Carro a modificar: ");
                                    int nCarro = lea.nextInt();
                                    
                                    if(nCarro <= ListaCarros.size()-1 && ListaCarros.get(nCarro) instanceof Carros){
                                        ( (Carros)ListaCarros.get(nCarro) ).setEstado("");
                                    }else{
                                        System.out.println("Indice invalido");
                                    }  
                                }
                            }break;

                            case 3:{
                                if(ListaCarros.isEmpty()){
                                    System.out.println("Aún no hay Carros en el Sistema");
                                }else{
                                    for (int i = 0; i < ListaCarros.size(); i++) {
                                        System.out.println("Carro#"+(i+1)+ListaCarros.get(i));
                                        System.out.println();
                                    }
                                }
                            }break;

                            case 4:{
                               System.out.print("Ingrese el indice del Carro a eliminar: ");
                                int nCarro = lea.nextInt();
                                
                                if(nCarro <= ListaCarros.size()-1 && ListaCarros.get(nCarro) instanceof Carros){
                                    ListaCarros.remove(nCarro);
                                    System.out.println("El Carro ha sido eliminado exitosamente");
                                }else{
                                    System.out.println("Indice invalido");
                                }    
                            }break;

                            default: System.out.println("Opcion Incorrecta");
                        }
                    }                    
                }break;
                //Fin Menu Carros
                
                default: System.out.println("Opcion Incorrecta");
            }
        }//Fin Menu Main
    }//Fin Main
}

/*
    public void set(){
        this. = ;
    }
    public get(){
        return ;
    }
*/
