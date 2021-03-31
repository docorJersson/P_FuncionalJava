package v6_Lambdas.Interfaces;

@FunctionalInterface
public interface Funcion<T,R> {
    R aplicar(T valor);
}
