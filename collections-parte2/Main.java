import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite alguns nomes separados por vírgulas: ");
        String nomes = scan.nextLine();
        String[] arraynomes = nomes.split(",");
        for (String nome : arraynomes) {
            System.out.println(nome);

        }
        List<String> listaNome = Arrays.asList(arraynomes);
        Collections.sort(listaNome);
        System.out.println(listaNome);


    }
}
