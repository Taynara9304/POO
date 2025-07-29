import java.util.Scanner;

public class MainLogista {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int opcaoEscolhida = 99999;
        System.out.println("Bem-vindo!");

        do {
            imprimirMenu();

            opcaoEscolhida = LER.nextInt();
            
        } while (opcaoEscolhida > 0 && opcaoEscolhida >= 2);
    }

    public static void imprimirMenu() {
        System.out.println("------MENU-----");
        System.out.println("1 - Inserir produtos da loja");
        System.out.println("2 - Inserir dados da loja");
    }
}
