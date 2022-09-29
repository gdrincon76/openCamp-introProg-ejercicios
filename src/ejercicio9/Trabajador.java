package ejercicio9;

public class Trabajador extends Persona {

    private double salario;

    public Trabajador (String nombre, int edad, String telefono, double salario) {
        setNombre(nombre);
        setEdad(edad);
        setTelefono(telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;

    }

    @Override
    public String toString() {
        return "Trabajador{ " + " nombre= " + getNombre() + ", " + " edad= " + getEdad() + ", " + " teléfono= " + getTelefono() +
                " salario= " + salario +
                '}';
    }
}
