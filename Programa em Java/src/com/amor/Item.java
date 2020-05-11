package com.amor;

public class Item
{
    private String name;
    private int code;
    private double price;
    private Recipiente recipiente;

    public Item(String name, int code, double price)
    {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public void setRecipiente(Recipiente recipiente)
    {
        this.recipiente = recipiente;
    }

    public String getName() { return name; }
    public int getCode() { return code; }
    public double getPrice() { return price; }


/*
    public String toString()
    {
        return "Nome do produto: " + name + "\n" + "Código do produto: " + code + "\n" + "Valor do produto: " + price + "\n" + "─────────────────────────────────────────────\n";
    }
*/

}