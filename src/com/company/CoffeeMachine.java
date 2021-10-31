package com.company;

import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bue();
    }
    public static void amount(int guests) {
        System.out.println(guests * 200 + " ml of water");
        System.out.println(guests * 50 + " ml of milk");
        System.out.println(guests * 15 + " g of coffee beans");
    }
    public static void supply(int mlOfWater, int mlOfMilk, int grams, int cups) {
        int cupsCount;
        int a = mlOfWater / 200;
        int b = mlOfMilk / 50;
        int c = grams / 15;
        cupsCount = a < b ? (a < c ? a : c) : (b < c ? b : c);

        if ((mlOfWater < 200 || mlOfMilk < 50 || grams < 15) && cups > 0) {
            System.out.println("No, I can make only 0 cup(s) of coffee");
        }
        else if ((mlOfWater < 200 || mlOfMilk < 50 || grams < 15) && cups <= 0){
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if ((mlOfWater > 200 && mlOfMilk > 50 && grams > 15) && cups == cupsCount){
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if ((mlOfWater > 200 && mlOfMilk > 50 && grams > 15) && cups <= 0) {
            System.out.println("Yes, I can make that amount of coffee (and even" + cupsCount + "more than that)");
        }
        else if ((mlOfWater > 200 && mlOfMilk > 50 && grams > 15) && cups > cupsCount) {
            System.out.println("No, I can make only" + cupsCount + "cup(s) of coffee");
        }
        else if ((mlOfWater > 200 && mlOfMilk > 50 && grams > 15) && cups < cupsCount) {
            System.out.println("Yes, I can make that amount of coffee (and even" + (cupsCount - cups) + "more than that)");
        }
    }
    public static void bue() {
        Scanner sc = new Scanner(System.in);
        int a = 400;
        int b = 540;
        int c = 120;
        int d = 9;
        int e = 550;
        boolean menu = true;
        while (menu = true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String str = sc.nextLine();
            System.out.println();
            switch (str) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String x = sc.nextLine();
                    System.out.println();
                    switch (x) {
                        case "1":
                            if(a >= 250 && c >= 16 && d >= 1){
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                                a = a - 250;
                                c = c - 16;
                                d = d - 1;
                                e = e + 4;
                            }
                            else {
                                System.out.println("Sorry, not enough water!");
                                System.out.println();
                            }
                            break;

                        case "2":
                            if (a >= 350 && b >= 75 && c >= 20 && d >= 1){

                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                                a = a - 350;
                                b = b - 75;
                                c = c - 20;
                                d = d - 1;
                                e = e + 7;
                            }
                            else {
                                System.out.println("Sorry, not enough water!");
                                System.out.println();
                            }
                            break;
                        case "3":
                            if (a >= 200 && b >= 100 && c >= 12 && d >= 1){
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                                a = a - 200;
                                b = b - 100;
                                c = c - 12;
                                d = d - 1;
                                e = e + 6;
                            }
                            else {
                                System.out.println("Sorry, not enough water!");
                                System.out.println();
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;


                case "fill":

                    System.out.println("Write how many ml of water you want to add:");
                    int w = sc.nextInt();
                    a = a + w;
                    System.out.println("Write how many ml of milk you want to add:");
                    int m = sc.nextInt();
                    b = b + m;
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    int cb = sc.nextInt();
                    c = c + cb;
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    int coc = sc.nextInt();
                    d = d + coc;
                    System.out.println();
                    break;
                case "take":

                    System.out.println("I gave you $" + e);
                    System.out.println();
                    e = 0;
                    break;

                case  "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(a + " ml of water");
                    System.out.println(b + " ml of milk");
                    System.out.println(c + " g of coffee beans");
                    System.out.println(d + " disposable cups");
                    System.out.println("$" + e + " of money");
                    System.out.println();
                    break;

                case "exit":
                    menu = false;
                    break;
            }
            if (menu == false) {
                break;
            }
        }
    }

}
