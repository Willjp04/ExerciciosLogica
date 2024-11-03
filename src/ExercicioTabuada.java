import java.util.Scanner;

public class ExercicioTabuada {

    public static void main(String[] args) {
        //Entrar via teclado com um valor qualquer.
        // Travar a digitação, no sentido de aceitar somente valores positivos.
        // Após a digitação, exibir a tabuada do valor solicitado, no intervalo de um a dez.

        int valor = 1;
        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor para calcular a tabuada: ");
        numero = sc.nextInt();

        while (numero <=0){
            System.out.println("Valor invalido! Digite um valor positivo: ");
            numero = sc.nextInt();
        }

        while (valor <= 10){
            System.out.println("Resultado de: " + numero + "X" + valor + "= " + valor*numero);
            valor++;

        }
        sc.close();


    }
}
