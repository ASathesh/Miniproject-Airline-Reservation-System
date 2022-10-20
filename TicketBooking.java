package AirlineTicketReservation;

import java.util.Scanner;

public class TicketBooking {

private void businessClass() {

Scanner s1 = new Scanner(System.in);

    System.out.println("First Class Seats No: 1,2,3,4,5 is available");
    System.out.println("Select your Seats?");
     int seat = s1.nextInt();
     if(seat == 1)
    System.out.println("Seat No 1 is Selected Click 0 to Confirm");
     else if(seat == 2)
         System.out.println("Seat No 2 is Selected Click 0 to Confirm ");
     else if(seat == 3)
         System.out.println("Seat No 3 is Selected Click 0 to Confirm ");
     else if(seat == 4)
         System.out.println("Seat No 4 is Selected Click 0 to Confirm ");
     else if(seat == 5)
         System.out.println("Seat No 5 is Selected Click 0 to Confirm ");
     else
    System.out.println("Select Correct seat number");
     int con = s1.nextInt();
     if(con==0)
    System.out.println("Your Seat Confirmed");
     else
    System.out.println("Seat Not Confirmed");
    
     
}
private void economyClass() {
Scanner s2 = new Scanner(System.in);

    System.out.println("Second Class Seats No: 6,7,8,9,10 is available");
    System.out.println("Select your Seats?");
    int seat = s2.nextInt();
    if(seat == 6)
    System.out.println("Seat No 6 is Selected Click 0 to Confirm ");
    else if(seat == 7)
        System.out.println("Seat No 7 is Selected Click 0 to Confirm ");
    else if(seat == 8)
        System.out.println("Seat No 8 is Selected Click 0 to Confirm ");
    else if(seat == 9)
        System.out.println("Seat No 9 is Selected Click 0 to Confirm ");
    else if(seat == 10)
        System.out.println("Seat No 10 is Selected Click 0 to Confirm ");
    else
    System.out.println("Select Correct seat number");
    int con = s2.nextInt();
    if(con==0)
    System.out.println("Your Seat Confirmed");
    else
    System.out.println("Seat Not Confirmed");
   
}

public static void main(String[] args) {
TicketBooking b = new TicketBooking();
Scanner s = new Scanner(System.in);

int choice = 0;
System.out.println("Welcome To KingFisher Airlines");
System.out.println("Please Select one option");
System.out.println("1.For Business Class");
System.out.println("2.Economy Class");

choice=s.nextInt();


switch (choice) {
case 1:
System.out.println("You Selected Business Class");
   b.businessClass();
break;

case 2:
System.out.println("You Selected Economy Class");
b.economyClass();
            break;
default:
   
break;
}
}
}

