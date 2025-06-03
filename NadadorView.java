import java.time.LocalDate;

public class NadadorView {
    public void imprimirDados(String nome, LocalDate dataNascimento, String classe, int qtdVitorias) {
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Classe: " + classe);
        System.out.println("Quantidade de vitórias: " + qtdVitorias);
    }
}
