package ejercicio9;

public class Cliente extends Persona {

    private double credito;

    public Cliente (String nombre, int edad, String telefono, double credito) {
        setNombre(nombre);
        setEdad(edad);
        setTelefono(telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
