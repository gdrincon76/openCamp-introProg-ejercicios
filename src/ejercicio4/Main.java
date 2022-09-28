package ejercicio4;

public class Main {
    public static void main(String[] args) {

        // bloque if

        checkNumSign(0);

        // bloque while

        int numWhile = 0;
        while(numWhile < 3) {
            System.out.println(numWhile++);
        }

        //bloque do while
        int doWhile = 2;

        do {
            doWhile++;
            System.out.println("do while " + doWhile);

        } while(doWhile < 3);

        //bloque for
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("for " + numeroFor);
        }

        // bloque switch
        for(int estacion = 1; estacion <= 5;  estacion++ ) {
            switch (estacion) {
                case 1:
                    System.out.println("Primavera");
                    break;
                case 2:
                    System.out.println("Verano");
                    break;
                case 3:
                    System.out.println("Otoño");
                    break;
                case 4:
                    System.out.println("Invierno");
                    break;
                default:
                    System.out.println("no es una estación");
            }
        }
    }

    public static void checkNumSign (int numeroIf) {
        String sign = "";

        if(numeroIf < 0) {
            sign = "negativo";
        } else if(numeroIf > 0) {
            sign = "positivo";
        } else {
            sign = "cero";
        }
        System.out.println(sign);
    }

}