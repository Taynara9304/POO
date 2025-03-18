package aula01.edificacoes;

public class Predio extends Edificacao {
    private int numeroDeElevadores;
    private int qtdApartamentos;
    private int qtdVagasGaragem;

    public Predio() {
        super();
        this.numeroDeElevadores = 0;
        this.qtdApartamentos = 0;
        this.qtdVagasGaragem = 0;
    }

    public Predio(double areaTotal, double areaConstruida, int numeroAndares, int numeroDeElevadores, int qtdApartamentos, int qtdVagasGaragem) {
        super(areaTotal, areaConstruida, numeroAndares);
        this.numeroDeElevadores = numeroDeElevadores;
        this.qtdApartamentos = qtdApartamentos;
        this.qtdVagasGaragem = qtdVagasGaragem;
    }

    public int getNumeroDeElevadores() {
        return numeroDeElevadores;
    }

    public void setNumeroDeElevadores(int numeroDeElevadores) {
        this.numeroDeElevadores = numeroDeElevadores;
    }

    public int getQtdApartamentos() {
        return qtdApartamentos;
    }

    public void setQtdApartamentos(int qtdApartamentos) {
        this.qtdApartamentos = qtdApartamentos;
    }

    public int getQtdVagasGaragem() {
        return qtdVagasGaragem;
    }

    public void setQtdVagasGaragem(int qtdVagasGaragem) {
        this.qtdVagasGaragem = qtdVagasGaragem;
    }
    
}