package atividade01;

public class FuncionarioBonificado extends FuncionarioComissionado {
    private double bonus;

    public FuncionarioBonificado() {
        this.bonus = 0.0;
    }

    public FuncionarioBonificado(double bonus, double vendasMensais, double percentualComissao, String nome, double salarioBase) {
        super(vendasMensais, percentualComissao, nome, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonus;
    }
}
