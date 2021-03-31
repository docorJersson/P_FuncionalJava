package v8_Method_References;

public class NumberUtils {

    private NumberUtils() {
    }

    public static boolean esPrimo(int valor) {
        for (int i = 2; i < valor; i++) {
            if (valor % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int elevarAlCuadrado(int valor) {
        return valor * valor;
    }
}
