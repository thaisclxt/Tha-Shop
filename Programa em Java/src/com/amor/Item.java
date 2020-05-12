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

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price;
    }

    public String imprimir()
    {
        return "Nome do produto: " + name + "\nCódigo do produto: " + code +
                String.format("\nValor do produto: R$ %.2f\n", price) +
                "─────────────────────────────────────────────\n";
    }

    public static boolean ajustar(int index, String name, int code, double price)
    {
        if (Mercado.getListaItens().size() > index)
        {
            Mercado.getListaItens().get(index).setName(name);
            Mercado.getListaItens().get(index).setCode(code);
            Mercado.getListaItens().get(index).setPrice(price);
            return true;
        }
        else
        {
            return false;
        }
    }
}