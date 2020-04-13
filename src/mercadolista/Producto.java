/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadolista;

/**
 *
 * @author Andres Ortega
 */
public class Producto implements Comparable<Producto> {

    private String nombre;
    private int cantidad;

    public Producto(String s, int i) {
        nombre = s;
        cantidad = i;
    }

    public String toString() {
        return ("Nombre: " + nombre + " Cantidad: " + cantidad);
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCant() {

        return cantidad;
    }

    @Override
    public int compareTo(Producto o) {
        if (o.getCant() < cantidad) {
            return -1;
        } else if (o.getCant() < cantidad) {
            return 0;
        } else {
            return 1;
        }
    }
}
