import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { //aca llamas a las funciones y escribis el ejercicio normal
        Scanner leer = new Scanner(System.in);

        //se usa para todas las mismas matrices 1,2,3
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //definir matrices
        int[][] matriz2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        //empieza 1
        int[][] resultado = sumaMatrices(matriz1, matriz2); //llamar a la funcion de sumar
        //mostrar resultado
        System.out.println("el resultado de sumar dos matrices");
        imprimirMatriz(resultado);

        //2
        int[][] resultado_dos = multiplicarMatrices(matriz1, matriz2);
        System.out.println("el resultado de multiplicar dos matrices");
        imprimirMatriz(resultado_dos);

        //3
        int[][] resultadoTranspuesta = matriztranspuesta(matriz1);
        System.out.println("matriz transpuesta");
        imprimirMatriz(resultadoTranspuesta);
        imprimirMatriz(matriz1);

        //4
        int[][] matrizOriginal = {
                {1, 2, 3},
                {2, 1, 2},
                {3, 2, 1}
        };
        int[][] matTranspuesta = matriztranspuesta(matrizOriginal);
        boolean iguales = igualdadMatricesTranspuestas(matrizOriginal, matTranspuesta);
        if (iguales) {
            System.out.println("las matricces ingresadas son iguales");
        } else {
            System.out.println("las matrices no son iguales");
        }
        //imprimir la matriz
        System.out.println("la matriz original es: ");
        imprimirMatriz(matrizOriginal);

        //5
        int[] vector = {2, 4, 6, 8, 10};
        int numero = 3;

        int[] resultado_tres = productoEscalar(vector, numero);

        System.out.println("vector original: " + arrayToString(vector));
        System.out.println("producto escalar por " + numero + ":" + arrayToString(resultado_tres));

        //6
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int suma = sumaMatriz(matriz);
        System.out.println("la suma de todos los elementos de la matriz es: " + suma);

        //7
        int[][] matriz_dos = {
                {9, 8, 17},
                {6, 15, 4},
                {3, 2, 1}
        };
        ResultadoMaximo resultado_cuatro = encontrarElementoMaximo(matriz_dos);

        System.out.println("el numero maximo de la matriz es: " + resultado_cuatro.maximo);
        System.out.println("se encuentra en la fila:" + resultado_cuatro.filaMaximo);
        System.out.println("y en la columna:" + resultado_cuatro.columnaMaximo);

        //8
        int[][] matriz_cinco = {
                {2, 2, 2},
                {4, 4, 4},
                {5, 5, 5}
        };
        int filaSumar = 1;
        int resultado_cinco = sumaFila(matriz_cinco, filaSumar);
        if (resultado_cinco != -1) {
            System.out.println("la suma de la fila " + filaSumar + " es: " + resultado_cinco);
        } else {
            System.out.println("fila fuera de rango");
        }

        //9
        int[][] matrizDiagonal = {
                {2, 0, 0},
                {0, 5, 0},
                {0, 0, 9},
        };
        int[][] matrizNoDiagonal = {
                {2, 0, 1},
                {0, 5, 0},
                {0, 0, 9}
        };
        System.out.println("la matriz es diagonal " + esMatrizDiagonal(matrizDiagonal));
        System.out.println("la matriz es diagonal " + esMatrizDiagonal(matrizNoDiagonal));

        //10
        int n = 3;
        int[][] matrizIdentidad = generarMatrizIdentidad(n);

        System.out.println("matriz identidad " + n + "x" + n + ":");
        imprimirMatri(matrizIdentidad);

        //11
        int[][] matrizParImpar = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        contarParesImpares(matrizParImpar);

        //12
        int[][] matriz90 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.print("matriz original:");
        imprimirMatri(matriz90);

        System.out.print("matriz rotada 90 grados en sentido horario:");
        rotarMatriz90Grados((matriz90));

        //13
        int[][] matrizContar = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {2, 2, 2}
        };

        int valorBuscado = 2; // Cambia esto al valor que deseas contar

        int cantidad = contarValor(matriz, valorBuscado);

        System.out.println("El valor " + valorBuscado + " aparece " + cantidad + " veces en la matriz.");
        //14
        int[][] matrizOrigina = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriz Original:");
        imprimirMatriz(matrizOrigina);

        int[][] MatrizInvertida_dos = invertirFilas(matrizOriginal);

        System.out.println("Matriz con Filas Invertidas:");
        imprimirMatriz(MatrizInvertida_dos);

        //15
        int[][] matrizCuadrada = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sumaDiagonales = SumarDiagonal(matrizCuadrada);

        System.out.println("La suma de todas las diagonales es: " + sumaDiagonales);
        //16

    }

    private static int SumarDiagonal(int[][] matrizCuadrada) {
        return 0;
    }
    //fuera del main
    //aca hacer funciones o metodos de ordenamiento fuera del public static pero dentro del main principal
    //para hacerlo pones public static int(lo que devuelve) el nombre (y lo que recibe)
    //public static int[][] productoMatrices (int[][] matriz, int[][]matriz2){

    //imprimir matrices
    public static void imprimirMatriz_dos(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }

    //1
    public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    //2
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
        return resultado;
    }

    //3
    public static int[][] matriztranspuesta(int[][] matriz1) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        //cambio filas por columnas y columnas por filas
        int[][] resultado = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[j][i] = matriz1[i][j];
            }
        }
        return resultado;
    }

    //4
    public static boolean igualdadMatricesTranspuestas(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        //verificar si las matrices son del mismo tamaño
        if (filas != matriz2.length || columnas != matriz2[0].length) {
            System.out.println("las matrices deben tener el mismo tamaño");
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false; //si hay alguna diferencia retorna falso
                }
            }
        }
        return true; // si no hay diferencias
    }

    //5
    public static int[] productoEscalar(int[] vector, int numero) {
        int n = vector.length;
        int[] resultado_tres = new int[n];

        for (int i = 0; i < n; i++) {
            resultado_tres[i] = vector[i] * numero;
        }
        return resultado_tres;
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    //6
    public static int sumaMatriz(int[][] matriz) {
        int suma = 0;
        //calculara la suma de los elementos
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                suma += matriz[fila][columna];
            }
        }
        return suma;
    }

    //7
    public static class ResultadoMaximo {
        int maximo;
        int filaMaximo;
        int columnaMaximo;
    }

    public static ResultadoMaximo encontrarElementoMaximo(int[][] matriz) {
        ResultadoMaximo resultado_cuatro = new ResultadoMaximo();
        resultado_cuatro.maximo = matriz[0][0];
        resultado_cuatro.filaMaximo = 0;
        resultado_cuatro.columnaMaximo = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] > resultado_cuatro.maximo) {
                    resultado_cuatro.maximo = matriz[fila][columna];
                    resultado_cuatro.filaMaximo = fila;
                    resultado_cuatro.columnaMaximo = columna;
                }
            }
        }
        return resultado_cuatro;
    }

    //8
    public static int sumaFila(int[][] matriz_cinco, int fila) {
        //verificar si la fila dada es valida
        if (fila < 0 || fila >= matriz_cinco.length) {
            return -1;
        }
        int suma = 0;
        for (int elemento : matriz_cinco[fila]) {
            suma += elemento;
        }
        return suma;
    }

    //9
    public static boolean esMatrizDiagonal(int[][] matriz_seis) {
        int filas = matriz_seis.length;
        int columnas = matriz_seis[0].length;

        if (filas != columnas) {
            return false;// no es cuadrado por lo tanto no puede ser diagonal
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i != j && matriz_seis[i][j] != 0) {
                    return false; //hay un elemento distinto de o
                }
            }
        }
        return true; //todos los elementos fuera de diagonal son 0
    }

    //10
    public static int[][] generarMatrizIdentidad(int n) {
        int[][] matrizIdentidad = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrizIdentidad[i][j] = 1;
                } else {
                    matrizIdentidad[i][j] = 0;
                }
            }
        }
        return matrizIdentidad;
    }

    public static void imprimirMatri(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    //11
    public static void contarParesImpares(int[][] matrizParImpar) {
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < matrizParImpar.length; i++) {
            for (int j = 0; j < matrizParImpar[i].length; j++) {
                if (matrizParImpar[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        System.out.println("cantidad de elementos pares: " + pares);
        System.out.println("cantidad de elementos impares: " + impares);
    }

    //12
    public static void rotarMatriz90Grados(int[][] matriz90) {
        int filas = matriz90.length;
        int columnas = matriz90[0].length;

        //crear una nueva matriz para almacenar la matriz rotada
        int[][] matrizRotada = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizRotada[j][filas - 1 - i] = matriz90[i][j];
            }
        }
        //imprimr matriz rotada
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(matrizRotada[i][j] + " ");
            }
            System.out.println();
        }
    }
    //13

    public static int contarValor(int[][] matrizContar, int valor) {
        int contador = 0;
        for (int i = 0; i < matrizContar.length; i++) {
            for (int j = 0; j < matrizContar[i].length; j++) {
                if (matrizContar[i][j] == valor) {
                    contador++;
                }
            }
        }
        return contador;

    }

    //14
    public static int[][] invertirFilas(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizInvertida = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizInvertida[filas - 1 - i][j] = matriz[i][j];
            }
        }

        return matrizInvertida;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    //15
    public static int sumarDiagonales_dos(int[][] matriz) {
        int dimension = matriz.length;
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

        for (int i = 0; i < dimension; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
            sumaDiagonalSecundaria += matriz[i][dimension - 1 - i];
        }

        return sumaDiagonalPrincipal + sumaDiagonalSecundaria;
    }
}
