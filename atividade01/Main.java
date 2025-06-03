package atividade01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> arrayFuncionarios = new ArrayList<>();

        Funcionario funcionario1 = new Funcionario("Lais", 50000.0);
        Funcionario funcionario2 = new FuncionarioBonificado(200000.0, 145000.0, 0.12, "Lais", 50000.0);

        arrayFuncionarios.add(funcionario1);
        arrayFuncionarios.add(funcionario2);

        FolhaDePagamentos.processarPagamento(arrayFuncionarios);
    }
}
