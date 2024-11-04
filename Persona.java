/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

/**
 *
 * @author josemanuelsarmientoreyes
 */
public class Persona {
    String casa, nombre, deSuNombre, padre, madre, apodo, titulo, pareja,  ojos, cabello, notas, destino;
    String[] hijos;
    
    public Persona(String casa,String nombre, String deSuNombre, String padre,String madre, String apodo, String titulo, String pareja, String ojos,String cabello, String[] hijos){
        
        this.casa = casa;
        this.nombre = nombre;
        this.deSuNombre = deSuNombre;
        this.padre = padre;
        this.madre = madre;
        this.apodo = apodo;
        this.titulo = titulo;
        this.pareja = pareja;
        this.ojos = ojos;
        this.cabello = cabello;        
        this.hijos = hijos;
    }
}
