package com.amor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static Scanner read = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Menu Inicial                             │");
        System.out.println("│                                             │");
        System.out.println("│    1- Login como Proprietário               │");
        System.out.println("│    2- Login como Cliente                    │");
        System.out.println("│    3- Login como Caixa                      │");
        System.out.println("│    0- Sair do programa                      │");
        System.out.println("└─────────────────────────────────────────────┘");

        int option = read.nextInt();

        switch (option)
        {
            case 1:
                login();
                break;
            case 2:
                break;
            case 3:
                break;
            case 0:
                break;
            default:
                main(args);
        }
    }

    public static void login()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Login para Proprietário                  │");
        System.out.println("│                                             │");
        System.out.println("│    Informe a senha: ********                │");
        System.out.println("└─────────────────────────────────────────────┘");

        int password = read.nextInt();

        if (password != 84178160)
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Login para Proprietário                  │");
            System.out.println("│                                             │");
            System.out.println("│    Senha inválida!                          │");
            System.out.println("│                                             │");
            System.out.println("│    1- Informar a senha novamente            │");
            System.out.println("│    0- Voltar para o Menu Inicial            │");
            System.out.println("└─────────────────────────────────────────────┘");

            int option2 = read.nextInt();

            if (option2 == 0) { main(null); }
            else { login(); }
        }

        mercado();

    }

    public static void mercado()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Tela para manutenção do mercado          │");
        System.out.println("│                                             │");
        System.out.println("│    1- Carregar uma lista padrão de itens    │");
        System.out.println("│    2- Adição de itens à venda               │");
        System.out.println("│    3- Remoção de itens à venda              │");
        System.out.println("│    4- Exibir itens que estão à venda        │");
        System.out.println("│    5- Ajuste de todos os dados do item      │");
        System.out.println("│    6- Concluir ajustes                      │");
        System.out.println("│    0- Voltar para o Menu Inicial            │");
        System.out.println("└─────────────────────────────────────────────┘");

        int option = Main.read.nextInt();

        switch (option)
        {
            case 1:
                ArrayList<Item> listaPadrao = new ArrayList<Item>();
                listaPadrao.add(new Item("Vagem", 2566, 1.63));
                listaPadrao.add(new Item("Shampoo", 3389, 11.90));
                listaPadrao.add(new Item("Gergelim", 1001, 4.14));
                listaPadrao.add(new Item("Óleo de coco", 1285, 18.85));
                listaPadrao.add(new Item("Cola em bastão", 5411, 3.00));
                listaPadrao.add(new Item("Semente de girassol", 1002, 3.75));

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
            case 0:
                Main.main(null);
                break;
            default:
                mercado();
                break;
        }
    }
}