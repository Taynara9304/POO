package aula01.edificacoes;

public class Edificacao {
    private double areaTotal;
    private double areaConstruida;
    private int numeroAndares;
    
    public Edificacao() {
        this.areaTotal = 0.0;
        this.areaConstruida = 0.0;
        this.numeroAndares = 0;
    }

    public Edificacao(double areaTotal, double areaConstruida, int numeroAndares) {
        this.areaTotal = areaTotal;
        this.areaConstruida = areaConstruida;
        this.numeroAndares = numeroAndares;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public int getNumeroAndares() {
        return numeroAndares;
    }

    public void setNumeroAndares(int numeroAndares) {
        this.numeroAndares = numeroAndares;
    }

    
}
