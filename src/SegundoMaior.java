import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class SegundoMaior {
    public static void main(String[] args) {

        //Criar um programa para entrar com dois valores inteiros, onde o segundo valor deverá ser maior que o primeiro valor.
        // Caso contrário solicitar novamente apenas o segundo valor.


        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Digite o primeiro numero: ");
        numero1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        numero2 = sc.nextInt();

        while (numero2 < numero1) {
            System.out.println("Segundo número não pode ser menor que o primeiro!");
            System.out.print("Digite novamente o segundo número:");
            numero2 = sc.nextInt();
        }

        System.out.println("O segundo número é maior: " + numero2);
        System.out.println("Primeiro número: " + numero1);



            }

        }





