import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExercicioCompraTroco {
    public static void main(String[] args) {

        //Entrar via teclado com o valor de cinco produtos.
        // Após as entradas, digitar um valor referente ao pagamento da somatória destes valores.
        // Calcular e exibir o troco que deverá ser devolvido.

        Scanner scan = new Scanner(System.in);

        float soma = 0;
        float pagamento;

        float[] produtos = new float[5];

        System.out.print("Digite o valor do primeiro produto: ");
        produtos[0] = scan.nextFloat();

        System.out.print("Digite o valor do segundo  produto: ");
        produtos[1] = scan.nextFloat();

        System.out.print("Digite o valor do terceiro  produto: ");
        produtos[2] = scan.nextFloat();

        System.out.print("Digite o valor do quarto produto: ");
        produtos[3] = scan.nextFloat();

        System.out.print("Digite o valor do quinto produto: ");
        produtos[4] = scan.nextFloat();

        for (int i = 0; i < produtos.length; i++) {
            soma = soma + produtos[i];
                    }


        System.out.print("Digite o valor para pagamento:");
        pagamento = scan.nextFloat();

        pagamento-=soma;

        scan.close();

        System.out.printf("O troco será de R$ %.2f " , pagamento);



    }
}
