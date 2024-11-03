import java.util.Scanner;

public class ExercicioTerrenoGrande {

    public static void main(String[] args) {
        //Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. Se a
        //área for maior que 100, exibir a mensagem “Terreno grande”.

        double base;
        double altura;
        double area;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        base = scan.nextDouble();

        System.out.println("Digite o valor da altura: ");
        altura = scan.nextDouble();

        area = base * altura;

        if (area > 100) {
            System.out.println("Terreno grande");

        }

        System.out.println("Area: " + area);
        scan.close();
    }
}
