/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v2_superFunciones_Clases.clases;

import v2_superFunciones_Clases.Interfaces.Predicado;

/**
 *
 * @author Jersson Chilon
 */
public class soloPares implements Predicado {

    @Override
    public boolean test(Integer valor) {
        return valor % 2 == 0;
    }

}
