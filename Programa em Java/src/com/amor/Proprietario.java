package com.amor;

public class Proprietario
{
    private Proprietario() {}
    public static void login()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Login como Proprietário                  │");
        System.out.println("│                                             │");
        System.out.println("│    Informe a senha: ********                │");
        System.out.println("└─────────────────────────────────────────────┘");

        int password = Main.read.nextInt();

        if (password == 84178160)
        {
            mercado();
        }
        else
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Login como Proprietário                  │");
            System.out.println("│                                             │");
            System.out.println("│    Senha inválida!                          │");
            System.out.println("│                                             │");
            System.out.println("│    1- Informar a senha novamente            │");
            System.out.println("│    0- Voltar para o Menu Inicial            │");
            System.out.println("└─────────────────────────────────────────────┘");

            int option2 = Main.read.nextInt();

            if (option2 == 0) { Main.main(null); }
            else { login(); }
        }
    }

    public static void mercado()
    {
        while (true)
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Tela para manutenção do mercado          │");
            System.out.println("│                                             │");
            System.out.println("│    1- Carregar uma lista padrão de itens    │");
            System.out.println("│    2- Adição de itens à venda               │");
            if (! Mercado.getListaItens().isEmpty())
            {
                System.out.println("│    3- Remoção de itens à venda              │");
                System.out.println("│    4- Exibir itens que estão à venda        │");
                System.out.println("│    5- Ajuste de todos os dados do item      │");
            }
            System.out.println("│    0- Voltar para o Menu Inicial            │");
            System.out.println("└─────────────────────────────────────────────┘");

            int option = Main.read.nextInt();

            switch (option)
            {
                case 1:
                    carregar();
                    break;
                case 2:
                    adicionar();
                    break;
                case 3:
                    remover();
                    break;
                case 4:
                    exibir();
                    break;
                case 5:
                    ajustar();
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

    private static void carregar()
    {
        Mercado.add(new Item("Vagem", 2566, 1.63));
        Mercado.add(new Item("Shampoo", 3389, 11.90));
        Mercado.add(new Item("Gergelim", 1001, 4.14));
        Mercado.add(new Item("Óleo de coco", 1285, 18.85));
        Mercado.add(new Item("Cola em bastão", 5411, 3.00));
        Mercado.add(new Item("Semente de girassol", 1002, 3.75));
    }

    private static void adicionar()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Adição de itens à venda                  │");
        System.out.println("│                                             │");
        System.out.println("│    Quantos itens deseja adicionar ?         │");
        System.out.println("└─────────────────────────────────────────────┘");

        int quantidade = Main.read.nextInt();

        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Adição de itens à venda                  │");
        System.out.println("│                                             │");
        System.out.println("│    Primeiramente, informe o nome do         │");
        System.out.println("│    produto, segundamente, o código e por    │");
        System.out.println("│    fim, o valor a ser pago.                 │");
        System.out.println("└─────────────────────────────────────────────┘");

        for (int add = 0; add < quantidade; add++)
        {
            String name = Main.readString.nextLine();
            int code = Main.read.nextInt();
            double price = Double.parseDouble(Main.read.next());

            Mercado.getListaItens().forEach(x ->
            {
                if (x.getCode() == code)
                {
                    System.out.println("┌─────────────────────────────────────────────┐");
                    System.out.println("│ ############# T H A Í S H O P ############# │");
                    System.out.println("│                                             │");
                    System.out.println("│  • Adição de itens à venda                  │");
                    System.out.println("│                                             │");
                    System.out.println("│    Não foi possível adicionar item.         │");
                    System.out.println("└─────────────────────────────────────────────┘");
                    return;
                }
            });
            Mercado.add(new Item(name, code, price));

            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Adição de itens à venda                  │");
            System.out.println("│                                             │");
            System.out.println("│    Item adicionado com sucesso.             │");
            System.out.println("└─────────────────────────────────────────────┘");
        }
    }

    private static void remover()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Remoção de itens à venda                 │");
        System.out.println("│                                             │");
        System.out.println("│    Informe o código do produto que deseja   │");
        System.out.println("│    remover.                                 │");
        System.out.println("└─────────────────────────────────────────────┘");

        int code = Main.read.nextInt();

        if (Mercado.remover(code))
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Remoção de itens à venda                 │");
            System.out.println("│                                             │");
            System.out.println("│    Item removido com sucesso.               │");
            System.out.println("└─────────────────────────────────────────────┘");
            return;
        }

        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Remoção de itens à venda                 │");
        System.out.println("│                                             │");
        System.out.println("│    Item não encontrado.                     │");
        System.out.println("└─────────────────────────────────────────────┘");
    }

    private static void exibir()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Itens à venda                            │");
        System.out.println("│                                             │");
        System.out.println("│    A seguir, será exibido todos os itens    │");
        System.out.println("│    que estão à venda.                       │");
        System.out.println("└─────────────────────────────────────────────┘");

        Mercado.listar();
    }

    private static void ajustar()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Ajuste de todos os dados do item         │");
        System.out.println("│                                             │");
        System.out.println("│    Informe o index do produto que deseja    │");
        System.out.println("│    ajustar e em seguida, os novos dados do  │");
        System.out.println("│    item.                                    │");
        System.out.println("└─────────────────────────────────────────────┘");

        int index = Main.read.nextInt();

        if (Mercado.getListaItens().get(index) != null)
        {
            String name = Main.readString.next();
            int codigo = Main.read.nextInt();
            double price = Double.parseDouble(Main.read.next());

            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Ajuste de todos os dados do item         │");
            System.out.println("│                                             │");
            System.out.println("│    1- Concluir ajuste                       │");
            System.out.println("│    2- Cancelar ajuste                       │");
            System.out.println("└─────────────────────────────────────────────┘");

            int option = Main.read.nextInt();

            if (option == 1 & Item.ajustar(index, name, codigo, price))
            {
                System.out.println("┌─────────────────────────────────────────────┐");
                System.out.println("│ ############# T H A Í S H O P ############# │");
                System.out.println("│                                             │");
                System.out.println("│  • Ajuste de todos os dados do item         │");
                System.out.println("│                                             │");
                System.out.println("│    Item ajustado com sucesso.               │");
                System.out.println("└─────────────────────────────────────────────┘");
                return;
            }
            return;
        }
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Ajuste de todos os dados do item         │");
        System.out.println("│                                             │");
        System.out.println("│    Item não encontrado.                     │");
        System.out.println("└─────────────────────────────────────────────┘");
    }
}