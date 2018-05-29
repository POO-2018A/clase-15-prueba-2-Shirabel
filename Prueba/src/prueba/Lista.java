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
public class Lista {
    
    public String nombre;
    public int edad;
    public Materia [] materias;
    public int cantEstudiantes;
    public Lista [] lista;
    
    public Lista(String nombre,int edad,Materia[] materias,Lista[]lista){
    this.nombre=nombre;
    this.edad=edad;
    this.materias=materias;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }


    
    
    
    
}
