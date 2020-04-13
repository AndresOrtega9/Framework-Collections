/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadolista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Andres Ortega
 */
public class MercadoLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
// Definir 5 instancias de la Clase Producto

        ArrayList<Producto> lista = new ArrayList<>();

        Producto gaseosa = new Producto("gaseosa", 6);
        Producto paquetes = new Producto("paquetes", 2);
        Producto manzanas = new Producto("manzanas", 5);
        Producto lentejas = new Producto("lentejas", 2);
        Producto aceite = new Producto("aceite", 2);

        lista.add(paquetes);
        lista.add(aceite);
        lista.add(manzanas);
        lista.add(gaseosa);
        lista.add(lentejas);

        Collections.sort(lista);

        for (Producto aux : lista) {
            System.out.println(aux);
        }

        System.out.println(" Lista del mercado con " + lista.size()
                + " productos");

// Se declara una instancia Iterator it la cual facilita recorrer los objetos, para extraer e imprimir sus valores 
        Iterator it = lista.iterator();
//verifica si existe otro elemento con el método hasNext()
        while (it.hasNext()) {
            Object objeto = it.next();
            Producto producto = (Producto) objeto;
            System.out.println(producto);
        }

// Eliminar elemento de ArrayList. Se elimina el objeto con índice 2 con el método remove. Se muestra la nueva lista.
        lista.remove(2);
        System.out.println(" Lista del mercado con " + lista.size() + " productos");

// Definir Iterator para extraer e imprimir valores 
        Iterator it2 = lista.iterator();
        while (it2.hasNext()) {
            Producto producto = (Producto) it2.next();
            System.out.println(producto);
        }

// Eliminar todos los valores del ArrayList, Se eliminan todos los objetos mediante el método clear. 
        lista.clear();
        System.out.println(" Lista del mercado con " + lista.size() + " productos");
    }

}
