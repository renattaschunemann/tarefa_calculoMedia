public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private  double faturamento = 10000;
    private double lucroLiquido = faturamento * 0.3 ;


    @Override
    public double salario() {
        return faturamento;
    }
    public double lucroLiquido(){
        return lucroLiquido;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    public double getLucroLiquido() {
        return lucroLiquido;
    }

    public void setLucroLiquido(double lucroLiquido) {
        this.lucroLiquido = lucroLiquido;
    }
}
