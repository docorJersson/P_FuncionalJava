/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v2_superFunciones_Clases.clases;

import java.util.Random;
import v2_superFunciones_Clases.Interfaces.Proveedor;


public class Aleatorio implements Proveedor{
    Random random=new Random();
    @Override
    public Integer obtener() {
        return random.nextInt(1000);
    }
    
}
