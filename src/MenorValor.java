import java.util.Scanner;

public class MenorValor {
    public static void main(String[] args) {


        //Entrar via teclado, com dois valores distintos. Exibir o menor deles.
        Scanner scan = new Scanner(System.in);
        double valor1;
        double valor2;

        System.out.print("Digite o primero valor: ");
        valor1 = scan.nextDouble();

        System.out.print("Digite o segundo valor: ");
        valor2 = scan.nextDouble();

        System.out.println("O menor valor é: " + Math.min(valor1, valor2));
    }
}
