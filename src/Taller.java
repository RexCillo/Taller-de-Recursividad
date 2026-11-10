public class Taller {
    //Primer Punto Factorial de n
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //Segundo Punto Suma de 1 a n
    public static int suma(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + suma(n - 1);
    }

    //Tercer Punto Potencia de n a la m
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    //Cuarto Punto Contar Digitos de un número n
    public static int contarDigitos(int n) {
        n = Math.abs(n);
        if (n < 10) {
            return 1;
        }
        return 1 + contarDigitos(n / 10);
    }

    //Quinto Punto Invertir Texto
    public static String invertir(String cadena) {
        if (cadena == null || cadena.length() <= 1) {
            return cadena;
        }
        return invertir(cadena.substring(1)) + cadena.charAt(0);
    }
}
