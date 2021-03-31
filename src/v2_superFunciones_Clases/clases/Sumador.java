
package v2_superFunciones_Clases.clases;

import java.math.BigInteger;
import v2_superFunciones_Clases.Interfaces.FuncionBinaria;


public class Sumador implements FuncionBinaria{

    @Override
    public BigInteger aplicar(BigInteger valor1, Integer valor2) {
        return valor1.add(BigInteger.valueOf(valor2));
    }
    
}
