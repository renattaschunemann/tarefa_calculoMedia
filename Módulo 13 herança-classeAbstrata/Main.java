public class Main {
    public static void main(String[] args) {

   PessoaFisica pessoafisica = new PessoaFisica();
   pessoafisica.setNome("Renatta");
   PessoaJuridica pessoaJuridica = new PessoaJuridica();
   pessoaJuridica.setNome("Petshop Lola e Amora");

        System.out.println("O salário da " + pessoafisica.getNome() + " é R$ " +  pessoafisica.salario());
        System.out.println("O salário de " + pessoafisica.getNome() + " com os benefícios é R$ " + pessoafisica.getSalarioFinal());
        System.out.println("O faturamneto da "+ pessoaJuridica.getNome() + " é "+ pessoaJuridica.salario());
        System.out.println("O lucro líquido da empresa " + pessoaJuridica.getNome() + " é  R$ " + pessoaJuridica.getLucroLiquido());




    }
}
