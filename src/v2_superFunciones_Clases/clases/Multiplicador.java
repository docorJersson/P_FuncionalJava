package v2_superFunciones_Clases.clases;

import java.math.BigInteger;
import v2_superFunciones_Clases.Interfaces.FuncionBinaria;


public class Multiplicador implements FuncionBinaria{

    @Override
    public BigInteger aplicar(BigInteger valor1, Integer valor2) {
        return valor1.multiply(BigInteger.valueOf(valor2));
    }
    
}
