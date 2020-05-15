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
            else { login(); }
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
            System.out.println("│    1- Exibir a lista de compras do cliente  │");
            System.out.println("│    2- Adicionar os itens do cliente         │");
            if (! caixa.isEmpty())
            {
                System.out.println("│    3- Remover os itens do cliente           │");
                System.out.println("│    4- Exibir o total a ser pago             │");
                System.out.println("│    5- Concluir compra                       │");
                System.out.println("│    6- Cancelar compra                       │");
            }
            System.out.println("│    0- Voltar                                │");
            System.out.println("└─────────────────────────────────────────────┘");

            int option = Main.read.nextInt();

            switch (option)
            {
                case 1: Cliente.container.show(); break;
                case 2: add(); break;
                case 3: remove(); break;
                case 4: pay(); break;
                case 5: if (conclue() == 0) { return; } break;
                case 6: if (cancel() == 0) { return; } break;
                case 0: return;
                default: break;
            }
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
        System.out.println("│    0- Voltar                                │");
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

        for (Item item : Cliente.container.getRecipiente())
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
        }
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
        System.out.println("│    0- Voltar                                │");
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
        System.out.println("│  • Total a ser pago                         │");
        System.out.println("│                                             │");
        System.out.printf("│    R$ %.2f                                 │\n", total());
        System.out.println("└─────────────────────────────────────────────┘");
    }

    public static double total()
    {
        /*double total = 0;

        for (Item item : caixa)
        {
            total += item.getPrice();
        }

        return total;
        */

        return caixa.stream().mapToDouble(Item::getPrice).sum();
    }

    public static int conclue()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Concluir compra                          │");
        System.out.println("│                                             │");
        System.out.printf("│    Custo total: R$ %.2f                    │\n", total());
        System.out.println("│                                             │");
        System.out.println("│    1- Receber a quantia paga pelo cliente   │");
        System.out.println("│    0- Voltar                                │");
        System.out.println("└─────────────────────────────────────────────┘");

        int conclue = Main.read.nextInt();

        switch (conclue)
        {
            case 1: receive(); return 0;
            case 0: return 1;
            default: conclue(); break;
        }
        return 1;
    }

    public static void receive()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Concluir compra                          │");
        System.out.println("│                                             │");
        System.out.println("│    Entre com a quantia paga pelo cliente.   │");
        System.out.println("└─────────────────────────────────────────────┘");

        double valor = Double.parseDouble(Main.read.next());
        double troco = valor - total();

        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Compra concluída com sucesso             │");
        System.out.println("│                                             │");
        System.out.println("│    ThaíShop agradece. Volte sempre! :)      │");
        System.out.println("│                                             │");
        System.out.printf("│    Troco: R$ %.2f                          │\n", troco);
        System.out.println("│                                             │");
        notasEmoedas(troco);
        System.out.println("└─────────────────────────────────────────────┘");
    }

    public static void notasEmoedas(double troco)
    {
        int notas = (int) troco;
        int moedas = (int) ((troco - notas) * 100);

        String NOTAS;
        String MOEDAS;

        NOTAS = "│    Troco em NOTAS:                          │\n";
        NOTAS += String.format("|    %d nota(s) de R$ 100.00                   |\n", notas / 100);
        notas %= 100;
        NOTAS += String.format("|    %d nota(s) de R$ 50.00                    |\n", notas / 50);
        notas %= 50;
        NOTAS += String.format("|    %d nota(s) de R$ 20.00                    |\n", notas / 20);
        notas %= 20;
        NOTAS += String.format("|    %d nota(s) de R$ 10.00                    |\n", notas / 10);
        notas %= 10;
        NOTAS += String.format("|    %d nota(s) de R$ 5.00                     |\n", notas / 5);
        notas %= 5;
        NOTAS += String.format("|    %d nota(s) de R$ 2.00                     |\n", notas / 2);
        notas %= 2;

        MOEDAS = "│                                             │\n";
        MOEDAS += "│    Troco em MOEDAS:                         │\n";
        MOEDAS += String.format("|    %d moeda(s) de R$ 1.00                    |\n", notas);
        MOEDAS += String.format("|    %d moeda(s) de R$ 0.50                    |\n", moedas / 50);
        moedas %= 50;
        MOEDAS += String.format("|    %d moeda(s) de R$ 0.25                    |\n", moedas / 25);
        moedas %= 25;
        MOEDAS += String.format("|    %d moeda(s) de R$ 0.10                    |\n", moedas / 10);
        moedas %= 10;
        MOEDAS += String.format("|    %d moeda(s) de R$ 0.05                    |\n", moedas / 5);
        moedas %= 5;
        MOEDAS += String.format("|    %d moeda(s) de R$ 0.01                    |", moedas);

        System.out.println(NOTAS + MOEDAS);
    }

    public static int cancel()
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
            return 1;
        }

        caixa.clear();
        Cliente.container.getRecipiente().clear();

        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Cancelar compra                          │");
        System.out.println("│                                             │");
        System.out.println("│    Compra cancelada com sucesso.            │");
        System.out.println("└─────────────────────────────────────────────┘");
        return 0;
    }
}