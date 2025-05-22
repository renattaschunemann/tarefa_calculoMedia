public class PessoaFisica extends Pessoa {

    private  String cpf;
    private  double salario = 3500;
    private double salarioFinal = salario * 0.1 + salario;


    @Override
    public double salario() {
        return salario;
    }

    public double salarioFinal(){
        return salarioFinal;
    };

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
}
