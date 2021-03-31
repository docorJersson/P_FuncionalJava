package v5_Flujo;

import java.util.Random;
import v5_Flujo.Interfaces.Accion;
import v5_Flujo.Interfaces.Funcion;
import v5_Flujo.Interfaces.OperadorBinario;
import v5_Flujo.Interfaces.OperadorUnario;
import v5_Flujo.Interfaces.Predicado;
import v5_Flujo.Interfaces.Proveedor;

public class P_Funcional1_v2 {

    public static void main(String[] args) {
        new P_Funcional1_v2();
    }

    public P_Funcional1_v2() {

        Integer total = Flujo.proveer(10, new Proveedor<Integer>() {
            Random random = new Random();

            @Override
            public Integer obtener() {
                return random.nextInt(50);
            }
        }).filtra(new Predicado<Integer>() {
            @Override
            public boolean test(Integer valor) {
                return valor % 2 == 0;
            }
        }).transformar(new OperadorUnario<Integer>() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        }).actuar(new Accion<Integer>() {
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        }).reducir(0, new OperadorBinario<Integer>() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1 + valor2;
            }
        });

        System.out.println("SUMA DE CUADRADOS :" + total);
    }

}
