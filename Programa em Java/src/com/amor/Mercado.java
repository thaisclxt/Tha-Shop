package com.amor;

public class Mercado
{
    public Mercado()
    {

    }

    public void screen()
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
        System.out.println("│    6- Concluir ajustes                      │");
        System.out.println("│    0- Voltar para o Menu Inicial            │");
        System.out.println("└─────────────────────────────────────────────┘");

        int option = Main.read.nextInt();

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
            case 0:
                Main.main(null);
                break;
            default:
                screen();
                break;
        }
    }
}