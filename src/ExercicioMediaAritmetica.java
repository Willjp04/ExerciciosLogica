import java.util.Scanner;

public class ExercicioMediaAritmetica {

    public static void main(String[] args) {
        //Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados

        Scanner scan = new Scanner(System.in);

        float[] valores = new float[4];
        float soma = 0;

        System.out.print("Digite o primeiro valor: ");
        valores[0] = scan.nextFloat();

        System.out.print("Digite o segundo valor: ");
        valores[1] = scan.nextFloat();

        System.out.print("Digite o terceiro valor: ");
        valores[2] = scan.nextFloat();

        System.out.print("Digite o quarto valor: ");
        valores[3] = scan.nextFloat();

        for( int i = 0; i < 4; i++ ) {
            soma = soma + valores[i];
        }

        soma = soma / valores.length;

        scan.close();

        System.out.println("A média dos valores digitados é: " + soma);





    }
}
