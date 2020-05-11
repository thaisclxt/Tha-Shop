package com.amor;
import java.util.Scanner;

public class Cliente
{
    public static Scanner read = new Scanner(System.in);

    public Cliente()
    {
        while (true)
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Tela para o cliente                      │");
            System.out.println("│                                             │");
            System.out.println("│    1- Colocar itens no recipiente           │");
            System.out.println("│    2- Remover itens                         │");
            System.out.println("│    3- Ver todos os itens atuais             │");
            System.out.println("│    4- Trocar recipiente                     │");
            System.out.println("│    5- Prever custo total                    │");
            System.out.println("│    6- Cancelar compra                       │");
            System.out.println("│    7- Confirmar compra                      │");
            System.out.println("│    8- Opção secreta: Roubar                 │");
            System.out.println("│    0- Voltar para o Menu Inicial            │");
            System.out.println("└─────────────────────────────────────────────┘");

            int option = read.nextInt();

            switch (option)
            {
                case 1:
                    System.out.println("┌─────────────────────────────────────────────┐");
                    System.out.println("│ ############# T H A Í S H O P ############# │");
                    System.out.println("│                                             │");
                    System.out.println("│  • Colocar itens no recipiente              │");
                    System.out.println("│                                             │");
                    System.out.println("│    1- Carrinho grande (60 itens)            │");
                    System.out.println("│    2- Carrinho pequeno (35 itens)           │");
                    System.out.println("│    3- Cesta (20 itens)                      │");
                    System.out.println("└─────────────────────────────────────────────┘");

                    int recipiente = read.nextInt();

                    if (recipiente == 1)
                    {
                        Recipiente carrinhoGrande = new Recipiente();
                    }
                    if (recipiente == 2) { Recipiente carrinhoPequeno = new Recipiente(); }
                    if (recipiente == 3) { Recipiente cesta = new Recipiente(); }

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 0:
                    Main.main(null);
                    break;
                default:
                    break;
            }
            if (option == 0) { break; }
        }
    }
}