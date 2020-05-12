package com.amor;
import java.util.ArrayList;

public class Mercado
{
    private static ArrayList<Item> listaItens = new ArrayList<>();

    public static ArrayList<Item> getListaItens() { return listaItens; }

    public static void add(Item item)
    {
        listaItens.add(item);
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
        for (Item item : listaItens)
        {
            if (item.getCode() == code)
            {
                listaItens.remove(item);
                return true;
            }
        }
        return false;
    }


}