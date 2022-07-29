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
        
        ArrayList <String> Clientes = new ArrayList();
        ArrayList <String> Empleados = new ArrayList();
        ArrayList <String> Carros = new ArrayList();
        
        boolean C0 = true;
        while(C0 == true){
            System.out.println("=======MENU PRINCIPAL=======");
            System.out.println("0) Salir");
            System.out.println("1) Clientes");
            System.out.println("2) Empleados");
            System.out.println("3) Carros");
            System.out.println("============================");
            System.out.print("Elija la Opcion");
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
                        System.out.println("0) Salir");
                        System.out.println("1.1) Crear");
                        System.out.println("1.2) Modificar");
                        System.out.println("1.3) Eliminar");
                        System.out.println("1.4) Listar Clientes en Sistema");
                        System.out.println("1.5) Listar Carros por Cliente");
                        System.out.print("Elija la Opcion: ");
                        int opcionC1 = lea.nextInt();
                        System.out.println();

                        switch(opcionC1){
                            case 0:{
                                C1 = false;
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
                //Fin Menu Clientes
                
                //Menu Empleados
                case 2:{
                    boolean C2 = true;
                    while(C2 == true){
                        System.out.println("0) Salir");
                        System.out.println("2.1) Crear");
                        System.out.println("2.2) Modificar");
                        System.out.println("2.3) Eliminar");
                        System.out.println("2.4) Listar");
                        System.out.println("2.5) Marcar Asistencia");
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
                        System.out.println("0) Salir");
                        System.out.println("3.1) Agregar Carro a Sistema");
                        System.out.println("3.2) Modificar Estado");
                        System.out.println("3.3) Listar Carros");
                        System.out.println("3.4) Eliminar Carro");
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
    
}

/*
    public void set(){
        this. = ;
    }
    
    public get(){
        return ;
    }
*/
