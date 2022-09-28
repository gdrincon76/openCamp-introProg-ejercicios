package ejercicio8;

public class Main {
    public static void main(String[] args) {

        int edad;
        String nombre;
        String telefono;
        Persona persona = new Persona();

        persona.setNombre("Chinaski");
        persona.setEdad(45);
        persona.setTelefono("934567891");

        edad = persona.getEdad();
        nombre = persona.getNombre();
        telefono = persona.getTelefono();

        System.out.println("nombre: " + nombre + ", edad: " + edad + ", teléfono: " + telefono);


    }
}



