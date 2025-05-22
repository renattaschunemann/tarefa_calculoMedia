public abstract class Pessoa {


       private String nome;
       private String sobrenome;
       private String funcaoCargo;


public abstract double salario();

       public String getNome() {
              return nome;
       }

       public void setNome(String nome) {
              this.nome = nome;
       }

       public String getSobrenome() {
              return sobrenome;
       }

       public void setSobrenome(String sobrenome) {
              this.sobrenome = sobrenome;
       }

       public String getFuncaoCargo() {
              return funcaoCargo;
       }

       public void setFuncaoCargo(String funcaoCargo) {
              this.funcaoCargo = funcaoCargo;
       }
}





