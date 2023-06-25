/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newproyect;


import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Steven Vivas
 */

        // TODO code application logic here
        
public class LinkedList {
    private Node head; // el primer nodo de la lista
    private int size; // el tamaño de la lista
    
    // Constructor de la clase LinkedList
    public LinkedList() {
        this.head = null; // al crear una lista vacía, el primer nodo es null
        this.size = 0; // al crear una lista vacía, su tamaño es 0
    }
    
    // Método para validar si la lista está vacía
    public boolean isEmpty() {
        return head == null; // si el primer nodo es null, la lista está vacía
    }
    
    // Método para mostrar el primer elemento de la lista
    public int getHead() {
        return head.data; // devuelve el valor del primer nodo de la lista
    }
    
    // Método para mostrar el último elemento de la lista
    public int getLast() {
        Node current = head; // se crea una referencia al primer nodo
        while (current.next != null) { // mientras el siguiente nodo no sea null
            current = current.next; // se avanza al siguiente nodo
        }
        return current.data; // se devuelve el valor del último nodo
    }
    
    // Método para obtener el tamaño de la lista
    public int getSize() {
        return size; // devuelve el tamaño de la lista
    }
    
    // Método para obtener el valor de un nodo en una posición específica de la lista
    public String getValueAt(int index) {
        Node current = head; // se crea una referencia al primer nodo
        int count = 0; // se inicializa un contador en 0
        while (current != null) { // mientras el nodo actual no sea null
            if (count == index) { // si el contador es igual al índice buscado
                return ""+ current.data; // se devuelve el valor del nodo actual
            }
            count++; // se incrementa el contador
            current = current.next; // se avanza al siguiente nodo
        }
        return "No se encontro"; // si no se encuentra el nodo en la posición buscada, se devuelve -1
    }
    
    // Método para insertar un nuevo nodo al final de la lista
    public void insert(int data) {
        Node newNode = new Node(data); // se crea un nuevo nodo con el valor dado
        if (head == null) { // si la lista está vacía
            head = newNode; // el primer nodo es el nuevo nodo
        } else {
            Node current = head; // se crea una referencia al primer nodo
            while (current.next != null) { // mientras el siguiente nodo no sea null
                current = current.next; // se avanza al siguiente nodo
            }
            current.next = newNode; // se inserta el nuevo nodo al final de la lista
        }
        size++; // se incrementa el tamaño de la lista
    }
    
    // Clase privada para representar los nodos individuales de la lista
    private class Node {
        int data; // el valor del nodo
        Node next; // la referencia al siguiente nodo en la lista
        
        // Constructor de la clase Node
        public Node(int data) {
            this.data = data;
            this.next = null; // al crear un nuevo nodo, el siguiente nodo en la lista es null
        }
    }
    // Método para cambiar el valor de un nodo en una posición específica de la lista
public void setValueAt(int index, int value) {
    Node current = head; // se crea una referencia al primer nodo
    int count = 0; // se inicializa un contador en 0
    while (current != null) { // mientras el nodo actual no sea null
        if (count == index) { // si el contador es igual al índice buscado
            current.data = value; // se cambia el valor del nodo actual
            break;
            }
        count++; // se incrementa el contador
        current = current.next; // se avanza al siguiente nodo
        }
    }

     
}

