/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.data_structures;

/**
 *
 * @author Chan
 */
public class Linkedlist {
    private Nodo cabeza;

    public void agregarFinal(String dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }

    public void eliminarPrimero() {
        if (cabeza != null) {
            cabeza = cabeza.siguiente;
        }
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public String mostrarLista() {
        StringBuilder sb = new StringBuilder();
        Nodo temp = cabeza;
        while (temp != null) {
            sb.append("→ ").append(temp.dato).append("\n");
            temp = temp.siguiente;
        }
        return sb.toString();
    }
}
