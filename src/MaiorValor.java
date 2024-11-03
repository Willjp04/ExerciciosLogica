import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {


        //Entrar via teclado, com dois valores distintos. Exibir o maior deles

        Scanner scan = new Scanner(System.in);
        double valor1;
        double valor2;

        System.out.print("Digite o primero valor: ");
        valor1 = scan.nextInt();

        System.out.print("Digite o segundo valor: ");
        valor2 = scan.nextInt();

        System.out.println("O maior valor é: " + Math.max(valor1, valor2));



    }
}
