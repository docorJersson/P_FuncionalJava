/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v5_Flujo.Interfaces;

import v4_superFunciones_Cases.Interfaces.*;
import java.math.BigInteger;

public interface FuncionBinaria<T,U,R> {
    R aplicar(T valor1,U valor2);
     
}
