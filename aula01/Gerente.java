package aula01;

public class Gerente extends Funcionario {
    int senha;
    int numeroFuncionariosGerenciados;

    public Gerente() {
        super();
        this.senha = 0;
        this.numeroFuncionariosGerenciados = 0;
    }

    public Gerente(String nome, String cpf, double salario, int senha, int numeroFuncionariosGerenciados) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    public boolean autenticar(int senha) {
        if (this.senha == senha) {
            System.out.println("Senha correta.");
            return true;
        } else {
            System.out.println("Senha incorreta.");
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroFuncionariosGerenciados() {
        return numeroFuncionariosGerenciados;
    }

    public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }
}
