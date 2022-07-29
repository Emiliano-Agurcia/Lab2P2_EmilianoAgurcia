/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_emilianoagurcia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Lab2P2_EmilianoAgurcia {
static Scanner lea = new Scanner(System.in);

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
                                System.out.print("Ingrese el nombre del Cliente: ");
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
                                    System.out.println("            Clientes Disponibles");
                                    for (int i = 0; i < ListaClientes.size(); i++) {
                                        System.out.println("Cliente#"+(i+1)+ListaClientes.get(i));
                                        System.out.println();
                                    }
                                    
                                    System.out.print("\nIngrese el indice del Cliente a modificar: ");
                                    int nCliente = lea.nextInt();
                                    nCliente--;

                                    if(nCliente <= ListaClientes.size()-1 && ListaClientes.get(nCliente) instanceof Clientes){
                                        System.out.println("\n---------------|Atributos|---------------");
                                        System.out.println("1) Nombre");
                                        System.out.println("2) ID");
                                        System.out.println("3) Edad");
                                        System.out.println("4) Saldo a pagar");
                                        System.out.println("-----------------------------------------");
                                        System.out.print("Ingrese el atributo a modificar del Cliente: ");
                                        String nMod = lea.next();
                                        System.out.println();

                                        switch(nMod){
                                            case "1":
                                            case "Nombre":
                                            case "nombre":{
                                                System.out.print("Ingrese el nombre nuevo: ");
                                                lea.nextLine();
                                                String Nombre = lea.nextLine();

                                                ( (Clientes)ListaClientes.get(nCliente) ).setNombre(Nombre);
                                            }break;

                                            case "2":
                                            case "ID":
                                            case "id":{
                                                System.out.print("Ingrese el nuevo numero de Identificacion: ");
                                                String ID = lea.next();

                                                ( (Clientes)ListaClientes.get(nCliente) ).setID(ID);
                                            }break;

                                            case "3":
                                            case "Edad":
                                            case "edad":{
                                                System.out.print("Ingrese la nueva Edad: ");
                                                int Edad = lea.nextInt();

                                                ( (Clientes)ListaClientes.get(nCliente) ).setEdad(Edad);
                                            }break;

                                            case "4":
                                            case "Sueldo":
                                            case "sueldo":{
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
                                for (int i = 0; i < ListaClientes.size(); i++) {
                                    System.out.println("Cliente#"+(i+1)+ListaClientes.get(0));
                                    System.out.println();
                                }
                                
                                System.out.print("Ingrese el indice del Cliente a eliminar: ");
                                int nCliente = lea.nextInt();
                                nCliente--;
                                
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

                            }break;

                            case 2:{

                            }break;

                            case 3:{

                            }break;

                            case 4:{

                            }break;

                            case 5:{

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

                            }break;

                            case 2:{

                            }break;

                            case 3:{

                            }break;

                            case 4:{

                            }break;

                            case 5:{

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
    
    public static void ImprimirLista(ArrayList <String> lista){
        for (int i = 0; i < 10; i++) {
            System.out.println("Cliente#"+lista.indexOf(lista.get(i)));
            System.out.println();
            System.out.println("");
        }
    }
}

/*
    public void set(){
        this. = ;
    }
    public get(){
        return ;
    }
*/
