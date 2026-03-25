import java.util.Scanner;

public class Alpha3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] stockNames = {"TCS", "Infosys", "Wipro"};
        double[] stockPrices = {3500, 1500, 400};
        int[] stocksOwned = {0, 0, 0};

        double balance = 10000;
        int choice;

        do {
            System.out.println("\n--- Stock Trading Menu ---");
            System.out.println("1. View Stocks");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("\nAvailable Stocks:");
                for (int i = 0; i < stockNames.length; i++) {
                    System.out.println(i + ". " + stockNames[i] + " - Price: " + stockPrices[i]);
                }
            } 
            else if (choice == 2) {
                System.out.print("Enter stock index to buy: ");
                int index = sc.nextInt();

                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();

                double cost = qty * stockPrices[index];

                if (cost <= balance) {
                    balance -= cost;
                    stocksOwned[index] += qty;
                    System.out.println("Stock purchased!");
                } else {
                    System.out.println("Insufficient balance!");
                }
            } 
            else if (choice == 3) {
                System.out.print("Enter stock index to sell: ");
                int index = sc.nextInt();

                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();

                if (qty <= stocksOwned[index]) {
                    double revenue = qty * stockPrices[index];
                    balance += revenue;
                    stocksOwned[index] -= qty;
                    System.out.println("Stock sold!");
                } else {
                    System.out.println("Not enough stock!");
                }
            } 
            else if (choice == 4) {
                System.out.println("\n--- Portfolio ---");
                double totalValue = balance;

                for (int i = 0; i < stockNames.length; i++) {
                    double value = stocksOwned[i] * stockPrices[i];
                    totalValue += value;

                    System.out.println(stockNames[i] + 
                        " | Owned: " + stocksOwned[i] + 
                        " | Value: " + value);
                }

                System.out.println("Balance: " + balance);
                System.out.println("Total Value: " + totalValue);
            }

        } while (choice != 5);

        System.out.println("Thank you for trading!");
    }
}