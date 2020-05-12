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

    public static String listar()
    {
        String saida = "";

        for (Item item : listaItens)
        {
            saida += "\n Item nº " + listaItens.indexOf(item) + ":\n";
            saida += item.imprimir() + "\n";
        }

        return saida;
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