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
public class Materia {
    
    public String nombre;
    public int nivel;
    public int materias;
    
    
    public Materia(String nombre, int nivel){
    this.nombre=nombre;
    this.nivel=nivel;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    @Override
    
    public String toString (){
        
     return nombre;
        
    }
    
    
}
