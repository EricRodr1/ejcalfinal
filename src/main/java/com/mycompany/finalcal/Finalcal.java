/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finalcal;

import java.util.Scanner;

/**
 *
 * @author Eric Rodriguez
 */
public class Finalcal {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Favor ingresar calf1");
     float calf1 = sc.nextFloat();
     
     System.out.print("Favor ingresar calf2");
     float calf2 = sc.nextFloat();
     
     System.out.print("Favor ingresar calf3");
     float calf3 = sc.nextFloat();
     
     
     float calificacionesparciales = (calf1 + calf2 + calf3)/3;
     
     System.out.println("Su promedio es: "+ calificacionesparciales);
     
     
     System.out.print("Favor ingresar calfexamenfinal");
     float calfexamenfinal = sc.nextFloat();
     
     System.out.print("Favor ingresar caltrabajofinal");
     float caltrabajofinal = sc.nextFloat();
     
     double calificacionFinal = (calificacionesparciales * 0.55) + (calfexamenfinal * 0.30) + (caltrabajofinal * 0.15);
     System.out.println("Su promedio es: "+ calificacionFinal);
    }
}
