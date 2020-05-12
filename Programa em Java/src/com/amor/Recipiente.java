package com.amor;

public class Recipiente
{
    private int carrinhoGrande[][][] = new int[60][3][1];
    private int carrinhoPequeno[][][] = new int[35][3][1];
    private int cesta[][][] = new int[20][3][1];

    public Recipiente() { }

    public static void adicionar(String name)
    {
        if (Mercado.getListaItens().contains(name))
        {

        }
    }
}