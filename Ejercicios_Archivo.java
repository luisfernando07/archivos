/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author IST.LOJA
 */
public class Ejercicios_Archivo {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Presione 1 para documentos, 2 para imagenes, 3 para musica, 4 para videos, 5 para archivos Netbeans ");
        int opc = 0;
        try {
            opc = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("Ingrese un numero correcto");
        }
        switch (opc){
            case 1:
                File carpeta = new File("C:\\Users\\IST.LOJA\\Documents");
                String [] arregloarchivos=carpeta.list();
                for (int i = 0; i < arregloarchivos.length; i++){
                    System.out.println(arregloarchivos[i]);
                }
            break;
            case 2:
                 File carpeta2 = new File("C:\\Users\\IST.LOJA\\Pictures");
                String [] arregloarchivos2=carpeta2.list();
                for (int i = 0; i < arregloarchivos2.length; i++){
                    System.out.println(arregloarchivos2[i]);
                }
            break;
            case 3:
             File carpeta3 = new File("C:\\Users\\IST.LOJA\\Music");
                String [] arregloarchivos3=carpeta3.list();
                for (int i = 0; i < arregloarchivos3.length; i++){
                    System.out.println(arregloarchivos3[i]);
                }
            break;
            case 4:
                 File carpeta4 = new File("C:\\Users\\IST.LOJA\\Videos");
                String [] arregloarchivos4=carpeta4.list();
                for (int i = 0; i < arregloarchivos4.length; i++){
                    System.out.println(arregloarchivos4[i]);
                }
            break;
            case 5:
                 File carpeta5 = new File ("C:\\Users\\IST.LOJA\\Documents/NetBeansProjects");
                String [] arregloarchivos5=carpeta5.list();
                for (int i = 0; i < arregloarchivos5.length; i++){
                    System.out.println(arregloarchivos5[i]);
                }
            break;
                
                
        }
    }
    
}
    

