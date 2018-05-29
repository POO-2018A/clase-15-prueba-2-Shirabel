/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
/**
 *
 * @author ESFOT
 */
//import java.util.Date;
import java.util.Scanner;


public class Prueba {

    /**
     * @param args the command line arguments
     */
    public Lista [] estudiantes;
    //public String nombre;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan= new Scanner(System.in);

        System.out.println("Ingrese la cantidad de estudiantes");
        int cantEstudiantes= scan.nextInt();
        Lista[] estudiantes = new Lista[cantEstudiantes]; 
        
        System.out.println("ingrese el nombre del estudiante");
        //String nombre = scan.nextLine();
        
        for(int i=0; i>=cantEstudiantes; i++){
        
            System.out.println("Ingresa el nombre del estuandiante"+i);
            String nombre = scan.nextLine();
        }
      
        System.out.println("ingrese la edad del estudiante");
        int edad =scan.nextInt();
        
        System.out.println("ingrese las materias del estudiante");
        int materias=scan.nextInt();
        Materia[] materia = new Materia [materias];
        
        
        
        /*if (materias >2){
            
            System.out.println("el estudiante solo toma dos materias ");
           
        }else{
            
            System.out.println(" ");
        
        } */
        
        do{
        
            System.out.println("la cantidad de estudiantes que ingresaste son:"+cantEstudiantes);
              for(int i=1; i<=cantEstudiantes; i++){
                System.out.println("E"+i);
                System.out.println("sus materias son: " +"M"+ materias);
              }
            
            
        
        
        }while(materias>3);
    }
    
}
