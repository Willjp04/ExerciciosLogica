import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ExercicioPesoIdeal {

    public static void main(String[] args) {

        //Entrar com o peso e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está
        //ou não com seu peso ideal.

        double peso;
        double altura;
        double resultado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do peso: ");
        peso = sc.nextFloat();

        System.out.println("Digite o altura da altura: ");
        altura = sc.nextFloat();

        resultado = peso/Math.pow(altura,2);

        System.out.println(resultado);

        if(resultado<20){
            System.out.println("Abaixo do Peso");

        }
        else if(resultado ==20 || resultado<25){
            System.out.println("Peso Ideal");
        }
        else{
            System.out.println("Acima do Peso");
        }


        sc.close();

    }
}
