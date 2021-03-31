package v3_superFunciones_Inline_Clases;

import v2_superFunciones_Clases.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import v2_superFunciones_Clases.Interfaces.Accion;
import v2_superFunciones_Clases.Interfaces.Funcion;
import v2_superFunciones_Clases.Interfaces.FuncionBinaria;
import v2_superFunciones_Clases.Interfaces.Predicado;
import v2_superFunciones_Clases.Interfaces.Proveedor;

public class superFunciones {

    public static List<Integer> filtra(List<Integer> valores, Predicado predicado) {
        List<Integer> resultado = new ArrayList<>();
        valores.forEach(n -> {
            if (predicado.test(n)) {
                resultado.add(n);
            }
        });
        return resultado;
    }

    public static List<Integer> proveer(int size, Proveedor proveedor) {
        List<Integer> resultado = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            resultado.add(proveedor.obtener());
        }
        return resultado;
    }

    public static List<Integer> transformar(List<Integer> valores, Funcion funcion) {
        List<Integer> transformado = new ArrayList<>();
        valores.forEach(n -> {
            transformado.add(funcion.aplicar(n));
        });
        return transformado;
    }

    public static List<Integer> actuar(List<Integer> valores, Accion accion) {
        valores.forEach(n -> {
            accion.aceptar(n);
        });
        return valores;
    }

    public static void consumir(List<Integer> valores, Accion accion) {
        valores.forEach(n -> {
            accion.aceptar(n);
        });
    }

    public static BigInteger reducir(List<Integer> valores, Integer identidad, FuncionBinaria funBinaria) {
        BigInteger suma=BigInteger.valueOf(identidad);
        for (Integer n : valores) {
            suma = funBinaria.aplicar(suma, n);
        }
        return suma;
    }

}
