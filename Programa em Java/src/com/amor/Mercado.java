package com.amor;
import java.util.ArrayList;

public class Mercado
{
    private static ArrayList<Item> listaItens = new ArrayList<>();

    private Mercado() {}

    public static ArrayList<Item> getListaItens() { return listaItens; }

    public static void add(Item item)
    {
        for (Item x : listaItens)
        {
            if (x.getCode() == item.getCode())
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
        }
        listaItens.add(item);
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Adição de itens à venda                  │");
        System.out.println("│                                             │");
        System.out.println("│    Item adicionado com sucesso.             │");
        System.out.println("└─────────────────────────────────────────────┘");
    }

    public static void listar()
    {
        for (Item item : listaItens)
        {
            System.out.println("\n  Item nº " + listaItens.indexOf(item) + ":\n");
            item.imprimir();
        }
    }

    public static boolean remover(int code)
    {
        int quantidade = listaItens.size();
        listaItens.removeIf(x -> x.getCode() == code);

        return quantidade != listaItens.size();
    }
}