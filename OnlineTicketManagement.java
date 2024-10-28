
import static java.lang.Integer.max;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
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
public class OnlineTicketManagement {
    private ArrayList<Ticket> TicketList;
    private ArrayList<Customer> CustomerList;
    
    public OnlineTicketManagement() {
        this.TicketList = new ArrayList();
        this.CustomerList = new ArrayList();
    }
    
    public OnlineTicketManagement(ArrayList<Ticket> TicketList, ArrayList<Customer> CustomerList) {
        this.TicketList = TicketList;
        this.CustomerList = CustomerList;
    }
    
    public ArrayList<Ticket> getTicketList() {
        return TicketList;
    }

    public ArrayList<Customer> getCustomerList() {
        return CustomerList;
    }
    

    public void setTicketList(ArrayList<Ticket> TicketList) {
        this.TicketList = TicketList;
    }

    public void setCustomerList(ArrayList<Customer> CustomerList) {
        this.CustomerList = CustomerList;
    }
    
    public void CreateTicket() {
        Ticket T = new Ticket();
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Enter ticket ID: ");
                T.setId(sc.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("Ticket ID is not valid, please try again !!!");
                sc.nextLine();
            }
        }
        sc = new Scanner(System.in);
        System.out.print("Enter film name: ");
        T.setFilm_name(sc.nextLine());
        while(true) {
            try {
                System.out.print("Enter duration:");
                T.setDuration(sc.nextInt());
                break;
            } catch(Exception e) {
                System.out.println("Duration is not valid, please try again !!!");
                sc.nextLine();
            }
        }
        while(true) {
            try {
                sc = new Scanner(System.in);
                System.out.print("Enter show time: ");
                T.setShowtime(new Date(sc.nextLine()));
                break;
            } catch (Exception e) {
                System.out.print("Show time is not valid, please press Enter and try again !!!");
                sc.nextLine();
            }
        }
        while(true) {
            try {
                System.out.print("Enter price: ");
                T.setPrice(sc.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("Price is not valid, please try again !!!");
                sc.nextLine();
            }
        }
        while(true) {
            try {
                System.out.print("Enter number of seats: ");
                T.setNumber_of_seats(sc.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("Number of seats is not valid, please try again !!!");
                sc.nextLine();
            }
        }
        while(true) {
            try {
                System.out.print("Enter number of cinemas: ");
                T.setNumber_of_cinemas(sc.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("Number of cinemas is not valid, please try again !!!");
                sc.nextLine();
            }
        }
        T.setStatus(0);
        TicketList.add(T);
        System.out.println("Ticket created successfully.");
    }
    
    public void ShowTicketList() {
        for (Ticket ticket : TicketList) {
            System.out.println(ticket.toString());
        }
    }
    
    public void ShowSoldTicketList() {
        for (Ticket ticket : TicketList) {
            if(ticket.getStatus() == 1) {
                System.out.println(ticket.toString());
            }
        }
    }
    
    public void ShowUnsoldTicketList() {
        for (Ticket ticket : TicketList) {
            if(ticket.getStatus() == 0) {
                System.out.println(ticket.toString());
            }
        }    
    }
    
    public Ticket FindTicket(String film_name, String showtime, int number_of_seats ) {
        for (Ticket ticket : TicketList) {
            Date showtimefilm = new Date(showtime);
            if(ticket.getFilm_name().equalsIgnoreCase(film_name) && ticket.getShowtime().compareTo(showtimefilm) == 0 && ticket.getNumber_of_seats() == number_of_seats && ticket.getStatus() == 0) {
                return ticket;
            }
        }
        return null;
    }
    
    public void CreateCustomer() {
        Customer Ctm = new Customer();
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            try {
                System.out.print("Enter customer id (Required Information): ");
                long id = sc.nextLong();
                if(id > 0) {
                    Ctm.setCustomer_ID(id);
                }
                
                else {
                    throw new Exception();
                }
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("ID is not valid, please type again !!!");
                sc.nextLine();
            }
        }
        
        while(true) {
            try {
                System.out.print("Enter customer name (Required Information): ");
                String name = sc.nextLine();
                if(!name.isEmpty()) {
                    Ctm.setCustomer_Name(name);
                }
                else {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Name can not be blank, please press Enter to type again !!!");
            }
        }
        
        while(true) {
            try { 
                sc = new Scanner(System.in);
                System.out.print("Enter customer address (Required Information): ");
                String address = sc.nextLine();                                        
                    if(!address.isEmpty()) {
                        Ctm.setCustomer_Address(address);
                    }
                    else {
                        throw new Exception();
                    }
                    CustomerList.add(Ctm);
                    break;
            } catch (Exception e) {
                System.out.println("Address can not be blank, please press Enter to type again !!!");
                sc.nextLine();
            } 
        }
    }
    
    public void ShowCustomer() {
        for (Customer customer : CustomerList) {
            customer.showCustomer();
        }
    }
    
    public Customer FindCustomer(long Customer_ID) {
        for (Customer customer : CustomerList ) {
            if(customer.getCustomer_ID()== Customer_ID) {
                return customer;
            }
        }
        return null;
    }
    
    public void SellTicket() {
        ShowUnsoldTicketList();
        Scanner sc = new Scanner(System.in);
        String filmname = "";
        while (true) {
            try {
                System.out.print("Enter flim name: ");
                filmname = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Film name is not valid, please try again !!!");
                sc.nextLine();
            }
        }
        String showtime = "";
        while (true) {
            try {
                System.out.print("Enter showtime: ");
                sc = new Scanner(System.in);
                showtime = sc.nextLine();
                if(!showtime.matches("^(0?[1-9]|1[0-2])/(0?[1-9]|[12][0-9]|3[01])/\\d{4}$")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Show time is not valid, please try again !!!");
                sc.nextLine();
            }
        }
        int seats = 1;
        while (true) {
            try {
                System.out.print("Enter number of seats: ");
                seats = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Number of seats is not vaid, please try again !!!");
                sc.nextLine();
            }
        }
        Ticket T = FindTicket(filmname, showtime, seats);
        if(T != null) {
            ShowCustomer();
            long customer_id = 1;
            while(true) {
                try {
                    System.out.print("Enter customer id: ");
                    customer_id = sc.nextLong();
                    break;
                } catch (Exception e) {
                    System.out.println("Customer ID is not valid, please try again !!!");
                    sc.nextLine();
                }
            }
            Customer Ctm = FindCustomer(customer_id);
            if(Ctm != null) {
                if(Ctm.AddTicket(T)) {
                    System.out.println("---------- Thank you ----------");
                    Ctm.showCustomer();
                    System.out.println("Have a great time !!!");
                }
            }
            T.setStatus(1);
        }
        else System.out.println("Ticket can not found");
    }
    
    public void ShowTicketListByFilmName() { 
        Scanner sc = new Scanner(System.in);
        String filmname = "";
        System.out.print("Enter film name: ");
        filmname = sc.nextLine();
        for (Ticket ticket : TicketList) {
            if(ticket.getFilm_name().equalsIgnoreCase(filmname)) {
                System.out.println(ticket.toString());
            }
        }
    }
    
    public void ShowCustomerPurchasedAtLeast3Tickets() {
        for (Customer customer : CustomerList) {
            if(customer.getTicketBuyList() != null && customer.getTicketBuyList().size() >= 3) {
                customer.showCustomer();
            }
        }
    }
    
    public void RevenuebyMonth() {
        Scanner sc = new Scanner(System.in);
        double totalRevenue = 0;
        int month = 0; 
        int year;
        int count = 0;
       while(true) {
           try {
               System.out.println("Enter month: ");
               month = sc.nextInt();
               if(month <= 0) {
                   throw new Exception();
               }
               break;
           } catch (Exception e) {
               System.out.println("Month is not valid, please try again !!!");
           }
       }
       while (true) {
           try { 
               System.out.println("Enter year: ");
               year = sc.nextInt();
               break;
           } catch (Exception e) {
               System.out.println("Year is not valid, please try again !!!");
           }
       }
        for (Ticket ticket : TicketList) {
            Date showtime = ticket.getShowtime();
            if (ticket.getStatus() == 1 && showtime.getMonth() == month - 1 && showtime.getYear() + 1900 == year) {
                totalRevenue += ticket.getPrice();
            }
        }
        System.out.println("Revenue: "+totalRevenue);
    }
    
    public void NumberofSoldticketByMonth() {
        Scanner sc = new Scanner(System.in);
        int month = 0; 
        int year = 0;
        int count = 0;
               while(true) {
           try {
               System.out.println("Enter month: ");
               month = sc.nextInt();
               if(month <= 0) {
                   throw new Exception();
               }
               break;
           } catch (Exception e) {
               System.out.println("Month is not valid, please try again !!!");
           }
       }
       while (true) {
           try { 
               System.out.println("Enter year: ");
               year = sc.nextInt();
               break;
           } catch (Exception e) {
               System.out.println("Year is not valid, please try again !!!");
           }
       }
        for (Ticket ticket : TicketList) {
            Date showtime = ticket.getShowtime();
            if (ticket.getStatus() == 1 && showtime.getMonth() == month - 1 && showtime.getYear() + 1900 == year) {
                count++;
            }
        }

        System.out.println("Number of Sold Ticket: "+count);
    }
    
    public void FindMovieBestSeller() {
        System.out.println("List of sold ticket");
        ShowSoldTicketList();
        System.out.println("The Movice Best Seller");
       
    }
    
    public void RevenueByTheaters() {
        Scanner sc = new Scanner(System.in);
        int number_theaters = 0;
        while(true) {
            try { 
                System.out.println("Enter number of theaters: ");
                number_theaters = sc.nextInt();
                if(number_theaters < 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Number of theater is not valid, please try again !!!");
            }
        }
        int total_price = 0;
        for (Ticket ticket : TicketList) {
            if(ticket.getNumber_of_cinemas() == number_theaters) {
                total_price += ticket.getPrice();
            }
        }
        System.out.println("Revenue is: "+total_price);
    }
        
}
