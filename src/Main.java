public class Main {
    public static void main(String[] args) {
        resultadoProva();
    }

    public static double calculomedia() {

        double nota1 = 7;
        double nota2 = 5.5;
        double nota3 = 4.5;
        double nota4 = 4.7;
        double media;

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        return media;


    }

    public static double resultadoProva() {
        double media = calculomedia();

        if (media >= 6) {
            System.out.println("Aprovado");

        } else if (media >= 4 && media < 6) {
            System.out.println("Recuperação");

        } else {
            System.out.println("Reprovado");
        }

        System.out.printf("%.2f", media);
        return media;
    }


}