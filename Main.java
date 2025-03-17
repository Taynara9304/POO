import java.util.Scanner;

import aula01.Gerente;

public class Main {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        Gerente gerente01 = new Gerente("Fernada", "000.111.222-44", 50000.00, 1234, 2000);
        gerente01.autenticar(1234);
    }
}

