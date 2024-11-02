import java.util.Scanner;
public class ExercicioLogicaKm {
    public static void main(String[] args) {

        //Sabendo que uma milha marítima equivale a um mil, oitocentos e
        //cinqüenta e dois metros e que um quilômetro possui mil metros, fazer um
        //programa para converter milhas marítimas em quilômetros.

        double km = 1852;
        System.out.println("CONVERSÃO DE MILHA MARÍTIMA PARA KM");

        System.out.println();

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor em milha marítima: ");
        double milha = scan.nextFloat();
        milha *= km;
        System.out.println("O VALOR CONVERTIDO PARA KM É: "+ milha + " Km");


        System.out.println();
    }
}
