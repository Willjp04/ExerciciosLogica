import java.util.Scanner;

public class ApenasPositivos {
    public static void main(String[] args) {

        //Criar uma rotina ou função de entrada de dados que aceite somente um valor positivo (>0).
        // Ou seja, enquanto o usuário não entrar com um valor positivo, deve ser requisitado a digitar novamente.

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double numero = scan.nextDouble();
        while (numero <= 0){
            System.out.print("Número não é positivo, digite novamente:");
            numero = scan.nextInt();

        }
        scan.close();
        System.out.println("Número positivo digitado!");

    }
}
