//Name: Foo Whye Keat
//FT
//Tutorial: T02F
//Student no.: 7432628
//Declaration: This work is done by me and no one else

import java.util.Scanner;

class whyekeat_a1 {
    public static void main(String[] args) {
        //Creating new scanner class
        Scanner input = new Scanner(System.in);

        //Displaying Start system
        System.out.println("Welcome to iPhones online service");
        System.out.println("-------------------------------");
        System.out.println("Enter three iPhones to be sold");

        //Defining first variable and input for first phone
        System.out.print("1. ");
        String phone1 = input.nextLine();

        //Input for second phone
        System.out.print("2. ");
        String phone2 = input.nextLine();

        //Input for third phone
        System.out.print("3. ");
        String phone3 = input.nextLine();
//----------------------------------------------------------------------------------------

        //Other Info Display
        System.out.println("\nSome other info");
        System.out.println("---------------");

        //Delivery address input
        System.out.print("Delivery address: ");
        String address = input.nextLine();

        //Postal code input
        System.out.print("Postal code: ");
        String postal = input.nextLine();

        //Country
        System.out.print("Country: ");
        String country = input.nextLine();

//----------------------------------------------------------------------------------------
        //Quantity and cost entering
        System.out.println("\nQuantity and cost");
        System.out.println("-----------------");

        //Quantities and costs for the phone1
        System.out.print("Enter the quantities and price of " + phone1 + ": ");
        int p1quantity = input.nextInt();
        double p1price = input.nextDouble();

        //Quantities and costs for the phone2
        System.out.print("Enter the quantities and price of " + phone2 + ": ");
        int p2quantity = input.nextInt();
        double p2price = input.nextDouble();

        //Quantities and costs for the phone3
        System.out.print("Enter the quantities and price of " + phone3 + ": ");
        int p3quantity = input.nextInt();
        double p3price = input.nextDouble();

//--------------------------------------------------------------------------------
        //Summary of phones, quantities and costs
        System.out.println("\nSummary of iPhones");
        System.out.println("--------------------");

        //Formatting the table
        System.out.printf("\n%-20s" + "%-15s" + "%-12s", "iPhone", "Quantity", "Cost");
        System.out.println("\n------------------------------------------------");

        //Line 1 of the table
        System.out.printf("%-20s" + "%-15d" + "%-12.2f", phone1, p1quantity, p1price);

        //Line 2 of the table
        System.out.printf("\n%-20s" + "%-15d" + "%-12.2f", phone2, p2quantity, p2price);

        //Line 3 of the table
        System.out.printf("\n%-20s" + "%-15d" + "%-12.2f", phone3, p3quantity, p3price);

        System.out.println("\n------------------------------------------------");

//-----------------------------------------------------------------------------------------------------
        //Swapping of quantity and price information for phone 1 and phone 2

        //Quantity swap
        int temp;
        temp = p1quantity;
        p1quantity = p2quantity;
        p2quantity = temp;

        //Price swap
        double temp1;
        temp1 = p1price;
        p1price = p2price;
        p2price = temp1;

        //Phone name swap
        String temp3;
        temp3 = phone1;
        phone1 = phone2;
        phone2 = temp3;

//-----------------------------------------------------------------------------------------------------
        //Customer order screen
        System.out.println("\nPlease place your order");
        System.out.println("------------------------");

        //Number of phone1
        System.out.print("No. of " + phone1 + ": ");
        int p1order = input.nextInt();

        //Number of phone2
        System.out.print("No. of " + phone2 + ": ");
        int p2order = input.nextInt();

        //Number of phone3
        System.out.print("No. of " + phone3 + ": ");
        int p3order = input.nextInt();
//-----------------------------------------------------------------------------------------------------
        //Order Summary
        System.out.println("\nSummary of your order");
        System.out.println("---------------------");

        //Order Summary table
        System.out.printf("\n%-20s" + "%-15s" + "%-12s", "iPhone", "Quantity", "Cost");
        System.out.println("\n---------------------------------------------");

        //Calculating the total costs of all 3 phones
        double p1total = (p1price * p1order);
        double p2total = (p2price * p2order);
        double p3total = (p3price * p3order);
        double ptotal = p1total + p2total + p3total;

        //Contents of the table
        //Line 1 of the table
        System.out.printf("%-20s" + "%-15d" + "%-12.2f", phone1, p1order, p1total);

        //Line 2 of the table
        System.out.printf("\n%-20s" + "%-15d" + "%-12.2f", phone2, p2order, p2total);

        //Line 3 of the table
        System.out.printf("\n%-20s" + "%-15d" + "%-12.2f", phone3, p3order, p3total);

        System.out.println("\n---------------------------------------------");

        //Calculating and displaying the subtotal
        System.out.printf("%-20s" + "%-15s" + "%-12.2f", "Subtotal: ", " ", (p1total + p2total + p3total));

        //Calculating and displaying gst
        //Defining gst as a constant
        final double gst = (7.0/100);
        double interest = (gst) * (p1total + p2total + p3total);
        System.out.printf("\n%-20s" + "%-15s" + "%-12.2f", "GST (7%) ", " ", interest);

        //Calculating and displaying total cost
        double totalcost = ptotal + (interest);
        System.out.printf("\n%-20s" + "%-15s" + "%-12.2f", "Total cost: ", " ", totalcost);

        System.out.println("\n---------------------------------------------");

//-----------------------------------------------------------------------------------------------------
        //Displaying of balance report
        System.out.println("\nBalance report");
        System.out.println("---------------");

        //Calculating balances
        int p1balance = (p1quantity - p1order);
        int p2balance = (p2quantity - p2order);
        int p3balance = (p3quantity - p3order);


        //Reforming the table
        System.out.printf("\n%-20s" + "%-15s" + "%-12s" + "%-12s", "iPhone", "Quantity", "Sold", "Balance");
        System.out.println("\n--------------------------------------------------------");

        //Row1
        System.out.printf("%-20s" + "%-15s" + "%-12s" + "%-12s", phone1, p1quantity, p1order, p1balance);

        //Row2
        System.out.printf("\n%-20s" + "%-15s" + "%-12s" + "%-12s", phone2, p2quantity, p2order, p2balance);

        //Row3
        System.out.printf("\n%-20s" + "%-15s" + "%-12s" + "%-12s", phone3, p3quantity, p3order, p3balance);

        System.out.println("\n--------------------------------------------------------");
    }

}

