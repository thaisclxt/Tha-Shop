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

            int option = Main.read.nextInt();

            if (option == 0) { return; }
            else { login(); }
        }
        return;
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
            System.out.println("│    2- Adicionar item à venda                │");
            if (! Mercado.getListaItens().isEmpty())
            {
                System.out.println("│    3- Remover item à venda                  │");
                System.out.println("│    4- Exibir itens que estão à venda        │");
                System.out.println("│    5- Ajustar todos os dados do item        │");
            }
            System.out.println("│    0- Voltar para o Menu Inicial            │");
            System.out.println("└─────────────────────────────────────────────┘");

            int option = Main.read.nextInt();

            switch (option)
            {
                case 1: carregar(); break;
                case 2: adicionar(); break;
                case 3: remover(); break;
                case 4: exibir(); break;
                case 5: ajustar(); break;
                case 0: return;
                default: break;
            }
        }
    }

    private static void carregar()
    {
        Mercado.add(new Item("Absorvente", 0, 5.25));
        Mercado.add(new Item("Algodão", 1, 3.50));
        Mercado.add(new Item("KitKat", 2, 4.00));
        Mercado.add(new Item("Shampoo", 3, 11.90));
        Mercado.add(new Item("Condicionador", 4, 9.90));
        Mercado.add(new Item("Óleo de coco", 5, 20.00));
        Mercado.add(new Item("Esmalte", 6, 4.15));
        Mercado.add(new Item("Semente de girassol", 7, 3.75));
        Mercado.add(new Item("Pão francês", 8, 6.58));
        Mercado.add(new Item("Muzzarela", 9, 3.46));
        Mercado.add(new Item("Maçã", 10, 7.45));
        Mercado.add(new Item("Melão", 11, 9.27));
        Mercado.add(new Item("Cebola roxa", 12, 3.95));
    }

    private static void adicionar()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Adicionar item à venda                   │");
        System.out.println("│                                             │");
        System.out.println("│    Primeiramente, informe o nome do         │");
        System.out.println("│    produto, segundamente, o código e por    │");
        System.out.println("│    fim, o valor a ser pago.                 │");
        System.out.println("└─────────────────────────────────────────────┘");

        Mercado.add(new Item(Main.readString.nextLine(), Main.read.nextInt(), Double.parseDouble(Main.read.next())));
    }

    private static void remover()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Remover item à venda                     │");
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
            System.out.println("│  • Remover item à venda                     │");
            System.out.println("│                                             │");
            System.out.println("│    Item removido com sucesso.               │");
            System.out.println("└─────────────────────────────────────────────┘");
            return;
        }

        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Remover item à venda                     │");
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
        System.out.println("│  • Ajustar todos os dados do item           │");
        System.out.println("│                                             │");
        System.out.println("│    Informe o index do produto que deseja    │");
        System.out.println("│    ajustar e em seguida, os novos dados do  │");
        System.out.println("│    item.                                    │");
        System.out.println("└─────────────────────────────────────────────┘");

        int index = Main.read.nextInt();

        if (Mercado.getListaItens().size() <= index)
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Ajustar todos os dados do item           │");
            System.out.println("│                                             │");
            System.out.println("│    Item não encontrado.                     │");
            System.out.println("└─────────────────────────────────────────────┘");
            return;
        }

        String name = Main.readString.nextLine();
        int codigo = Main.read.nextInt();
        double price = Double.parseDouble(Main.read.next());

        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Ajustar todos os dados do item           │");
        System.out.println("│                                             │");
        System.out.println("│    1- Concluir ajuste                       │");
        System.out.println("│    0- Cancelar ajuste                       │");
        System.out.println("└─────────────────────────────────────────────┘");

        int option = Main.read.nextInt();

        if (option != 1)
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Ajustar todos os dados do item           │");
            System.out.println("│                                             │");
            System.out.println("│    Ajuste cancelado.                        │");
            System.out.println("└─────────────────────────────────────────────┘");
            return;
        }

        Item.ajustar(index, name, codigo, price);
    }
}