public class Punto_35 {
        public static void main(String[] args) {
            int[][] tablaMultiplicar = new int[10][10];//SE CREA LA MATRIZ

            // SE LLENA LA MATRIZ
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    tablaMultiplicar[i][j] = (i + 1) * (j + 1);
                }
            }

            //MOSTRAR EN PANTALLA
            for (int i = 0; i < 10; i++) {
                System.out.println("Tabla de multiplicar del " + (i + 1) + ":");
                for (int j = 0; j < 10; j++) {
                    System.out.println((i + 1) + " x " + (j + 1) + " = " + tablaMultiplicar[i][j]);
                }
                System.out.println();
            }
        }
    }


