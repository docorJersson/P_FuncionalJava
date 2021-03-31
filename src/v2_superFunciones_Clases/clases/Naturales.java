package v2_superFunciones_Clases.clases;

import v2_superFunciones_Clases.Interfaces.Proveedor;

public class Naturales implements Proveedor {

    private static int next = 0;

    @Override
    public Integer obtener() {
        return next++;
    }

}
