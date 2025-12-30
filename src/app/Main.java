package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Welcome to Console Bank App ===");

        while(running) {

            System.out.println("""
                        1. Open Account
                        2. Deposit
                        3. Withdraw
                        4. Transfer
                        5. Account Statement
                        6. List Accounts
                        7. Search Accounts by Customer Name
                        0. Exit
                    """);
            System.out.print("Choose: ");
            String choice = sc.nextLine().trim();
            System.out.println("Choice: "+choice);


            switch (choice){
//                case "1"-> openAcount(sc);
                case "0":
                    running = false;
                    break;



            }
        }



    }
}