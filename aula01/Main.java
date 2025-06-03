package aula01;
import java.util.Scanner;

import aula01.edificacoes.*;;

public class Main {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        Predio predio01 = new Predio(300000.00, 200000.00, 15, 3, 500, 1000);
        Casa casa01 = new Casa(10000, 70000, 1, 8, 3, true);

        System.out.println("Quantidade de apartamentos:" + predio01.getQtdApartamentos());
        System.out.println("Está mobilhada? " + (casa01.isEstaMobilhada() == true ? "Sim" : "Não"));
    }
}

