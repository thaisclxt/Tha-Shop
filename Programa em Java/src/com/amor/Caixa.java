package com.amor;
import java.util.ArrayList;
import java.util.Scanner;

public class Caixa
{
    public static Scanner read = new Scanner(System.in);
    private static ArrayList<Item> caixa = new ArrayList<>();

    private Caixa() {}

    public static void login()
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
            System.out.println("│    0- Voltar para o login como Cliente      │");
            System.out.println("└─────────────────────────────────────────────┘");

            int option2 = read.nextInt();

            if (option2 == 0) { Main.main(null); }
            else { Cliente.login(); }
        }
    }

    public static void caixa()
    {
        while (true)
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Login como Caixa                         │");
            System.out.println("│                                             │");
            if (! caixa.isEmpty())
            System.out.println("│    1- Exibir itens do recipiente            │");
            System.out.println("│    2- Adicionar itens                       │");
            if (! caixa.isEmpty())
            {
                System.out.println("│    3- Remover item                          │");
                System.out.println("│    4- Concluir compra                       │");
                System.out.println("│    5- Cancelar compra                       │");
            }
            System.out.println("│    0- Voltar para o login como Cliente      │");
            System.out.println("└─────────────────────────────────────────────┘");

            int option = read.nextInt();

            switch (option)
            {
                case 1:
                    Cliente.container.show();
                    break;
                case 2:
                    caixa = Cliente.container.getRecipiente();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    Cliente.login();
                    break;
                default:
                    break;
            }
            if (option == 0) { break; }
        }
    }

    public static void remove()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Remover item                             │");
        System.out.println("│                                             │");
        System.out.println("│    Informe o código do produto que deseja   │");
        System.out.println("│    remover.                                 │");
        System.out.println("└─────────────────────────────────────────────┘");

        int code = Main.read.nextInt();

        if (caixa.removeIf(x -> x.getCode() == code))
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Remover item                             │");
            System.out.println("│                                             │");
            System.out.println("│    Item removido com sucesso.               │");
            System.out.println("└─────────────────────────────────────────────┘");
            return;
        }

        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Remover item                             │");
        System.out.println("│                                             │");
        System.out.println("│    Item não encontrado.                     │");
        System.out.println("└─────────────────────────────────────────────┘");
    }
}