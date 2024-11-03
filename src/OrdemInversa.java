public class OrdemInversa {

    public static void main(String[] args) {
        //Armazenar dez números na memória do computador. Exibir os valores na ordem inversa à da digitação.

        int numeros[] = new int[10];

        numeros[0] = 3;
        numeros[1] = 8;
        numeros[2] = 7;
        numeros[3] = 2;
        numeros[4] = 6;
        numeros[5] = 4;
        numeros[6] = 1;
        numeros[7] = 9;
        numeros[8] = 3;
        numeros[9] = 10;

        for (int i = numeros.length -1; i>=0; i--) {
            System.out.println(numeros[i]);
        }

    }
}
