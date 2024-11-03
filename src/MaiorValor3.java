import java.util.Scanner;

public class MaiorValor3 {

    public static void main(String[] args) {
        //Entrar com dois valores quaisquer.
        // Exibir o maior deles, se existir, caso contrário, enviar mensagem avisando que os números são idênticos.

        Scanner scan = new Scanner(System.in);
        double valor1;
        double valor2;

        System.out.print("Digite o primero valor: ");
        valor1 = scan.nextInt();

        System.out.print("Digite o segundo valor: ");
        valor2 = scan.nextInt();

        if(valor1 == valor2){
            System.out.println("Valores iguais");
        }
        else{
            System.out.println("O maior valor é: " + Math.max(valor1, valor2));
        }


    }
}
