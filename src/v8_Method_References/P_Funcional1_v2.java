package v8_Method_References;

import java.util.Random;

public class P_Funcional1_v2 {

    Random random = new Random();

    public static void main(String[] args) {
        new P_Funcional1_v2();
    }

    public P_Funcional1_v2() {

        Integer total = Flujo.proveer(10, this::randomInt)
                //.filtra(valor -> esPrimo(valor))
                .filtra(NumberUtils::esPrimo)
                .transformar(NumberUtils::elevarAlCuadrado)
                .actuar(System.out::println)
                .reducir(0, Integer::sum);

        System.out.println("SUMA DE CUADRADOS :" + total);
    }

    private int randomInt() {
        return random.nextInt(50);
    }
}
