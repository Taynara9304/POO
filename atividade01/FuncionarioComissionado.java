package atividade01;

public class FuncionarioComissionado extends Funcionario {
    private double vendasMensais;
    private double percentualComissao;

    public FuncionarioComissionado() {
        super();
        this.vendasMensais = 0.0;
        this.percentualComissao = 0.0;
    }

    public FuncionarioComissionado(double vendasMensais, double percentualComissao, String nome, double salarioBase) {
        super(nome, salarioBase);
        this.vendasMensais = vendasMensais;
        this.percentualComissao = percentualComissao;
    }

    public double getVendasMensais() {
        return vendasMensais;
    }

    public void setVendasMensais(double vendasMensais) {
        this.vendasMensais = vendasMensais;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalario() {
        return vendasMensais * percentualComissao;
    }


}
