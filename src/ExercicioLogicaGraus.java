import java.util.Scanner;

public class ExercicioLogicaGraus {

    public static void main(String[] args) {
        //Graus vs Fahrenheit

        //Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura
        //equivalente em Fahrenheit.

        Scanner scan = new Scanner(System.in);

        double graus;

        System.out.println("Insira o valor de Graus Celsius ");

        graus = scan.nextDouble();

        graus = graus * 1.8 + 32;

        System.out.printf("A temperatura em Fahrenheit é: " + graus);

        scan.close();
    }
}
