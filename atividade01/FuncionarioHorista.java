package atividade01;

public class FuncionarioHorista extends Funcionario {
    private int qtdHorasTrabalhadas;
    private double valorPorHora;

    public FuncionarioHorista() {
        this.qtdHorasTrabalhadas = 0;
        this.valorPorHora = 0.0;
    }

    public FuncionarioHorista(int qtdHorasTrabalhadas, double valorPorHora, String nome, double salarioBase) {
        super(nome, salarioBase);
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public int getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public void setQtdHorasTrabalhadas(int qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSalario() {
        return qtdHorasTrabalhadas * valorPorHora;
    }
}
