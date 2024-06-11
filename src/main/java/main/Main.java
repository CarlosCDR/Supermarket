package main;

import implementation.Supermarket;
import implementation.SupermarketArray;

import java.util.Scanner;

public class Main {

    private final static int SIZE = 3;
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Supermarket supermarket = new SupermarketArray(SIZE);
       int opcao;

       do {
           System.out.println("\nLista de Compras");
           System.out.println("\n1 - Inserir");
           System.out.println("\n2 - Listar");
           System.out.println("\n3 - Remover");
           System.out.println("\n4 - Sair");
           System.out.println("\nEscolha uma opção: ");
           opcao = scanner.nextInt();

           switch (opcao){
               case 1:
                   System.out.println("Digite o item a ser inserido: ");
                   String item = scanner.next();
                   supermarket.add(item);
                   break;

               case 2:
                   supermarket.print();
                   break;

               case 3:
                   System.out.println("Digite o item que deseja remover: ");
                   int index = scanner.nextInt();
                   supermarket.delete(index);
                   break;

               case 4:
                   System.out.println("Saindo do programa...");
                   break;

               default:
                   System.out.println("Opçao inválida. Por favor, escolha novamente.");

           }

       } while (opcao != 4);

       scanner.close();
}

}
