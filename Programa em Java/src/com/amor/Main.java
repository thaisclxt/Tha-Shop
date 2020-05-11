package com.amor;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static Scanner read = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Menu Inicial                             │");
        System.out.println("│                                             │");
        System.out.println("│    1- Login como Proprietário               │");
        System.out.println("│    2- Login como Cliente                    │");
        System.out.println("│    3- Login como Caixa                      │");
        System.out.println("│    0- Sair do programa                      │");
        System.out.println("└─────────────────────────────────────────────┘");

        int option = read.nextInt();

        switch (option)
        {
            case 1:
                loginProprietario();
                break;
            case 2:
                loginCliente();
                break;
            case 3:
                loginCaixa();
                break;
            case 0:
                break;
            default:
                main(args);
        }
    }

    public static void loginProprietario()
    {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Login como Proprietário                  │");
        System.out.println("│                                             │");
        System.out.println("│    Informe a senha: ********                │");
        System.out.println("└─────────────────────────────────────────────┘");

        int password = read.nextInt();

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

            int option2 = read.nextInt();

            if (option2 == 0) { main(null); }
            else { loginProprietario(); }
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
            System.out.println("│    3- Remoção de itens à venda              │");
            System.out.println("│    4- Exibir itens que estão à venda        │");
            System.out.println("│    5- Ajuste de todos os dados do item      │");
            System.out.println("│    0- Voltar para o Menu Inicial            │");
            System.out.println("└─────────────────────────────────────────────┘");

            int option = Main.read.nextInt();

            ArrayList<Item> list = new ArrayList<>();

            switch (option)
            {
                case 1:
                    list.add(new Item("Vagem", 2566, 1.63));
                    list.add(new Item("Shampoo", 3389, 11.90));
                    list.add(new Item("Gergelim", 1001, 4.14));
                    list.add(new Item("Óleo de coco", 1285, 18.85));
                    list.add(new Item("Cola em bastão", 5411, 3.00));
                    list.add(new Item("Semente de girassol", 1002, 3.75));

                    for (Item products : list)
                    {
                        System.out.println(products);
                    }
                    break;
                case 2:
                    System.out.println("┌─────────────────────────────────────────────┐");
                    System.out.println("│ ############# T H A Í S H O P ############# │");
                    System.out.println("│                                             │");
                    System.out.println("│  • Adição de itens à venda                  │");
                    System.out.println("│                                             │");
                    System.out.println("│    Quantos itens deseja adicionar ?         │");
                    System.out.println("└─────────────────────────────────────────────┘");

                    int quantidade = read.nextInt();

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
                        String name = read.next();
                        int code = read.nextInt();
                        double price = Double.parseDouble(read.next());

                        list.add(new Item(name, code, price));
                    }
                    break;
                case 3:
                    System.out.println("┌─────────────────────────────────────────────┐");
                    System.out.println("│ ############# T H A Í S H O P ############# │");
                    System.out.println("│                                             │");
                    System.out.println("│  • Remoção de itens à venda                 │");
                    System.out.println("│                                             │");
                    System.out.println("│    Informe o código do produto que deseja   │");
                    System.out.println("│    remover.                                 │");
                    System.out.println("└─────────────────────────────────────────────┘");

                    String remove = read.next();

                    list.remove(remove);

                    break;
                case 4:
                    System.out.println("┌─────────────────────────────────────────────┐");
                    System.out.println("│ ############# T H A Í S H O P ############# │");
                    System.out.println("│                                             │");
                    System.out.println("│  • Itens à venda                            │");
                    System.out.println("│                                             │");
                    System.out.println("│    A seguir, será exibido todos os itens    │");
                    System.out.println("│    que estão à venda.                       │");
                    System.out.println("└─────────────────────────────────────────────┘");

                    for (Item products : list)
                    {
                        System.out.println("Nome do produto: " + products.getName());
                        System.out.println("Código do produto: " + products.getCode());
                        System.out.println("Valor do produto: " + products.getPrice());
                        System.out.println("─────────────────────────────────────────────");
                    }

                    break;
                case 5:
                    System.out.println("┌─────────────────────────────────────────────┐");
                    System.out.println("│ ############# T H A Í S H O P ############# │");
                    System.out.println("│                                             │");
                    System.out.println("│  • Ajuste de todos os dados do item         │");
                    System.out.println("│                                             │");
                    System.out.println("│    Informe o index do produto que deseja    │");
                    System.out.println("│    ajustar e em seguida, os novos dados do  │");
                    System.out.println("│    item.                                    │");
                    System.out.println("└─────────────────────────────────────────────┘");

                    int index = read.nextInt();

                    String name = read.next();
                    int code = read.nextInt();
                    double price = Double.parseDouble(read.next());

                    System.out.println("┌─────────────────────────────────────────────┐");
                    System.out.println("│ ############# T H A Í S H O P ############# │");
                    System.out.println("│                                             │");
                    System.out.println("│  • Ajuste de todos os dados do item         │");
                    System.out.println("│                                             │");
                    System.out.println("│    1- Concluir ajuste                       │");
                    System.out.println("│    2- Cancelar ajuste                       │");
                    System.out.println("└─────────────────────────────────────────────┘");

                    int option3 = read.nextInt();

                    if (option3 == 1)
                    {
                        if (index < list.size())
                        {
                            list.remove(index);
                            list.add(new Item(name, code, price));
                        }
                        else
                        {
                            System.out.println("┌─────────────────────────────────────────────┐");
                            System.out.println("│ ############# T H A Í S H O P ############# │");
                            System.out.println("│                                             │");
                            System.out.println("│  • Ajuste de todos os dados do item         │");
                            System.out.println("│                                             │");
                            System.out.println("│    Item inexistente.                        │");
                            System.out.println("└─────────────────────────────────────────────┘");
                        }
                    }
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

    public static void loginCliente()
    {
        while (true)
        {
            System.out.println("┌─────────────────────────────────────────────┐");
            System.out.println("│ ############# T H A Í S H O P ############# │");
            System.out.println("│                                             │");
            System.out.println("│  • Tela para o cliente                      │");
            System.out.println("│                                             │");
            System.out.println("│    1- Colocar itens no recipiente           │");
            System.out.println("│    2- Remover itens                         │");
            System.out.println("│    3- Ver todos os itens atuais             │");
            System.out.println("│    4- Trocar recipiente                     │");
            System.out.println("│    5- Prever custo total                    │");
            System.out.println("│    6- Cancelar compra                       │");
            System.out.println("│    7- Confirmar compra                      │");
            System.out.println("│    8- Opção secreta: Roubar                 │");
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
                case 6:
                    break;
                case 7:
                    break;
                case 8:
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

    public static void loginCaixa()
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

            if (option2 == 0) { main(null); }
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
}