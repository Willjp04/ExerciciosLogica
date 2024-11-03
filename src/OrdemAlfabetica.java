import java.util.ArrayList;
import java.util.Collections;

public class OrdemAlfabetica {
    public static void main(String[] args) {
        //Armazenar o nome de vinte pessoas em um vetor.
        // Após a digitação exibir os nomes em ordem alfabética.

        ArrayList lista = new ArrayList();

       lista.add("Bruno");
       lista.add("Pedro");
       lista.add("Felipe");
       lista.add("João");
       lista.add("Patricia");
       lista.add("Gustavo");
       lista.add("Larissa");
       lista.add("Vinicius");
       lista.add("Alexandre");
       lista.add("Camila");
       lista.add("Lucio");
       lista.add("Xandy");
       lista.add("Valter");
       lista.add("Wilson");
       lista.add("Willian");
       lista.add("Geovane");
       lista.add("Bianca");
       lista.add("Gabriela");
       lista.add("Ronaldo");
       lista.add("Henrique");

        Collections.sort(lista);

        System.out.println("Lista de nomes em ordem alfabética: " + lista);


    }




}
