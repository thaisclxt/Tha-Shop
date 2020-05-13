package com.amor;

public class Cliente
{
    private static Recipiente container;

    private Cliente() {}

    public static void login()
    {
        escolher();

        while (true)
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Tela para o cliente                      │");
            System.out.println("│                                             │");
            System.out.println("│    1- Colocar itens no recipiente           │");
            if (! container.getRecipiente().isEmpty())
            {
                System.out.println("│    2- Remover itens                         │");
                System.out.println("│    3- Ver todos os itens atuais             │");
            }
            System.out.println("│    4- Trocar recipiente                     │");
            if (! container.getRecipiente().isEmpty())
            System.out.println("│    5- Prever custo total                    │");
            System.out.println("│    6- Cancelar compra                       │");
            System.out.println("│    7- Confirmar compra                      │");
            System.out.println("│    0- Voltar para o Menu Inicial            │");
            System.out.println("└─────────────────────────────────────────────┘");

            int option = Main.read.nextInt();

            switch (option)
            {
                case 1:
                    add();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    container.show();
                    break;
                case 4:
                    change();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 171:
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

    public static void escolher()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Tela para o cliente                      │");
        System.out.println("│                                             │");
        System.out.println("│    Escolha um recipiente.                   │");
        System.out.println("│                                             │");
        System.out.println("│    1- Carrinho grande (60 itens)            │");
        System.out.println("│    2- Carrinho pequeno (35 itens)           │");
        System.out.println("│    3- Cesta (20 itens)                      │");
        System.out.println("└─────────────────────────────────────────────┘");

        container = new Recipiente(Main.read.nextInt());
    }

    public static void add()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Colocar itens no recipiente              │");
        System.out.println("│                                             │");
        System.out.println("│    Informe quantos itens deseja adicionar   │");
        System.out.println("│    no recipiente.                           │");
        System.out.println("└─────────────────────────────────────────────┘");

        int quantidade = Main.read.nextInt();

        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Colocar itens no recipiente              │");
        System.out.println("│                                             │");
        System.out.println("│    Informe o codigo do item que deseja      │");
        System.out.println("│    adicionar no recipiente.                 │");
        System.out.println("└─────────────────────────────────────────────┘");

        for (int addItens = 0; addItens < quantidade; addItens++)
        {
            int code = Main.read.nextInt();
            if (! container.add(code))
            {
                System.out.println("┌─────────────────────────────────────────────┐");
                System.out.println("│ ############# T H A Í S H O P ############# │");
                System.out.println("│                                             │");
                System.out.println("│  • Colocar itens no recipiente              │");
                System.out.println("│                                             │");
                System.out.println("│    Não foi possível adicionar item.         │");
                System.out.println("└─────────────────────────────────────────────┘");
                return;
            }
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Colocar itens no recipiente              │");
            System.out.println("│                                             │");
            System.out.println("│    Item adicionado com sucesso.             │");
            System.out.println("└─────────────────────────────────────────────┘");
        }
    }

    private static void remove()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Remover item do recipiente               │");
        System.out.println("│                                             │");
        System.out.println("│    Informe o código do produto que deseja   │");
        System.out.println("│    remover.                                 │");
        System.out.println("└─────────────────────────────────────────────┘");

        int code = Main.read.nextInt();

        if (container.getRecipiente().removeIf(x -> x.getCode() == code))
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Remover item do recipiente               │");
            System.out.println("│                                             │");
            System.out.println("│    Item removido com sucesso.               │");
            System.out.println("└─────────────────────────────────────────────┘");
            return;
        }

        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Remover item do recipiente               │");
        System.out.println("│                                             │");
        System.out.println("│    Item não encontrado.                     │");
        System.out.println("└─────────────────────────────────────────────┘");
    }

    public static void change()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Trocar recipiente                        │");
        System.out.println("│                                             │");
        System.out.printf("│    Seu recipiente atual armazena %d itens.  ", container.getSize());
        System.out.println("│                                             │");
        if (container.getSize() != 60)
        System.out.println("│    1- Carrinho grande (60 itens)            │");
        if (container.getSize() != 35)
        System.out.println("│    2- Carrinho pequeno (35 itens)           │");
        if (container.getSize() != 20)
        System.out.println("│    3- Cesta (20 itens)                      │");
        System.out.println("└─────────────────────────────────────────────┘");

        int change = Main.read.nextInt();

        switch (change)
        {
            case 1: change = 25; break;
            case 2: change = 15; break;
            case 3: change = 20; break;
        }

        container.setSize(change);
    }
}