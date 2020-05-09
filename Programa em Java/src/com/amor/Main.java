package com.amor;
import java.util.Scanner;

public class Main
{
    public static Scanner read = new Scanner(System.in);
    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("┌─────────────────────────────────────────┐");
            System.out.println("│ ########### T H A Í S H O P ########### │");
            System.out.println("│                                         │");
            System.out.println("│  • Menu Inicial                         │");
            System.out.println("│                                         │");
            System.out.println("│    1- Login como Proprietário           │");
            System.out.println("│    2- Login como Cliente                │");
            System.out.println("│    3- Login como Caixa                  │");
            System.out.println("└─────────────────────────────────────────┘");

            int option = read.nextInt();

            if (option != 1 & option != 2 & option != 3) { break; }

            switch (option)
            {
                case 1:
                    while (true )
                    {
                        System.out.println("┌─────────────────────────────────────────┐");
                        System.out.println("│ ########### T H A Í S H O P ########### │");
                        System.out.println("│                                         │");
                        System.out.println("│  • Login para Proprietário              │");
                        System.out.println("│                                         │");
                        System.out.println("│    Informe a senha: ********            │");
                        System.out.println("└─────────────────────────────────────────┘");

                        int password = read.nextInt();

                        if (password != 84178160)
                        {
                            System.out.println("┌─────────────────────────────────────────┐");
                            System.out.println("│ ########### T H A Í S H O P ########### │");
                            System.out.println("│                                         │");
                            System.out.println("│  • Login para Proprietário              │");
                            System.out.println("│                                         │");
                            System.out.println("│    Senha inválida!                      │");
                            System.out.println("│                                         │");
                            System.out.println("│    1- Informar a senha novamente        │");
                            System.out.println("│    2- Voltar para o Menu Inicial        │");
                            System.out.println("└─────────────────────────────────────────┘");

                            int option2 = read.nextInt();

                            if (option2 == 1) { break; }
                            if (option2 == 2) { main(args); }

                            Mercado proprietario = new Mercado();
                        }
                    }

                case 2:
                    break;
                case 3:
                    break;
            }
        }
    }
}