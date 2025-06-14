public class ConsumoGasolina {

    public static int contarConsumosAltos(int[][] matriz) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 8) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static double promedioConsumoModerado(int[][] matriz) {
        int suma = 0, cantidad = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] >= 4 && matriz[i][j] <= 7) {
                    suma += matriz[i][j];
                    cantidad++;
                }
            }
        }
        return cantidad > 0 ? (double) suma / cantidad : 0;
    }

    
    public static void imprimirConsumoBajo(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 3) {
                    System.out.println("Consumo bajo en posición [" + i + "][" + j + "]: " + matriz[i][j] + " galones");
                }
            }
        }
    }

    public static int[] posicionConsumoMaximo(int[][] matriz) {
        int maximo = Integer.MIN_VALUE;
        int[] posicion = {0, 0};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }
    
    public static double medianaConsumo(int[][] matriz) { //esta en el redmi//
        List<Integer> valores = new ArrayList<>();
        for (int[] fila : matriz) {
            for (int consumo : fila) {
                valores.add(consumo);
            }
        }
        Collections.sort(valores);
        int n = valores.size();
        return (n % 2 == 0) ? (valores.get(n / 2 - 1) + valores.get(n / 2)) / 2.0 : valores.get(n / 2);
    }
}