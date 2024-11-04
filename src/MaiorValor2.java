import java.util.Scanner;

public class MaiorValor2 {
    public static void main(String[] args) {

        //Entrar via teclado, com três valores distintos. Exibir o maior deles

        Scanner scan = new Scanner(System.in);
        double valor1;
        double valor2;
        double valor3;
        double resultado;

        System.out.print("Digite o primero valor: ");
        valor1 = scan.nextDouble();

        System.out.print("Digite o segundo valor: ");
        valor2 = scan.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        valor3 = scan.nextDouble();

        resultado = Math.max(valor1, Math.max(valor2, valor3));

        System.out.println("O maior valor é: " + resultado);

        scan.close();
    }
}
