package Taller19.Ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        return "usuarioOAuth".equals(usuario) && "5678".equals(contrasena);
    }
}
