/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author josemanuelsarmientoreyes
 */
public class LeerJson {
    
    
    public Arbol leerArchivo(String path) throws FileNotFoundException, IOException{
        
        Arbol arbol = new Arbol();
        
         // lee el archivo 
        FileReader reader = new FileReader(path);
        
        BufferedReader bufferedReader = new BufferedReader(reader);
        
        StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line); 

            }
            
        // transforma el archivo a un string
            String json = stringBuilder.toString();
        
        
        //convierte el archivo a un objeto JSON
            JSONObject Casa = new JSONObject(json);
        
            String casa = Casa.keys().next();
        // transfroma la lista de personas en un JSONArray
        JSONArray listaPersonas = Casa.getJSONArray(Casa.keys().next());
        
        //Itera sobre el JSONArray para 
            for (int i = 0; i < listaPersonas.length(); i++){
            
                 

             String deSuNombre = null;
             String padre = null;
             String ojos = null;
             String cabello = null;
             String name = null;
             String hijos = null;
             String notas = null;
             String destino = null;
             
             
            JSONObject persona = listaPersonas.getJSONObject(i);
            
            String nombre = persona.keys().next();
            
            JSONArray listaAttr = persona.getJSONArray(nombre);
            boolean padreNoAnanido = true;
            
                for (int f = 0; f < listaAttr.length(); f++){
                    
                    
                    
                    JSONObject attr = listaAttr.getJSONObject(f);
                
                    String key = attr.keys().next();
                
                    if ("Of his name".equals(key)){
                     deSuNombre = attr.getString(key);
                    }
                    
                    if ("Born to".equals(key) && padreNoAnanido){
                     padre = attr.getString(key);
                     padreNoAnanido = false;
                     
                    } 
                           
                    if ("Of eyes".equals(key) ){
                        ojos = attr.getString(key);
                     }
                    
                    if ("Of hair".equals(key)){
                      cabello = attr.getString(key);
                    }
                    
                    if ("Father to".equals(key)){
                        
                       JSONArray namesArray = attr.getJSONArray(key);
                       
                     StringBuilder stringBuilderHijos = new StringBuilder();
                     
                     for (int p = 0; p < namesArray.length(); p++) {
                      name = namesArray.getString(p);
                      stringBuilderHijos.append(name).append(", ");
                        
                        }
                        hijos = stringBuilderHijos.toString();
                     }
                    
                    if ("Notes".equals(key)){
                        notas = attr.getString(key);
                    }
                    if ("Fate".equals(key)){
                        destino = attr.getString(key);
                    }
                    
                    
                }
                
                
                System.out.println(nombre);
                System.out.println(deSuNombre);
                System.out.println(padre);
                System.out.println(ojos);
                System.out.println(cabello);
                System.out.println(hijos);
                System.out.println(notas);
                System.out.println(destino);
                System.out.println("///////////////////////////////////////////////////");
                
                
            }
            
     
    
            
            
      return arbol;     
    }
   } 

