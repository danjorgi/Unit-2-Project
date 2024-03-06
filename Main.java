import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu."
            + "\nWe currently have three cupcakes on the menu but we need to decide on pricing.");

        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake."
            + "\nHere is the description: ");
        cupcake.type();

        System.out.println("How much would you like to charge for the cupcake?"
            + "\n(Input a numerical number taken to 2 decimal places)");
        
        String priceText = input.nextLine();
        double price = Double.parseDouble(priceText);

        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our Red Velvet cupcake."
            + "\nHere is the description: ");
        redVelvet.type();

        System.out.println("How much would you like to charge for the Red Velvet cupcake?"
            + "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);

        redVelvet.setPrice(price);

        System.out.println("We are deciding on the price for our Chocolate cupcake."
            + "\nHere is the description: ");
        chocolate.type();

        System.out.println("How much would you like to charge for the Chocolate cupcake?"
            + "\n(Input a numerical number taken to 2 decimal palces)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);

        chocolate.setPrice(price);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();

        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are in the middle of creating the drink menu."
            + "\nWe currently have three drinks on the menu, btu we need to decide on pricing.");

        System.out.println("We are deciding on the price for our bottled water." 
            +"\nHere is the description: ");
        water.type();

        System.out.println("How much would you like to charge for the water bottle?"
            + "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        water.setPrice(price);

        System.out.println("We are deciding on the price for our bottle of soda."
            + "\nHere is the description: ");
        soda.type();

        System.out.println("How much would you like to charge for the bottled soda?"
            + "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        soda.setPrice(price);

        System.out.println("We are deciding on the price for our bottle of milk."
            + "\nHere is the description: ");
        milk.type();

        System.out.println("How much would you like to charge for the bottled milk?"
            + "\n(Input a numberical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        milk.setPrice(price);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        new Order(cupcakeMenu, drinkMenu);
    }
}

class Cupcake {

    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A basic, genereic cupcake, with vanilla frosting.");
    }
}

class RedVelvet extends Cupcake {

    public void type() {
        System.out.println("A red velevet based cupcake, with cream cheese frosting.");
    }
}

class Chocolate extends Cupcake {

    public void type() {
        System.out.println("A chocolate based cupcake, with chocolate frosting.");
    }
}

class Drink {

    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A bottle of water.");
    }
}

class Soda extends Drink {
    
    public void type() {
        System.out.println("A bottle of soda.");
    }
}

class Milk extends Drink {

    public void type() {
        System.out.println("A bottle of milk.");
    }
}