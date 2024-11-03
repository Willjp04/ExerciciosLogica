import java.util.Scanner;

public class ExercicioVolumeEsfera {
    public static void main(String[] args) {
        //Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.

        Scanner scam = new Scanner(System.in);

        double volume = 0;
        System.out.print("Digite o diâmetro para cálculo: ");
        double diametro = scam.nextDouble();

        diametro /=2;

        volume =  (4/3.0) * Math.PI * Math.pow(diametro, 3);

        System.out.println("Volume: " + volume);

    }
}
