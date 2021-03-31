
package v5_Flujo.Interfaces;

import v4_superFunciones_Cases.Interfaces.*;
import v2_superFunciones_Clases.Interfaces.*;


public interface Predicado<T> {
    boolean test(T valor);
}
