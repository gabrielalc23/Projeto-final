package sp.senai.br.projetofinal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Iniciar batalha");
        System.out.println("2. Visualizar status dos personagens");
        System.out.println("3. Sair");

        int choice = teclado.nextInt();

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Opção inválida!");
        }

        while (choice != 3) {
            System.out.println("Menu:");
            System.out.println("1. Iniciar batalha");
            System.out.println("2. Visualizar status dos personagens");
            System.out.println("3. Sair");

            choice = teclado.nextInt();

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
