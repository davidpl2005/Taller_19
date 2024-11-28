package Taller19.Ejercicio2;

public interface Almacenamiento {
    void guardarArchivo(String nombre, String contenido);
    String recuperarArchivo(String nombre);
}
