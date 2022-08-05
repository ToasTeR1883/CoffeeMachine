package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
/*
        int cups = 0;
        int water = 200;
        int coffee = 15;
        int milk = 50;

        int waterSupply;
        int coffeeSupply;
        int milkSupply;
        int requestedCups;
*/

/*
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        */

/*
        System.out.println("Write how many cups of coffee you will need:");
        cups = scanner.nextInt();
        System.out.println("For " + cups + " cups of coffee you will need: ");
        System.out.println(cups * water + " ml of water");
        System.out.println(cups * milk + " ml of milk");
        System.out.println(cups * coffee + " g of coffee beans");
*/
        /*
        System.out.println("Write how many ml of water the coffee machine has:");
        waterSupply = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        milkSupply = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        coffeeSupply = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        requestedCups = scanner.nextInt();
*//*
        int smallest = 0;
        int maxWater = waterSupply / 200;
        int maxCoffee = coffeeSupply / 15;
        int maxMilk = milkSupply / 50;

        if (maxWater <= maxCoffee) {
            smallest = maxWater;
        } else {
            smallest = maxCoffee;
        }
        if (maxWater <= maxMilk) {
            smallest = maxWater;
        } else {
            smallest = maxMilk;
        }
        if (maxCoffee <= maxMilk && maxCoffee <= maxWater) {
            smallest = maxCoffee;
        }

        if (smallest == requestedCups) {
            System.out.println("Yes, I can make that amount of coffee");
        }
        if (smallest > requestedCups) {
            //System.out.println("No, I can only make " + smallest + " cup(s) of coffee ");
            System.out.println("Yes, I can make that amount of coffee ( and even " + (smallest - requestedCups) + " more than that) ");
        }
        if (smallest < requestedCups) {
            //System.out.println("Yes, I can make that amount of coffee ( and even " + (requestedCups - smallest) + " more than that) ");
            System.out.println("No, I can only make " + smallest + " cup(s) of coffee ");
        }*/

        Scanner scanner = new Scanner(System.in);
        machine pot = new machine();


        while (true) {
            pot.state();
            System.out.println();
            System.out.println("Write action (buy, fill, take):");
            //System.out.print("> ");
            String action = scanner.next();
            //System.out.println();
            if (action.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
                System.out.print("> ");
                int choice = scanner.nextInt();
                if (choice == 1 ) {
                    pot.buyEspresso();

                }
                if (choice == 2 ) {
                    pot.buyLatte();

                }
                if (choice == 3 ) {
                    pot.buyCappuccino();

                }
            }
            if (action.equals("fill")) {
                pot.fill();

            }
            if (action.equals("take")) {
                pot.take();

            }
            if (action.equals("q")) {
                break;
            }
        }
    }

}