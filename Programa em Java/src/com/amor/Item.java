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

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public void setRecipiente(Recipiente recipiente) { this.recipiente = recipiente; }

    public void imprimir()
    {
        System.out.println("Nome do produto: " + name);
        System.out.println("Código do produto: " + code);
        System.out.printf("Valor do produto: R$ %.2f\n", price);
        System.out.println("─────────────────────────────────────────────");
    }

    public static void ajustar(int index, String name, int code, double price)
    {
        for (Item item : Mercado.getListaItens())
        {
            if (item.getCode() == code)
            {
                System.out.println("┌─────────────────────────────────────────────┐");
                System.out.println("│ ############# T H A Í S H O P ############# │");
                System.out.println("│                                             │");
                System.out.println("│  • Ajustar todos os dados do item           │");
                System.out.println("│                                             │");
                System.out.println("│    Falha no ajuste! Este código já existe.  │");
                System.out.println("└─────────────────────────────────────────────┘");
                return;
            }
        }
        Mercado.getListaItens().get(index).setName(name);
        Mercado.getListaItens().get(index).setCode(code);
        Mercado.getListaItens().get(index).setPrice(price);

        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│ ############# T H A Í S H O P ############# │");
        System.out.println("│                                             │");
        System.out.println("│  • Ajustar todos os dados do item           │");
        System.out.println("│                                             │");
        System.out.println("│    Item ajustado com sucesso.               │");
        System.out.println("└─────────────────────────────────────────────┘");
    }
}