package atividade01;

import java.util.List;

public class FolhaDePagamentos {
    public static void processarPagamento(List<Funcionario> arrayFuncionario) {
        for (Funcionario funcionario : arrayFuncionario) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalarioBase());
        }
    }
}
