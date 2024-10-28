
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lukasss
 */
public class RunProgram {
    public static void main(String[] args) {
        int choice = 0;
        OnlineTicketManagement app = new OnlineTicketManagement();
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("1. Create Ticket ");
            System.out.println("2. Show Ticket List ");
            System.out.println("3. Create Customer ");
            System.out.println("4. Show Customer List ");
            System.out.println("5. Sell Ticket ");
            System.out.println("6. Show Ticket List by film name ");
            System.out.println("7. Show Sold Ticket List ");
            System.out.println("8. Show Unsold Ticket List");
            System.out.println("9. Show List Of Customers Who Purchased At Least 3 Tickets ");
            System.out.println("10. Calculate revenue for the month ");
            System.out.println("11. Count the number of tickets sold in the month ");
            System.out.println("12. Find the movie with the highest ticket sales ");
            System.out.println("13. Revenue statistics for the year by number of theaters ");
            System.out.print("Enter our choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: 
                    app.CreateTicket();
                    break;
                case 2: 
                    app.ShowTicketList();
                    break;
                case 3: 
                    app.CreateCustomer();
                    break;
                case 4:
                    app.ShowCustomer();
                    break;
                case 5: 
                    app.SellTicket();
                    break;
                case 6: 
                    app.ShowTicketListByFilmName();
                    break;
                case 7: 
                    app.ShowSoldTicketList();
                    break;
                case 8: 
                    app.ShowUnsoldTicketList();
                    break;
                case 9:
                    app.ShowCustomerPurchasedAtLeast3Tickets();
                    break;
                case 10: 
                    app.RevenuebyMonth();
                    break;
                case 11: 
                    app.NumberofSoldticketByMonth();
                    break;
                case 12: 
                    break;
                case 13: 
                    app.RevenueByTheaters();
                    break;
            }
        } while(choice != 13);
    }
}
