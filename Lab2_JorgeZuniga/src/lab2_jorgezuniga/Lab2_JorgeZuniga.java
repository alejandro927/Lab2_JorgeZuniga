/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_jorgezuniga;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alejandro
 */
public class Lab2_JorgeZuniga {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList dete = new ArrayList();
        ArrayList ca = new ArrayList();
        ArrayList resuelto = new ArrayList();
        ArrayList pendiente = new ArrayList();
        //para que salga seleccionando la opcion
        char resp = 's';
        while (resp == 's') {
            int opp;
            System.out.println("=====MENU=====\n"
                    + "1) Agregar detectives\n"
                    + "2) Eliminar detectives.\n"
                    + "3) Modificar Detectives\n"
                    + "4) Listar Detectives\n"
                    + "5) Registrar Casos\n"
                    + "6) Modificar Casos\n"
                    + "7) Listar Casos\n"
                    + "8) Listar casos resueltos (TODOS LOS CASOS)\n"
                    + "9) Listar casos pendientes (TODOS LOS CASOS)\n"
                    + "10)Salida\n"
                    + "Ingrese la opcion deseada:");
            opp = entrada.nextInt();
            //cada opcion entra a cada switch
            switch (opp) {
                case 1: {
                    String nombre, nacionalidad;
                    int edad, añosLaborales, nivel;
                    System.out.println("Ingrese su nombre:");
                    nombre = entrada.nextLine();
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese su edad:");
                    edad = entrada.nextInt();
                    
                    //validacion de que si es menor la edad no exista y pida otra
                    while (edad <= 0) {
                        System.out.println("No existe esta edad;Ingrese nuevamente la edad:");
                        edad = entrada.nextInt();
                    }
                    System.out.println("Ingrese su nacionalidad:");
                    nacionalidad = entrada.nextLine();
                    nacionalidad = entrada.nextLine();
                    System.out.println("Ingrese sus años laborales:");
                    añosLaborales = entrada.nextInt();
                    //validacion de que si es menor la edad laboral no exista y pida otra
                    while (añosLaborales <= 0) {
                        System.out.println("No existe este año;Ingrese nuevamente sus años laborales:");
                        añosLaborales = entrada.nextInt();
                    }
                    System.out.println("Ingrese su nivel(del 1 al 10):");
                    nivel = entrada.nextInt();
                    //validacion para que acepte solamente los niveles estipulados
                    while (nivel <= 0 || nivel > 10) {
                        System.out.println("El nivel ingresado no es valido ingrese nuevamente:");
                        nivel = entrada.nextInt();
                    }
                    //imprimir la lista de detective cada vez que se cree uno
                    dete.add(new detectives(nombre, nacionalidad, edad, añosLaborales, nivel));
                    String salida = "";
                    for (Object t : dete) {
                        salida += "" + dete.indexOf(t) + "=> " + t + "\n";
                    }
                    System.out.println(salida);
                }
                break;
                case 2: {
                    //validacion que si es =0 no entre por que no hay detectives
                    if (dete.isEmpty()) {
                        System.out.println("No hay ningun detective por lo tanto no se puede eliminar");
                        break;
                    }
                    int posi;
                    System.out.println("Ingrese la posicion del detective que desea eliminar:");
                    posi = entrada.nextInt();
                    //validacion para que solo acepte las posiciones existentes
                    if (posi > dete.size() || posi < 0) {
                        System.out.println("No hay nada en la posicion marcada");
                        break;
                    } else {
                        //aqui remueve al detective en su posicion
                        dete.remove(posi);
                    }
                    String salida = "";
                    System.out.println("Su nueva lista es:");
                    for (Object t : dete) {
                        salida += "" + dete.indexOf(t) + "=> " + t + "\n";
                    }
                    System.out.println(salida);
                }
                break;
                case 3: {
                    //validacion que si es =0 no entre por que no hay detectives
                    if (dete.isEmpty()) {
                        System.out.println("No hay ningun detective por lo tanto no se puede modificar");
                        break;
                    }
                    int posi;
                    System.out.println("Ingrese la posicion del detective que desea modificar:");
                    posi = entrada.nextInt();
                    //validacion para que solo acepte las posiciones existentes
                    if (posi > dete.size() || posi < 0) {
                        System.out.println("No hay nada en la posicion marcada");
                        break;
                    } else {
                        int op;
                        System.out.println("• Opciones a modificar son:\n"
                                + "1)Nombre\n"
                                + "2)Edad\n"
                                + "3)Nacionalidad\n"
                                + "4)Años laborales\n"
                                + "5)Nivel\n"
                                + "Ingrese su opcion: ");
                        op = entrada.nextInt();
                        //entra a la opcion que desea modificar
                        switch (op) {
                            case 1: {
                                String nombre;
                                System.out.println("Ingrese su nuevo nombre: ");
                                nombre = entrada.nextLine();
                                nombre = entrada.nextLine();
                                ((detectives) dete.get(posi)).setNombre(nombre);
                            }
                            break;
                            case 2: {
                                int edad;
                                System.out.println("Ingrese su nueva edad: ");
                                edad = entrada.nextInt();
                                ((detectives) dete.get(posi)).setEdad(edad);

                            }
                            break;
                            case 3: {
                                String nacionalidad;
                                System.out.println("Ingrese su nueva Nacionalidad: ");
                                nacionalidad = entrada.nextLine();
                                nacionalidad = entrada.nextLine();
                                ((detectives) dete.get(posi)).setNacionalidad(nacionalidad);

                            }
                            break;
                            case 4: {
                                int añosLaborales;
                                System.out.println("Ingrese sus nuevos Años laborales: ");
                                añosLaborales = entrada.nextInt();
                                ((detectives) dete.get(posi)).setAñosLaborales(añosLaborales);

                            }
                            break;
                            case 5: {
                                int nivel;
                                System.out.println("Ingrese su nuevo nivel: ");
                                nivel = entrada.nextInt();
                                ((detectives) dete.get(posi)).setNivel(nivel);

                            }
                            break;

                        }

                    }
                    String salida = "";
                    System.out.println("Su nueva lista es:");
                    for (Object t : dete) {
                        salida += "" + dete.indexOf(t) + "=> " + t + "\n";
                    }
                    System.out.println(salida);

                }
                break;
                case 4: {
                    //imprime la lista de los detectives existentes
                    String salida = "";
                    System.out.println("Su lista de detectives es:\n");
                    for (Object t : dete) {
                        salida += "" + dete.indexOf(t) + "=> " + t + "\n";
                    }
                    System.out.println(salida);
                }
                break;
                case 5: {

                    int tip1, tip2;
                    String lugar, descripcion, tipo1 = "", estado = "";
                    System.out.println("Estado:\n"
                            + "1)En proceso\n"
                            + "2)Resuelto\n"
                            + "Ingrese su opcion:");
                    tip2 = entrada.nextInt();
                    //valida que solo se acepten estas opciones ya dadas
                    while (tip2 < 1 || tip2 > 2) {
                        System.out.println("Numero ingresado no valido ingrese nuevamente:");
                        tip2 = entrada.nextInt();
                    }
                    switch (tip2) {
                        case 1: {
                            estado = "En proceso";
                            System.out.println("Ingrese el lugar del caso:");
                            lugar = entrada.nextLine();
                            lugar = entrada.nextLine();
                            System.out.println("Descripcion:");
                            descripcion = entrada.nextLine();
                            System.out.println("Que tipo es:\n"
                                    + "1)Homicidio\n"
                                    + "2)Robo\n"
                                    + "3)Secuestro\n"
                                    + "Ingrese su opcion:");
                            tip1 = entrada.nextInt();
                            //valida que solo se acepten estas opciones
                            while (tip1 < 1 || tip1 > 3) {
                                System.out.println("Numero ingresado no valido ingrese nuevamente:");
                                tip1 = entrada.nextInt();
                            }
                            switch (tip1) {
                                case 1:
                                    tipo1 = "Homicidio";
                                    break;
                                case 2:
                                    tipo1 = "Robo";
                                    break;
                                case 3:
                                    tipo1 = "Secuestro";
                                    break;
                            }
                            System.out.println("Detective a cargo:\n");
                            //añade a ambos arraylist para que asi al final imprima facilmente los arraylist solicitados
                            resuelto.add(new casos(lugar, descripcion, tipo1, estado));
                            //arraylist casos(todos)
                            ca.add(new casos(lugar, descripcion, tipo1, estado));
                        }
                        break;
                        case 2: {
                            estado = "Resuelto";
                            System.out.println("Ingrese el lugar del caso:");
                            lugar = entrada.nextLine();
                            lugar = entrada.nextLine();
                            System.out.println("Descripcion:");
                            descripcion = entrada.nextLine();
                            System.out.println("Que tipo es:\n"
                                    + "1)Homicidio\n"
                                    + "2)Robo\n"
                                    + "3)Secuestro\n"
                                    + "Ingrese su opcion:");
                            tip1 = entrada.nextInt();
                            //valida que solo se acepten estas opciones
                            while (tip1 < 1 || tip1 > 3) {
                                System.out.println("Numero ingresado no valido ingrese nuevamente:");
                                tip1 = entrada.nextInt();
                            }
                            //asi cada opcion representa un String y es mas facil de enviar
                            switch (tip1) {
                                case 1:
                                    tipo1 = "Homicidio";
                                    break;
                                case 2:
                                    tipo1 = "Robo";
                                    break;
                                case 3:
                                    tipo1 = "Secuestro";
                                    break;
                            }
                            System.out.println("Detective a cargo:\n");
                            pendiente.add(new casos(lugar, descripcion, tipo1, estado));
                            ca.add(new casos(lugar, descripcion, tipo1, estado));
                        }
                    }

                }
                break;
                case 6: {
                    //imprime primero los casos para que sea mas facil para el usuario encontrar que caso desea editar
                    String salida = "";
                    System.out.println("Su lista de casos es:\n");
                    for (Object t : ca) {
                        salida += "" + ca.indexOf(t) + "=> " + t + "\n";
                    }
                    System.out.println(salida);
                    int posi;
                    System.out.println("Ingrese la posicion del caso que desea modificar:");
                    posi = entrada.nextInt();
                    //valida que solo se acepten estas opciones
                    if (posi < 0 || posi > ca.size()) {
                        System.out.println("Posicion fuera de rango");
                        break;
                    }
                    int op;
                    String lugar;
                    int tip1;
                    String tipo1;
                    String Descripcion;
                    int tip2;
                    String estado;
                    System.out.println("Las modificaciones puede ser a:\n"
                            + "1)Lugar\n"
                            + "2)Descripcion\n"
                            + "3)Tipo\n"
                            + "4)Estado\n"
                            + "Ingrese su opcion:");
                    op = entrada.nextInt();
                    switch (op) {
                        case 1: {
                            System.out.println("Ingrese el nuevo lugar:");
                            lugar = entrada.nextLine();
                            lugar = entrada.nextLine();
                            System.out.println("Modificado exitosamente!");
                            ((casos) (ca.get(posi))).setLugar(lugar);
                        }
                        break;
                        case 2: {
                            System.out.println("Ingrese la nueva descripcion:");
                            Descripcion = entrada.nextLine();
                            Descripcion = entrada.nextLine();
                            System.out.println("Modificado exitosamente!");
                            ((casos) (ca.get(posi))).setDescripcion(Descripcion);

                        }
                        break;
                        case 3: {
                            System.out.println("Que tipo es:\n"
                                    + "1)Homicidio\n"
                                    + "2)Robo\n"
                                    + "3)Secuestro\n"
                                    + "Ingrese su opcion:");
                            tip1 = entrada.nextInt();
                            //valida que solo se acepten estas opciones
                            while (tip1 < 1 || tip1 > 3) {
                                System.out.println("Numero ingresado no valido ingrese nuevamente:");
                                tip1 = entrada.nextInt();
                            }
                            //aqui se esoje la opcion y se devuelve que es lo que desea
                            switch (tip1) {
                                case 1:
                                    tipo1 = "Homicidio";
                                    ((casos) (ca.get(posi))).setTipo1(tipo1);
                                    break;
                                case 2:
                                    tipo1 = "Robo";
                                    ((casos) (ca.get(posi))).setTipo1(tipo1);
                                    break;
                                case 3:
                                    tipo1 = "Secuestro";
                                    ((casos) (ca.get(posi))).setTipo1(tipo1);
                                    break;
                            }
                        }
                        break;
                        case 4: {
                            System.out.println("Estado:\n"
                                    + "1)En proceso\n"
                                    + "2)Resuelto\n"
                                    + "Ingrese su opcion:");
                            tip2 = entrada.nextInt();
                            //valida que solo se acepten estas opciones
                            while (tip2 < 1 || tip2 > 2) {
                                System.out.println("Numero ingresado no valido ingrese nuevamente:");
                                tip2 = entrada.nextInt();
                            }
                            if (tip2 == 1) {
                                estado = "En proceso";
                                ((casos) (ca.get(posi))).setEstado(estado);
                            } else if (tip2 == 2) {
                                estado = "Resuelto";
                                ((casos) (ca.get(posi))).setEstado(estado);//mio XD
                                //((casos)(ca.get(posi))).setEstado(estado);//tuyo
                            }
                        }
                        break;
                    }

                }
                break;
                case 7: {
                    //aqui se enlistan todos los casos
                    String salida = "";
                    System.out.println("Su lista de casos es:\n");
                    for (Object t : ca) {
                        salida += "" + ca.indexOf(t) + "=> " + t + "\n";
                    }
                    System.out.println(salida);
                }
                break;
                case 8: {
                    //aqui se enlistan solo los casos resueltos
                    String salida = "";
                    System.out.println("Su lista de casos resueltos es:\n");
                    for (Object t : pendiente) {
                        salida += "" + pendiente.indexOf(t) + "=> " + t + "\n";
                    }
                    System.out.println(salida);
                }
                break;
                case 9: {
                    //aqui solo se enlistan los casos resueltos
                    String salida = "";
                    System.out.println("Su lista de casos pendientes es:\n");
                    for (Object t : resuelto) {
                        salida += "" + resuelto.indexOf(t) + "=> " + t + "\n";
                    }
                    System.out.println(salida);
                }
                break;
                case 10:
                    //salida
                    resp = 'n';
                    break;
            }
        }

    }

}
