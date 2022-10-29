/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sueldo_de_empleados_2;
import java.util.Scanner;
/**
 *
 * @author l_ryu_000
 */
public class Sueldo_de_empleados_2 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
       Scanner L=new Scanner(System.in);
       String nombreEmp;
       int horasTrab;
       double cuotaHora;
       double sueldo;
       char desea;
       
       do{       
       System.out.println("nombre");
           nombreEmp=L.next();
           System.out.println("horas trbajadas");
           horasTrab=L.nextInt();
           System.out.println("cuota por hora.");
           cuotaHora=L.nextDouble();
           System.out.println("nombre de empleado " +nombreEmp+ " horas trabajadas " +horasTrab+ " cuota " +cuotaHora);
           sueldo=(horasTrab*cuotaHora);
           System.out.println("nombre de empleado " +nombreEmp+ " sueldo " +sueldo);
           System.out.println("¿Desea procesar otro empleado (s/n)?");
           desea=L.next().charAt(0);
       }while(desea=='s');
       System.out.println("Elaborado por: \033[036m Eduardo Jacob Navarrete Rivas \n \033[035m Mi numero de lista es; 27 \n \033[032m grupo 3201");
    }
    
}