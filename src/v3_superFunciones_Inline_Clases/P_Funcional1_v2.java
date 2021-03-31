package v3_superFunciones_Inline_Clases;

import v2_superFunciones_Clases.*;
import java.math.BigInteger;
import p_funcional1.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import v2_superFunciones_Clases.Interfaces.Accion;
import v2_superFunciones_Clases.Interfaces.Funcion;
import v2_superFunciones_Clases.Interfaces.FuncionBinaria;
import v2_superFunciones_Clases.Interfaces.Predicado;
import v2_superFunciones_Clases.Interfaces.Proveedor;
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
        List<Integer> numeros = superFunciones.proveer(10, new Proveedor() {
            Random random = new Random();

            @Override
            public Integer obtener() {
                return random.nextInt(1000);
            }
        });
        //O PUEDEN SER ALEATORIOS
//        List<Integer> numeros = superFunciones.proveer(10, new Aleatorios());

        System.out.println(numeros);

        //FILTRO NÚMEROS PARES
        List<Integer> pares = superFunciones.filtra(numeros, new Predicado() {
            @Override
            public boolean test(Integer valor) {
                return valor % 2 == 0;
            }
        });
        System.out.println(pares);

        List<Integer> transformados = superFunciones.transformar(pares, new Funcion() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        });
        System.out.println(transformados);

        //REOTRNA UNA LISTA
        // List<Integer> mostrados = superFunciones.actuar(transformados, new Impresor());
        //NO RETORNA UNA LISTA
        Accion accion = new Accion() {
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        };

        superFunciones.consumir(transformados, accion);

        FuncionBinaria fBinaria = new FuncionBinaria() {
            @Override
            public BigInteger aplicar(BigInteger valor1, Integer valor2) {
                return valor1.add(BigInteger.valueOf(valor2));
            }
        };
        BigInteger suma = superFunciones.reducir(transformados, 0, fBinaria);

        FuncionBinaria funcionBinaria = new FuncionBinaria() {
            @Override
            public BigInteger aplicar(BigInteger valor1, Integer valor2) {
                return valor1.multiply(BigInteger.valueOf(valor2));
            }
        };
        BigInteger multiplicador = superFunciones.reducir(transformados, 1, funcionBinaria);
        System.out.println("SUMA DE CUADRADOS :" + suma);
        System.out.println("MULTIPLICADOR DE CUADRADOS: " + multiplicador);
    }

}
