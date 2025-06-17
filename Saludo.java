public class Saludo{
    public String generarSaludo(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
        return " iHota, Invitado!";
        }
    return " iHola, " + nombre;
    }
}
 
