/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_jazminsalgado;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author evaja
 */
public class Lab1P2_JazminSalgado {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Fecha> fechas = new ArrayList<>();
    static ArrayList<usuario> usuarios = new ArrayList<>();
    static ArrayList<dominio> dominios = new ArrayList<>();

    public static void main(String[] args) throws ParseException {
        Scanner leer = new Scanner(System.in);
        String op = "";
        do {
            System.out.println("  MENU    \n"
                    + "a. Ordenamiento de Fechas\n"
                    + "b. Registro Electronico\n"
                    + "c. Salir\n"
                    + "Ingrese una opcion: ");
            op = leer.next();
            switch (op) {
                case "a":
                    System.out.println("Ingrese la cantidad de fechas que desea iterar: ");
                    int cant = leer.nextInt();
                    añadirfecha(cant);
                    break;
                case "b":
                    System.out.println("Que desea ingresar:\n"
                            + "1. Registrar Correo electronico\n"
                            + "2. Listar correos");
                    int opr = leer.nextInt();
                    switch (opr) {
                        case 1:
                            System.out.println("Ingrese el correo: ");
                            String user = leer.next();
                            registrarusuario(user);
                            break;
                        case 2:
                            System.out.println("Lista de correos:");
                            listarcorreo();
                            break;
                        default:
                            System.out.println("Numero ingresado no es valido");
                            break;

                    }
                    break;
                case "c":
                    op = "c";
                    System.out.println("Gracias por usar mi programa");
                    break;
                default:
                    System.out.println("Opcion ingresada no valida");
                    break;
            }
        } while (op != "c");

    }

    public static void añadirfecha(int num) throws ParseException {
        ArrayList dates = new ArrayList();
        Random alea = new Random();
        Date fecha = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String totdate = "";
        int day = 0, month = 0, year = 0;
        for (int i = 0; i <= num; i++) {
            day = alea.nextInt(1, 31);
            month = alea.nextInt(1, 12);
            year = alea.nextInt(1990, 2023);
            if (month == 2) {
                day = alea.nextInt(1, 28);
            }
            totdate = +day + "/" + month + "/" + year;
            fecha = df.parse(totdate);
            fechas.add(new Fecha(i, fecha));
            
            int date = Integer.parseInt(totdate);
            for (int j = 0; j < fechas.size(); j++) {
               
            }
        }
        
        System.out.println("Fechas originales\n"+fechas+"\n");

    }

    public static void registrarusuario(String user) {
        usuario newuser = new usuario(user);

        if (usuarios.contains(newuser)==true) {
            System.out.println("Usuario ingresado ya se encuenta en la lista");
        } else {
            usuarios.add(newuser);
        }
        System.out.println("Usuario registrado exitosamente");
    }

    public static void listarcorreo() {

        if (usuarios.isEmpty()) {
            System.out.println("Ingrese algo a la lista primero");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                String users = usuarios.get(i).getUser();
                String token[] = users.split("@");
                
                
                if (users.contains(token[1])) {
                     dominios.add(new dominio(token[1],usuarios));;
                }
                
                System.out.println(dominios.get(i).dominio);
                System.out.println(dominios.get(i).correo);
            }
        }
    }
}
