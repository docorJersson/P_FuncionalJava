
package v6_Lambdas.Interfaces;

@FunctionalInterface
public interface Accion<T> {
    void aceptar(T valor);
}
