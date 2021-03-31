package v7_Interfaces_Funcionales_Estandar;

import java.util.Random;


public class P_Funcional1_v2 {
        Random random = new Random();
    public static void main(String[] args) {
        new P_Funcional1_v2();
    }

    public P_Funcional1_v2() {

        Integer total = Flujo.proveer(10, () ->random.nextInt(80))
                .filtra(valor -> valor % 2 == 0)
                .transformar(valor -> valor * valor)
                .actuar(valor -> System.out.println(valor))
                .reducir(0, (valor1, valor2) -> valor1 + valor2);

        System.out.println("SUMA DE CUADRADOS :" + total);
    }

}
