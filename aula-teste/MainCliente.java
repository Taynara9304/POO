
import java.util.Scanner;

public class MainCliente {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int opcaoEscolhida = 99999;
        System.out.println("Bem-vindo!");

        do {
            imprimirMenu();

            opcaoEscolhida = LER.nextInt();
            
        } while (opcaoEscolhida > 0 && opcaoEscolhida >= 4);
    }

    public static void imprimirMenu() {
        System.out.println("------MENU-----");
        System.out.println("1 - Ver produtos da loja");
        System.out.println("2 - Comprar produto");
        System.out.println("3 - Ver meu perfil");
        System.out.println("4 - Ver minhas compras");
        System.out.println("5 - Inserir meus dados");
    }
}
