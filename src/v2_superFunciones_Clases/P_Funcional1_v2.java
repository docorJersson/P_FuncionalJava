package v2_superFunciones_Clases;

import java.math.BigInteger;
import p_funcional1.*;
import java.util.ArrayList;
import java.util.List;
import v2_superFunciones_Clases.clases.Aleatorio;
import v2_superFunciones_Clases.clases.Impresor;
import v2_superFunciones_Clases.clases.Multiplicador;
import v2_superFunciones_Clases.clases.Naturales;
import v2_superFunciones_Clases.clases.PotenciaCuadrada;
import v2_superFunciones_Clases.clases.Sumador;
import v2_superFunciones_Clases.clases.raizCuadrada;
import v2_superFunciones_Clases.clases.soloImpares;
import v2_superFunciones_Clases.clases.soloPares;

public class P_Funcional1_v2 {

    public static void main(String[] args) {
        new P_Funcional1_v2();
    }

    public P_Funcional1_v2() {

        //CREO UNA LISTA
        List<Integer> numeros = superFunciones.proveer(10, new Aleatorio());
        //O PUEDEN SER ALEATORIOS
//        List<Integer> numeros = superFunciones.proveer(10, new Aleatorios());

        System.out.println(numeros);

        //FILTRO NÚMEROS PARES
        List<Integer> pares = superFunciones.filtra(numeros, new soloImpares());
        System.out.println(pares);

        List<Integer> transformados = superFunciones.transformar(pares, new PotenciaCuadrada());
        System.out.println(transformados);

        //REOTRNA UNA LISTA
            // List<Integer> mostrados = superFunciones.actuar(transformados, new Impresor());
        //NO RETORNA UNA LISTA
        superFunciones.consumir(transformados, new Impresor());
        
        BigInteger suma = superFunciones.reducir(transformados,0,new Sumador());
        BigInteger multiplicador=superFunciones.reducir(transformados,1,new Multiplicador());
        System.out.println("SUMA DE CUADRADOS :" + suma);
        System.out.println("MULTIPLICADOR DE CUADRADOS: "+multiplicador);
    }

 

}
