package v7_Interfaces_Funcionales_Estandar;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Flujo<T> {
    
    private final List<T> valores;

    public Flujo(List<T> valores) {
        this.valores = valores;
    }
    
    public static <T> Flujo<T> proveer(int size, Supplier<T> proveedor) {
        List<T> resultado = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            T valor = proveedor.get();
            if (!resultado.contains(valor)) {
                resultado.add(valor);
            }
        }
        return new Flujo<>(resultado);
    }

    public Flujo<T> filtra(Predicate<T> predicado) {
        List<T> resultado = new ArrayList<>();
        valores.forEach(n -> {
            if (predicado.test(n)) {
                resultado.add(n);
            }
        });
        return new Flujo<>(resultado);
    }

    public <R> Flujo<R> transformar(Function<T, R> funcion) {
        List<R> transformado = new ArrayList<>();
        valores.forEach(n -> {
            transformado.add(funcion.apply(n));
        });
        return new Flujo<>(transformado);
    }

    public Flujo<T> actuar(Consumer<T> accion) {
        valores.forEach(n -> {
            accion.accept(n);
        });
        return new Flujo<>(valores);
    }

    public void consumir(Consumer<T> accion) {
        valores.forEach(n -> {
            accion.accept(n);
        });
    }

    public T reducir(T identidad, BinaryOperator<T> funBinaria) {
        T suma = identidad;
        for (T n : valores) {
            suma = funBinaria.apply(suma, n);
        }
        return suma;
    }

    @Override
    public String toString() {
        return  valores.toString();
    }

}
