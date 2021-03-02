/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;

/**
 *
 * @author Liliana Lozano
 */
public class Celular { //esto siempre va en singular y primera mayus
    //atributos
    //Upper camel case
    //sintaxis para crear variables
    //modificador de acceso + tipo + nombre
    //Lower camel case (todo minus, si tiene segunda palabra empieza con mayus)
    
    //contexto
    
    private String marca;
    private String capacidad;
    private String tamaño;
    private String color;
    private double precio;
    private String modelo;
    private boolean chino;
    
//    private String vi,v2,v3,v4,v5;
    //metodos
    //metodo especial (constructor)
    //sintaxis creacion constructor
    //modificador
    //metodos o funciones
    //sintaxis creacion de metodos
    //modaccess tpo Nombre
    
    public Celular(){
    
    }
    //
    public void Llamar(int numero){
        System.out.println("Marcadando al numero: "+ numero + "...");             
     
    }
    
}
