package com.mycompany.linkedlist;


import java.util.Scanner;
import newproyect.LinkedList;
/**
 *
 * @author Steven Vivas
 */
public class main {
   public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    LinkedList list = new LinkedList(); // se crea un objeto de la clase LinkedList
    
    //--------------------------------------Tamaño de la lista-------------------------------------------------------------------
    System.out.println("Cuantas posiciones desea ingresar en la lista: ");
    int in= entrada.nextInt();
    //-------------------------------------------------------------------------------------------------------------------------------------

     for (int i=0;i<in;i++){
        //--------------------------------------Ingreso de datos a la lista-------------------------------------------------------------------
        System.out.println("Ingrese un valor");
        int pr=entrada.nextInt(); //La variable "pr" es de primer elmento de la lista
        list.insert(pr);
        //-------------------------------------------------------------------------------------------------------------------------------------
    }
     
     if(list.isEmpty()){
         System.out.println("La lista está vacía ");
    }

    System.out.println("El primer elemento de la lista es: " + list.getHead()); // se muestra el primer elemento de la lista
    System.out.println("El último elemento de la lista es: " + list.getLast()); // se muestra el último elemento de la lista
    System.out.println("El tamaño de la lista es de: " + list.getSize()+" posiciones"); // se muestra el tamaño de la lista
    
    //--------------------------------------Buscar el index---------------------------------------------------------------------
    System.out.println("Que posición desea buscar: ");
    int b=entrada.nextInt(); //La variable "b" es de buscar
    //--------------------------------------------------------------------------------------------------------------------------
    
    
    System.out.println("El elemento en la posición "+b+" es: " + list.getValueAt(b)); // se muestra el valor del nodo en la posición a buscar
    
    
    //------------------------------Para reescribir el valor del index 0--------------------------------------------------------
    
    System.out.println("Reescrir valor del inicio? \n"+"si=1 o no=2 ");
    int ent= entrada.nextInt();
   
    if(ent==1){
        System.out.println("Escribir el nuevo valor de inicio: ");
        int nv=entrada.nextInt(); //Variable para remplazar el 1er valor
        list.setValueAt(0, nv);
        System.out.println("El primer elemento de la lista es: " + list.getHead()); // se muestra el primer elemento de la lista
        System.out.println("El último elemento de la lista es: " + list.getLast()); // se muestra el último elemento de la lista
    }
    else{
        System.out.println("Hasta luego ");
    }
    
    //----------------------------------------------------------------------------------------------------------------------------
    
    }
}
