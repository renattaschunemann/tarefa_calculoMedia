import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite nota 1: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite nota 2:");
        double nota2 = scan.nextDouble();
        System.out.println("Digite nota 3: ");
        double nota3 = scan.nextDouble();
        System.out.println("Digite nota 4:");
        double nota4 = scan.nextDouble();

       double media = (nota1 + nota2 + nota3 + nota4)/4;


        if(media >=7){
            System.out.printf("A média foi: " + "%.2f. Aluno aprovado",media );
         } else if (media >=5 && media<7) {
            System.out.printf("A média foi: " + "%.2f." + " Aluno em recuperação",media);

        } else {
            System.out.printf("A média foi: " + "%.2f. Aluno Reprovado",media );
        }

    }

}

