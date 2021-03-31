package v5_Flujo;

import java.util.ArrayList;
import java.util.List;
import v5_Flujo.Interfaces.*;

public class Flujo<T> {
    
    private final List<T> valores;

    public Flujo(List<T> valores) {
        this.valores = valores;
    }
    
    
    
    public static <T> Flujo<T> proveer(int size, Proveedor<T> proveedor) {
        List<T> resultado = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            T valor = proveedor.obtener();
            if (!resultado.contains(valor)) {
                resultado.add(valor);
            }
        }
        return new Flujo<>(resultado);
    }

    public Flujo<T> filtra(Predicado<T> predicado) {
        List<T> resultado = new ArrayList<>();
        valores.forEach(n -> {
            if (predicado.test(n)) {
                resultado.add(n);
            }
        });
        return new Flujo<>(resultado);
    }

    public <R> Flujo<R> transformar(Funcion<T, R> funcion) {
        List<R> transformado = new ArrayList<>();
        valores.forEach(n -> {
            transformado.add(funcion.aplicar(n));
        });
        return new Flujo<>(transformado);
    }

    public Flujo<T> actuar(Accion<T> accion) {
        valores.forEach(n -> {
            accion.aceptar(n);
        });
        return new Flujo<>(valores);
    }

    public void consumir(Accion<T> accion) {
        valores.forEach(n -> {
            accion.aceptar(n);
        });
    }

    public T reducir(T identidad, OperadorBinario<T> funBinaria) {
        T suma = identidad;
        for (T n : valores) {
            suma = funBinaria.aplicar(suma, n);
        }
        return suma;
    }

    @Override
    public String toString() {
        return  valores.toString();
    }

}
