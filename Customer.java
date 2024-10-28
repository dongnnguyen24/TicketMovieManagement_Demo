
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lukasss
 */
public class Customer {
    private long Customer_ID;
    private String Customer_Name;
    private String Customer_Address;
    private ArrayList<Ticket> TicketBuyList;
    
    //Contructor
    public Customer() {
        this.Customer_ID = 1;
        this.Customer_Name = "abc";
        this.Customer_Address = "Thu Duc";
        this.TicketBuyList = new ArrayList();
    }

    public Customer(long Customer_ID, String Customer_Name, String Customer_Address, ArrayList<Ticket> TicketBuyList) {
        this.Customer_ID = Customer_ID;
        this.Customer_Name = Customer_Name;
        this.Customer_Address = Customer_Address;
        this.TicketBuyList = TicketBuyList;
    }
    
    //Getter 
    public long getCustomer_ID() {
        return Customer_ID;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public String getCustomer_Address() {
        return Customer_Address;
    }

    public ArrayList<Ticket> getTicketBuyList() {
        return TicketBuyList;
    }
    //Setter 

    public void setCustomer_ID(long Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    public void setCustomer_Name(String Customer_Name) {
        this.Customer_Name = Customer_Name;
    }

    public void setCustomer_Address(String Customer_Address) {
        this.Customer_Address = Customer_Address;
    }

    public void setTicketBuyList(ArrayList<Ticket> TicketBuyList) {
        this.TicketBuyList = TicketBuyList;
    }
    //Methods 
    public boolean AddTicket(Ticket T) {
        T.setStatus(1);
        return TicketBuyList.add(T);
    }
    
    public void showCustomer() { 
        System.out.println("---- Customer Information ----");
        System.out.println("Customer ID: " +Customer_ID);
        System.out.println("Customer name: "+Customer_Name);
        System.out.println("Customer address: "+Customer_Address);
        System.out.println("------------------------------");
        for(int i = 0; i < TicketBuyList.size (); i++) {
            Ticket T = TicketBuyList.get(i);
            System.out.println("----- Ticket Buy List Information -----");
            System.out.println(T.toString());
        }
    }
}
