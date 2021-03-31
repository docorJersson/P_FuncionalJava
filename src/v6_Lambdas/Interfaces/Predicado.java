
package v6_Lambdas.Interfaces;

@FunctionalInterface
public interface Predicado<T> {
    boolean test(T valor);
}
