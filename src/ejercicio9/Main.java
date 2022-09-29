package ejercicio9;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Chinaski", 34, "932456789", 3.5);
        String clienteInfo = cliente.getNombre() + " " + cliente.getEdad() + " " + cliente.getTelefono() + " " + cliente.getCredito();
        System.out.println(clienteInfo);

        Trabajador trabajador = new Trabajador("Henry", 24, "932456789", 1500);
        System.out.println(trabajador);



    }
}
