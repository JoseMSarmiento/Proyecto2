/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

/**
 *
 * @author josemanuelsarmientoreyes
 */
public class Arbol {
    private NodoPersona root;
    
    public Arbol(){
        this.root = null;
    }
    
    public void add(NodoPersona n){
        
        
        
    }
    
    public void preOrden(NodoPersona root){
        if (root != null){
            System.out.println(root.persona.nombre);
            preOrden(root.hijoIzq);
            preOrden(root.hijoDer);
        }
        
    }
    
}
