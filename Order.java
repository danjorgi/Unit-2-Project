import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthToolBarUI;

public class Order {
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {
        System.out.println("Hello customer. Would you like to place an order? (Y or N)");
        Scanner input = new Scanner(System.in);

        String placeOrder = input.nextLine();

        ArrayList<Object> order = new ArrayList<Object>();

        if(placeOrder.equalsIgnoreCase("Y")) {
            order.add(LocalDate.now());
            order.add(LocalTime.now());

            System.out.println("Here is the menu.");
            System.out.println("CUPCAKES:");

            int itemNumber = 0;

            for(int i = 0; i < cupcakeMenu.size(); i++) {
                itemNumber++;

                System.out.println(itemNumber + ".");

                cupcakeMenu.get(i).type();

                System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());

                System.out.println();
            }

            System.out.println("DRINKS:");

            for(int i = 0; i < drinkMenu.size(); i++) {
                itemNumber++;

                System.out.println(itemNumber + ".");

                drinkMenu.get(i).type();

                System.out.println("Price: $" + drinkMenu.get(i).getPrice());

                System.out.println();
            }
        } else {
            System.out.println("Have a nice day then.");
        }

        boolean ordering = true;

        while(ordering) {
            System.out.println("What would you like to order? "
            + "Please use the number associated with each item to order.");

            int orderChoice = input.nextLine();

            input.nextLine();

            if(orderChoice == 1) {
                order.add(cupcakeMenu.get(0));
                System.out.println("Item added to order.");
            } else if(orderChoice == 2) {
                order.add(cupcakeMenu.get(1));
                System.out.println("Item added to order.");
            } else if(orderChoice == 3) {
                order.add(cupcakeMenu.get(2));
                System.out.println("Item added to order.");
            } else if(orderChoice == 4) {
                order.add(cupcakeMenu.get(3));
                System.out.println("Item added to order.");
            } else if(orderChoice == 5) {
                order.add(cupcakeMenu.get(4));
                System.out.println("Item added to order.");
            } else if(orderChoice == 6) {
                order.add(cupcakeMenu.get(5));
                System.out.println("Item added to order.");
            } else {
                System.out.println("Sorry, we don't seem to have that on the menu.");
            }

            System.out.println("would you like to continue ordering? (Y/N)");

            String continueOrder = input.nextLine();

            if(!continueOrder.equalsIgnoreCase(Y)) {
                ordering = false;
            }
        }

    }
}
