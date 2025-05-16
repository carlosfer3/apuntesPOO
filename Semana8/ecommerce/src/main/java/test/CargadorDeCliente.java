package test;

import modelo.Cliente;

public class CargadorDeCliente {
    public static Cliente cargarCliente() {
        String nombre = "Carlos";
        String correo = "ferbenjamin03@gmail.com";
        String direccion = "LarcoMar, Miraflores";
        
        return new Cliente(nombre, direccion, correo);
    }
}
