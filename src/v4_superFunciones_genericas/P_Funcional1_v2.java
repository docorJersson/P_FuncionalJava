package v4_superFunciones_genericas;

import java.math.BigInteger;
import java.util.List;
import java.util.Random;
import v4_superFunciones_Cases.Interfaces.Accion;
import v4_superFunciones_Cases.Interfaces.Funcion;
import v4_superFunciones_Cases.Interfaces.FuncionBinaria;
import v4_superFunciones_Cases.Interfaces.OperadorBinario;
import v4_superFunciones_Cases.Interfaces.OperadorUnario;
import v4_superFunciones_Cases.Interfaces.Predicado;
import v4_superFunciones_Cases.Interfaces.Proveedor;

public class P_Funcional1_v2 {

    public static void main(String[] args) {
        new P_Funcional1_v2();
    }

    public P_Funcional1_v2() {

        //1-CREO UNA LISTA
        List<Integer> numeros = superFunciones.proveer(10, new Proveedor<Integer>() {
            Random random = new Random();

            @Override
            public Integer obtener() {
                return random.nextInt(20);
            }
        });
        //O PUEDEN SER ALEATORIOS
//        List<Integer> numeros = superFunciones.proveer(10, new Aleatorios());

        System.out.println(numeros);

        //FILTRO NÚMEROS PARES
        List<Integer> pares = superFunciones.filtra(numeros, new Predicado<Integer>() {
            @Override
            public boolean test(Integer valor) {
                return valor % 2 == 0;
            }
        });
        System.out.println(pares);

        //3.A-OBTENER EL CUADRADO DE CADA NÚMERO
        List<Integer> transformados = superFunciones.transformar(pares, new OperadorUnario<Integer>() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        });

        //3.A-OBTENER EL CUADRADO DE CADA NÚMERO EN CADENA
        List<String> transformados2 = superFunciones.transformar(pares, new Funcion<Integer, String>() {
            @Override
            public String aplicar(Integer valor) {
                return "Valor: " + (valor * valor);
            }
        });
        System.out.println(transformados);
        System.out.println(transformados2);

        //REOTRNA UNA LISTA
        // List<Integer> mostrados = superFunciones.actuar(transformados, new Impresor());
        //NO RETORNA UNA LISTA
        superFunciones.consumir(transformados, new Accion<Integer>() {
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        });

        Integer suma = superFunciones.reducir(transformados, 0, new OperadorBinario<Integer>() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1 + valor2;
            }
        });

        Integer multiplicador = superFunciones.reducir(transformados, 1, new OperadorBinario<Integer>() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1 * valor2;
            }
        });

        System.out.println("SUMA DE CUADRADOS :" + suma);
        System.out.println("MULTIPLICADOR DE CUADRADOS: " + multiplicador);
    }

}
