package com.gm.coffeemachine;

import java.util.Scanner;


public class Main {
    static Scanner scan = new Scanner(System.in);
    static Scanner scanInt= new Scanner(System.in);
    static  int water=400;
    static int milk=540;
    static int coffee=120;
    static int cups=9;
    static int money=550;

    public static void main(String[] args) {

        // show(water,milk,coffee,cups,money);
        String action;
        boolean exit = false;
        while(exit == false)
        {
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            action = scan.next();

            switch(action)
            {
                case "remaining":
                    remaning(water, milk, coffee, cups, money);
                    break;
                case "buy":
                    buy();
                    //remaning(water, milk, coffee, cups, money);
                    break;
                case "fill":
                    fill();

                    break;
                case "take":
                    take();
                    break;
                case "exit":
                    exit=true;
                    break;

            }
        }
        //fill
        //take
    }
    public static void take()
    {
        System.out.println("I gave you "+money);
        money=0;


    }
    public static void fill()
    {


        System.out.println("Write how many ml of water do you want to add: ");
        water=water+scanInt.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milk=milk+scanInt.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        coffee=coffee+scanInt.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        cups=cups+scanInt.nextInt();



    }
    public static void buy( )
    {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        String choose = scan.next();
        switch(choose)
        {
            case "1" :
                if(water>=250)
                {water=water-250;}
                else{System.out.println("Sorry not enough water");
                    break;}

                if(coffee>=16){ coffee=coffee-16;}
                else{System.out.println("Sorry not enough coffee");
                    break;}

                if(cups>=1)
                {cups=cups-1;}
                else{System.out.println("Sorry not enough cups");
                    break;}
                money=money+4;
                System.out.println("I have enough resources, making you a coffee!");
                break;



            case "2" :
                if(water>=350)
                {water=water-350;}
                else{System.out.println("Sorry not enough water");
                    break;}

                if(milk>=75)
                {milk=milk-75;}
                else{System.out.println("Sorry not enough milk");
                    break;}

                if(coffee>=20){ coffee=coffee-20;}
                else{System.out.println("Sorry not enough coffee");
                    break;}

                if(cups>=1)
                {cups=cups-1;}
                else{System.out.println("Sorry not enough cups");
                    break;}
                money= money+7;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            case "3":

                if(water>=200)
                {water=water-200;}
                else{System.out.println("Sorry not enough water");
                    break;}

                if(milk>=100)
                {milk=milk-100;}
                else{System.out.println("Sorry not enough milk");
                    break;}

                if(coffee>=12){ coffee=coffee-12;}
                else{System.out.println("Sorry not enough coffee");
                    break;}

                if(cups>=1)
                {cups=cups-1;}
                else{System.out.println("Sorry not enough cups");
                    break;}
                money= money+6;
                System.out.println("I have enough resources, making you a coffee!");
                break;

                 default:
                    break;
        }


    }
    public static void remaning(int water,int milk,int coffee,int cups,int money)
    {
        System.out.println("The coffee machine has:");
        System.out.println(water+" of water");
        System.out.println(milk+" of milk");
        System.out.println(coffee+" of coffee beans");
        System.out.println(cups+" of disposable cups");
        System.out.println(money + " of money");

    }
    
    
}
