import java.util.Scanner;

public class ExercicioCotacaoDolar {

    public static void main(String[] args) {
        //Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).

        Scanner scan = new Scanner(System.in);

        float cotacaoDolar;
        float dolares;
        float total;

        System.out.print("Digite o valor da cotação do dólar: " );

        cotacaoDolar = scan.nextFloat();

        System.out.println();

        System.out.print("Digite a quantidade de dólares para converter em Reais: ");

        dolares = scan.nextFloat();

        total = cotacaoDolar * dolares;

        System.out.println();

        System.out.printf("O VALOR CONVERTIDO PARA REAIS É: R$ %.2f " , total);

    }
}
