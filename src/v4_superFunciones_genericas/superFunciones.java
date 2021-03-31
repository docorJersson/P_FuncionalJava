package v4_superFunciones_genericas;

import java.util.ArrayList;
import java.util.List;
import v4_superFunciones_Cases.Interfaces.*;

public class superFunciones {

    public static <T> List<T> proveer(int size, Proveedor<T> proveedor) {
        List<T> resultado = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            T valor = proveedor.obtener();
            if (!resultado.contains(valor)) {
                resultado.add(valor);
            }
        }
        return resultado;
    }

    public static <T> List<T> filtra(List<T> valores, Predicado<T> predicado) {
        List<T> resultado = new ArrayList<>();
        valores.forEach(n -> {
            if (predicado.test(n)) {
                resultado.add(n);
            }
        });
        return resultado;
    }

    public static <T, R> List<R> transformar(List<T> valores, Funcion<T, R> funcion) {
        List<R> transformado = new ArrayList<>();
        valores.forEach(n -> {
            transformado.add(funcion.aplicar(n));
        });
        return transformado;
    }

    public static <T> List<T> actuar(List<T> valores, Accion<T> accion) {
        valores.forEach(n -> {
            accion.aceptar(n);
        });
        return valores;
    }

    public static <T> void consumir(List<T> valores, Accion<T> accion) {
        valores.forEach(n -> {
            accion.aceptar(n);
        });
    }

    public static <T> T reducir(List<T> valores, T identidad, OperadorBinario<T> funBinaria) {
        T suma = identidad;
        for (T n : valores) {
            suma = funBinaria.aplicar(suma, n);
        }
        return suma;
    }

}
