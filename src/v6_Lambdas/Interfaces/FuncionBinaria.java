/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v6_Lambdas.Interfaces;

@FunctionalInterface
public interface FuncionBinaria<T,U,R> {
    R aplicar(T valor1,U valor2);
     
}
