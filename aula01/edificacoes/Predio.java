package aula01.edificacoes;

public class Predio {
    int numeroDeElevadores;
    int qtdApartamentos;
    int qtdVagasGaragem;

    public Predio(int numeroDeElevadores, int qtdApartamentos, int qtdVagasGaragem) {
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