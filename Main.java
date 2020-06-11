package com.phonestore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Chat Mediator
        IConsultationChat chatroom = new ConsultationChat();
        Client client1 = new ChatClient(chatroom,"1", "Aliya");
        Client consultant = new ChatClient(chatroom,"2", "Arman");

        chatroom.addUser(client1);
        chatroom.addUser(consultant);

        client1.send("Hello, can you help me with choice?", "2");
        consultant.send("Hello, yes. Please look at the list of our products", "1");
//
        System.out.println("\n");
        System.out.println("Welcome! Please write the name, model, color and capacity of the phone \n ");
        Scanner s = new Scanner(System.in);
        System.out.println("Company name:");
        String name = s.nextLine();
        System.out.println("Model:");
        String model = s.nextLine();
        System.out.println("Color:");
        String color = s.nextLine();
        System.out.println("Capacity:");
        int capacity = s.nextInt();

        PhoneOrder po1 = new PhoneOrder.PhoneBuilder("Aliya",  "87071209976").setOrderID(true).setCompanyname(name).setModel(model).setColor(color).setCapacity(capacity).build();
        System.out.println(po1.check());

        List<PhoneOrder> OList = new ArrayList<>();
        OList.add(po1);

       OrderList orderL = new OrderList();
        System.out.println(orderL.ordersList(OList));

    }

}




