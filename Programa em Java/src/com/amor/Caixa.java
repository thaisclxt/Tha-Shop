/*package com.amor;
import java.util.Scanner;

public class Caixa
{
    public static Scanner read = new Scanner(System.in);

    public Caixa()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Login como Caixa                         │");
        System.out.println("│                                             │");
        System.out.println("│    Informe a senha: ********                │");
        System.out.println("└─────────────────────────────────────────────┘");

        int password = read.nextInt();

        if (password == 68130947)
        {
            caixa();
        }
        else
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Login como Caixa                         │");
            System.out.println("│                                             │");
            System.out.println("│    Senha inválida!                          │");
            System.out.println("│                                             │");
            System.out.println("│    1- Informar a senha novamente            │");
            System.out.println("│    0- Voltar para o Menu Inicial            │");
            System.out.println("└─────────────────────────────────────────────┘");

            int option2 = read.nextInt();

            if (option2 == 0) { Main.main(null); }
            else { caixa(); }
        }
    }

    public static void caixa()
    {
        while (true)
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Tela para o caixa                        │");
            System.out.println("│                                             │");
            System.out.println("│    1- Exibição                              │");
            System.out.println("│    2- Adição                                │");
            System.out.println("│    3- Remoção                               │");
            System.out.println("│    4- Concluir compra                       │");
            System.out.println("│    5- Cancelar compra                       │");
            System.out.println("│    0- Voltar para o Menu Inicial            │");
            System.out.println("└─────────────────────────────────────────────┘");

            int option = read.nextInt();

            switch (option)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
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
}*/