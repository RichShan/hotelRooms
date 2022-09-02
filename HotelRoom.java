import java.lang.reflect.Array;
import java.util.ArrayList;

public class HotelRoom{

    final int REGULARCAP = 2;
    int roomNum;


    ArrayList<Person> guests = new ArrayList<Person>();

     HotelRoom(int numba) {
         
        roomNum = numba;
 
     }
     
     public void checkIn(Person guest) {
        guests.add(guest);
        System.out.println(guest.name + " successfully added to room " + roomNum);
        
     }

     public void checkOut(Person guest) {
        guests.remove(guest);
        System.out.println(guest.name + " successfully removed from room " + roomNum);
        
     }

     public void listGuests() {
        for (int i = 0; i < guests.size(); i++) {
            System.out.println("guest " + (i+1) + " is " + guests.get(i).name);
        }
     }

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