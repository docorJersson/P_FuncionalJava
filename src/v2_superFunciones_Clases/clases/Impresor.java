
package v2_superFunciones_Clases.clases;

import v2_superFunciones_Clases.Interfaces.Accion;

public class Impresor implements Accion{

    @Override
    public void aceptar(Integer valor) {
        System.out.println(valor);
    }
    
}
