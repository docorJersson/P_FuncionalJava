/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v2_superFunciones_Clases.clases;

import v2_superFunciones_Clases.Interfaces.Funcion;


public class raizCuadrada implements Funcion{

    @Override
    public Integer aplicar(Integer valor) {
        return (int)Math.sqrt(valor);
    }
    
    
}
