package com.amor;
import java.util.ArrayList;

public class Caixa
{
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

        int password = Main.read.nextInt();

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

            int option = Main.read.nextInt();

            if (option == 0) { return; }
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
            System.out.println("│    1- Exibição da compra do cliente         │");
            System.out.println("│    2- Adição dos itens do cliente           │");
            if (! caixa.isEmpty())
            {
                System.out.println("│    3- Remoção dos itens do cliente          │");
                System.out.println("│    4- Exibição do total a ser pago          │");
                System.out.println("│    5- Concluir compra                       │");
                System.out.println("│    6- Cancelar compra                       │");
            }
            System.out.println("│    0- Voltar para o login como Cliente      │");
            System.out.println("└─────────────────────────────────────────────┘");

            int option = Main.read.nextInt();

            switch (option)
            {
                case 1:
                    Cliente.container.show();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    pay();
                    break;
                case 5:
                    break;
                case 6:
                    cancel();
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

    public static void add()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Adição dos itens do cliente              │");
        System.out.println("│                                             │");
        System.out.println("│    1- Adicionar todos os itens              │");
        System.out.println("│    2- Adicionar itens individualmente       │");
        System.out.println("│    0- Voltar para o login como Caixa        │");
        System.out.println("└─────────────────────────────────────────────┘");

        int add = Main.read.nextInt();

        switch (add)
        {
            case 1:
                caixa = Cliente.container.getRecipiente();
                System.out.println("┌─────────────────────────────────────────────┐");
                System.out.println("│ ############# T H A Í S H O P ############# │");
                System.out.println("│                                             │");
                System.out.println("│  • Adição de todos os itens do cliente      │");
                System.out.println("│                                             │");
                System.out.println("│    Itens adicionados com sucesso.           │");
                System.out.println("└─────────────────────────────────────────────┘");
                break;
            case 2:
                addSingly();
                break;
            case 0:
                return;
            default:
                add();
                break;
        }
    }

    public static void addSingly()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Adição de itens individualmente          │");
        System.out.println("│                                             │");
        System.out.println("│    Informe o código do produto que deseja   │");
        System.out.println("│    adicionar.                               │");
        System.out.println("└─────────────────────────────────────────────┘");

        int code = Main.read.nextInt();

        caixa.forEach(item ->
        {
            if (item.getCode() == code)
            {
                caixa.add(item);
                System.out.println("┌─────────────────────────────────────────────┐");
                System.out.println("│ ############# T H A Í S H O P ############# │");
                System.out.println("│                                             │");
                System.out.println("│  • Adição de itens individualmente          │");
                System.out.println("│                                             │");
                System.out.println("│    Item adicionado com sucesso.             │");
                System.out.println("└─────────────────────────────────────────────┘");
                return;
            }
        });

        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Adição de itens individualmente          │");
        System.out.println("│                                             │");
        System.out.println("│    Item não encontrado.                     │");
        System.out.println("└─────────────────────────────────────────────┘");
    }

    public static void remove()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Remoção dos itens do cliente             │");
        System.out.println("│                                             │");
        System.out.println("│    1- Remover todos os itens                │");
        System.out.println("│    2- Remover itens individualmente         │");
        System.out.println("│    0- Voltar para o login como Caixa        │");
        System.out.println("└─────────────────────────────────────────────┘");

        int remove = Main.read.nextInt();

        switch (remove)
        {
            case 1:
                caixa.clear();
                System.out.println("┌─────────────────────────────────────────────┐");
                System.out.println("│ ############# T H A Í S H O P ############# │");
                System.out.println("│                                             │");
                System.out.println("│  • Remoção de todos os itens do cliente     │");
                System.out.println("│                                             │");
                System.out.println("│    Itens removidos com sucesso.             │");
                System.out.println("└─────────────────────────────────────────────┘");
                break;
            case 2:
                removeSingly();
                break;
            case 0:
                return;
            default:
                remove();
                break;
        }
    }

    public static void removeSingly()
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

    public static void pay()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Prever custo total                       │");
        System.out.println("│                                             │");
        System.out.printf("│    R$ %.2f                                 │\n", total());
        System.out.println("└─────────────────────────────────────────────┘");
    }

    public static double total()
    {
        double total = 0;

        for (Item item : caixa)
        {
            total += item.getPrice();
        }

        return total;
    }

    public static void cancel()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Cancelar compra                          │");
        System.out.println("│                                             │");
        System.out.println("│    Tem certeza que deseja cancelar ?        │");
        System.out.println("│    1- Sim                                   │");
        System.out.println("│    0- Não                                   │");
        System.out.println("└─────────────────────────────────────────────┘");

        int areYouSure = Main.read.nextInt();

        if (areYouSure != 1)
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Cancelar compra                          │");
            System.out.println("│                                             │");
            System.out.println("│    Sua compra não foi cancelada.            │");
            System.out.println("└─────────────────────────────────────────────┘");
            return;
        }

        caixa.clear();

        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Cancelar compra                          │");
        System.out.println("│                                             │");
        System.out.println("│    Compra cancelada com sucesso.            │");
        System.out.println("└─────────────────────────────────────────────┘");

        Main.main(null, 1);
    }
}