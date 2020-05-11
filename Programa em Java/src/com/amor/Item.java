package com.amor;

public class Item
{
    private String name;
    private int code;
    private double price;

    public Item(String name, int code, double price)
    {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Nome do produto: " + name + "\n" + "Código do produto: " + code + "\n" + "Valor do produto: " + price + "\n" + "─────────────────────────────────────────────\n";
    }
}