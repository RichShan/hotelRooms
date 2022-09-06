

class run{

    public static void main(String[] args) {
        Person p1 = new Person(5.2, 30, "urmom", "brown");
        Person p2 = new Person(1, 1, "abc", "nobodyAsked");
        Person p3 = new Person(1, 1, "lol", "qwewetadf");

        HotelRoom r1 = new HotelRoom(1);
        HotelRoom r2 = new HotelRoom(2);
        r1.checkIn(p1);
        r1.checkIn(p2);
        r1.checkIn(p3);
        r1.listGuests();
        r1.printCapacity();
        System.out.println(r1.checkCapacity());
    




        
        
        
    }


}

