package com.amor;
import java.util.Scanner;

public class Main
{
    public static Scanner read = new Scanner(System.in);
    public static Scanner readString = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Menu Inicial                             │");
        System.out.println("│                                             │");
        System.out.println("│    1- Login como Proprietário               │");
        if (!Mercado.getListaItens().isEmpty())
        System.out.println("│    2- Login como Cliente                    │");
        System.out.println("│    0- Sair do programa                      │");
        System.out.println("└─────────────────────────────────────────────┘");

        int menu = read.nextInt();

        switch (menu)
        {
            case 1:
                Proprietario.login();
                break;
            case 2:
                Cliente.login();
                break;
            case 0:
                break;
            default:
                main(args);
        }
    }
}