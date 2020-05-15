package com.amor;
import java.util.Random;

public class Cliente
{
    public static Recipiente container;
    private Cliente() {}
    public static void login()
    {
        if (escolher() == 0) { return; }

        while (true)
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Tela para o cliente                      │");
            System.out.println("│                                             │");
            System.out.println("│    1- Trocar recipiente                     │");
            System.out.println("│    2- Adicionar itens no recipiente         │");
            if (! container.getRecipiente().isEmpty())
            {
                System.out.println("│    3- Remover itens                         │");
                System.out.println("│    4- Ver todos os itens atuais             │");
                System.out.println("│    5- Prever custo total                    │");
                System.out.println("│    6- Cancelar compra                       │");
                System.out.println("│    7- Confirmar compra                      │");
            }
            System.out.println("│    0- Voltar                                │");
            System.out.println("└─────────────────────────────────────────────┘");

            int option = Main.read.nextInt();

            switch (option)
            {
                case 1: change(); break;
                case 2: add(); break;
                case 3: remove(); break;
                case 4: container.show(); break;
                case 5: preview(); break;
                case 6: if (Caixa.cancel() == 0); return;
                case 7: Caixa.login(); break;
                case 171: steal(); break;
                case 0: return;
                default: break;
            }
        }
    }

    public static int escolher()
    {
        int option;
        do
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
            System.out.println("│    0- Voltar                                │");
            System.out.println("└─────────────────────────────────────────────┘");

            option = Main.read.nextInt();

            if (option == 0) { return 0; }

        } while (option < 0 | 3 < option);

        container = new Recipiente(option);

        return 1;
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
        System.out.printf("│    Seu recipiente atual armazena %d itens. │\n", container.getSize());
        System.out.println("│                                             │");
        if (container.getSize() != 60)
        System.out.println("│    1- Carrinho grande (60 itens)            │");
        if (container.getSize() != 35)
        System.out.println("│    2- Carrinho pequeno (35 itens)           │");
        if (container.getSize() != 20)
        System.out.println("│    3- Cesta (20 itens)                      │");
        System.out.println("│    0- Voltar                                │");
        System.out.println("└─────────────────────────────────────────────┘");

        int change = Main.read.nextInt();

        switch (change)
        {
            case 0: return;
            case 1: change = 25; break;
            case 2: change = 15; break;
            case 3: change = 20; break;
        }

        container.setSize(change);
    }
    public static void preview()
    {
        double total = container.getRecipiente().stream().mapToDouble(Item::getPrice).sum();
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Prever custo total                       │");
        System.out.println("│                                             │");
        System.out.printf("│    R$ %.2f                                 │\n", total);
        System.out.println("└─────────────────────────────────────────────┘");
    }

    public static void steal()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Opção secreta: Roubar                    │");
        System.out.println("│                                             │");
        System.out.println("│    Tem certeza que deseja roubar ?          │");
        System.out.println("│                                             │");
        System.out.println("│    \"Não furtarás.\" - Êxodo 20:15            │");
        System.out.println("│                                             │");
        System.out.println("│    1- Sim                                   │");
        System.out.println("│    0- Não                                   │");
        System.out.println("└─────────────────────────────────────────────┘");

        int areYouSure = Main.read.nextInt();

        if (areYouSure != 1)
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Opção secreta: Roubar                    │");
            System.out.println("│                                             │");
            System.out.println("│    Ótima opção! Vá e não peques mais.       │");
            System.out.println("└─────────────────────────────────────────────┘");
            return;
        }

        Random x = new Random();
        int chance = x.nextInt((int) Math.pow(2, container.getRecipiente().size())) + 1;

        if (chance == 1)
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Opção secreta: Roubar                    │");
            System.out.println("│                                             │");
            System.out.println("│    Furto realizado com sucesso. :(          │");
            System.out.println("└─────────────────────────────────────────────┘");
            return;
        }

        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Opção secreta: Roubar                    │");
        System.out.println("│                                             │");
        System.out.println("│    Furto realizado com fracasso.            │");
        System.out.println("└─────────────────────────────────────────────┘");
    }
}