package com.amor;

import java.util.ArrayList;

public class Recipiente
{
    private ArrayList<Item> recipiente = new ArrayList<>();
    private int size;

    public Recipiente(int option)
    {
        size = 0;
        switch (option)
        {
            case 1:
                size += 25;
            case 2:
                size += 15;
            case 3:
                size += 20;
                break;
        }
    }

    public ArrayList<Item> getRecipiente() { return recipiente; }
    public int getSize() { return size; }

    public boolean add(int code)
    {
        if (recipiente.size() >= getSize())
        {
            return false;
        }
        for (Item item : Mercado.getListaItens())
        {
            if (item.getCode() == code)
            {
                recipiente.add(item);
                return true;
            }
        }
        return false;
    }
}