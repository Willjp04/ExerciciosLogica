import java.util.Scanner;

public class ExercicioAreaQuadrado {

    public static void main(String[] args) {
        //Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
        //A fórmula para calcular a área de um quadrado é A = L2, onde L é a medida do lado do quadrado.

        Scanner scan = new Scanner(System.in);

        double aresta;
        double areaQuadrado;

        System.out.print("Digite o valor do aresta: ");
        aresta = scan.nextDouble();

        areaQuadrado = Math.pow(aresta, 2);

        System.out.println("A área do quadrado é: " + areaQuadrado + " cm²");



    }
}
