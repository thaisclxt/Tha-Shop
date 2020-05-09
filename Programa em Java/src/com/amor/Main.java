package com.amor;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("┌─────────────────────────────────┐");
            System.out.println("│ ####### T H A Í S H O P ####### │");
            System.out.println("│                                 │");
            System.out.println("│ 1- Login como Proprietário      │");
            System.out.println("│ 2- Login como Cliente           │");
            System.out.println("│ 3- Login como Caixa             │");
            System.out.println("└─────────────────────────────────┘");

            Scanner read = new Scanner(System.in);
            int option = read.nextInt();

            if (option != 1 & option != 2 & option != 3) { break; }

            switch (option)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }
    }
}