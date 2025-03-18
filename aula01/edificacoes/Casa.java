package aula01.edificacoes;

public class Casa extends Edificacao {
    private int numeroComodos;
    private int numeroQuartos;
    private boolean estaMobilhada;
    
    public Casa() {
        super();
        this.numeroComodos = 0;
        this.numeroQuartos = 0;
        this.estaMobilhada = false;
    }

    public Casa(double areaTotal, double areaConstruida, int numeroAndares, int numeroComodos, int numeroQuartos, boolean estaMobilhada) {
        super(areaTotal, areaConstruida, numeroAndares);
        this.numeroComodos = numeroComodos;
        this.numeroQuartos = numeroQuartos;
        this.estaMobilhada = estaMobilhada;
    }

    public int getNumeroComodos() {
        return numeroComodos;
    }
    public void setNumeroComodos(int numeroComodos) {
        this.numeroComodos = numeroComodos;
    }
    public int getNumeroQuartos() {
        return numeroQuartos;
    }
    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }
    public boolean isEstaMobilhada() {
        return estaMobilhada;
    }
    public void setEstaMobilhada(boolean estaMobilhada) {
        this.estaMobilhada = estaMobilhada;
    }
}
