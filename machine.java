package machine;

import java.util.Scanner;

public class machine {
    Scanner scanner;
    int water;
    int milk;
    int coffeeBeans;
    int cups;
    int till;

    public machine() {
        this.water = 400;
        this.milk = 540;
        this.coffeeBeans = 120;
        this.cups = 9;
        this.till = 550;
        this.scanner = new Scanner(System.in);
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getMilk() {
        return milk;
    }

    public int getWater() {
        return water;
    }

    public int getCups() {
        return cups;
    }

    public int getTill() {
        return till;
    }

    public void buyEspresso() {
        if (this.water >= 250 && this.coffeeBeans >= 16 && this.cups >= 1) {
            water -= 250;
            coffeeBeans -= 16;
            cups -= 1;
            till += 4;
            System.out.println();
        }
    }

    public void buyLatte() {
        if (this.water >= 350 && this.coffeeBeans >= 20 && this.milk >= 75 && this.cups >= 1) {
            water -= 350;
            coffeeBeans -= 20;
            milk -= 75;
            cups -= 1;
            till += 7;
            System.out.println();
        }

    }

    public void buyCappuccino() {
        if (this.water >= 200 && this.coffeeBeans >= 12 && this.milk >= 100 && this.cups >= 1) {
            water -= 200;
            coffeeBeans -= 12;
            milk -= 100;
            cups -= 1;
            till += 6;
            System.out.println();
        }
    }

    public void fill() {
        System.out.println("Write how many ml of water you want to add:");
        System.out.print("> ");
        int waterAdded = scanner.nextInt();

        System.out.println("Write how many ml of milk you want to add:");
        System.out.print("> ");
        int milkAdded = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add:");
        System.out.print("> ");
        int coffeeAdded = scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee you want to add:");
        System.out.print("> ");
        int cupsAdded = scanner.nextInt();

        water += waterAdded;
        milk += milkAdded;
        coffeeBeans += coffeeAdded;
        cups += cupsAdded;
    }

    public void take() {
        System.out.println("I gave you $" + till);
        till -= till;
        System.out.println();
    }


    public void state() {
        System.out.println("The coffee machine has: ");
        System.out.println(getWater() + " ml of water ");
        System.out.println(getMilk() + " ml of milk" );
        System.out.println(getCoffeeBeans() + " g of coffee ");
        System.out.println(getCups() + " disposable cups");
        System.out.println("$" + getTill() + " of money");
    }
}
