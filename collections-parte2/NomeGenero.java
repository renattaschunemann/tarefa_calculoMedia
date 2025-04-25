import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NomeGenero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> femininos = new ArrayList<>();
        List<String> masculinos = new ArrayList<>();

        System.out.println("Digite alguns nomes e com o nome o genero, exemplo joão-m e separe cada nome/genero por vírgulas: ");
        String nomeGenero = scan.nextLine();
        String[] nomesGeneros2 = nomeGenero.split(",");
        for (String nome1 : nomesGeneros2) {
            //System.out.println(nome1);
            String[] nome2 = nome1.split("-");
            //System.out.println(nome2[0] + " " + nome2[1]);


            if ("m".equalsIgnoreCase( nome2[1] ) ) {
                masculinos.add(nome2[0]);
            } else if ("f".equalsIgnoreCase(nome2[1])) {
                femininos.add(nome2[0]);
            }
        }

        System.out.println("O grupo masculino é :" + masculinos);
        System.out.println("O grupo feminino é: " + femininos);

    }


}
