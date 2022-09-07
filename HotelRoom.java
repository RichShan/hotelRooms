import java.lang.reflect.Array;
import java.util.ArrayList;

public class HotelRoom{

    // initializing variables
    final int REGULARCAP = 2;
    int roomNum;


    ArrayList<Person> guests = new ArrayList<Person>();

    

     HotelRoom(int numba) {
         
        roomNum = numba;
 
     }
     // internal function because mr durret insists on using a method to find capacity
     public int getCapacity() {
        return guests.size();
     }
     
    // checking guets in method, getCapacity's one use is here
     public void checkIn(Person guest) {
        if (getCapacity() < REGULARCAP) {
            guests.add(guest);
            System.out.println(guest.name + " successfully added to room " + roomNum);
        }
        else {
            System.out.println("room " + roomNum + " is full. " + guest.name + " was not added. Max capacity is " + REGULARCAP);
        }
     }

     
     //removing guests function, arraylists are so nice
     public void checkOut(Person guest) {
        guests.remove(guest);
        System.out.println(guest.name + " successfully removed from room " + roomNum);
        
     }
     // this function was purely used for debugging and testing
     public void listGuests() {
        for (int i = 0; i < guests.size(); i++) {
            System.out.println("guest " + (i+1) + " is " + guests.get(i).name);
        }
     }



     // the reason there is an if else instead of a single statement is because I wanted the "s" if there were two space"s" otherwise the 2 - guests.size woulda worked
     public void checkCapacity() {
        if (guests.size() < 2) {

            if ((2 - guests.size()) == 1) 
                System.out.println("room has 1 space");
            else {
                System.out.println("room has 2 spaces");
            }

        }
        else {
            System.out.println("Room is full with 2 people");
        }
     }

     //lists full guest info, tabs look nice
     public void printGuestInfo() {
        for (int i = 0; i < guests.size(); i++) {
            System.out.println(guests.get(i).name + " info:");
            System.out.println("\t age: " + guests.get(i).age);
            System.out.println("\t hair color: " + guests.get(i).hairColor);
            System.out.println("\t height: " + guests.get(i).height);
            System.out.println("\t name: " + guests.get(i).name);
            
        }
     }
 
 
 
 }