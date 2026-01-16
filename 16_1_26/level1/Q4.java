import java.util.*;
class HotelBooking{
    String guestName;
    String roomType;
    int nights;

    HotelBooking(){
        this.guestName = "abc";
        this.roomType = "2bed";
        this.nights = 2;
    }

    HotelBooking(String g, String r, int n){
        this.guestName = g;
        this.roomType = r;
        this.nights = n;
    }

    HotelBooking(HotelBooking h1){
        this.guestName = h1.guestName;
        this.roomType = h1.roomType;
        this.nights = h1.nights;
    }
}

public class Q4 {
    public static void main(String[] args) {
        HotelBooking a = new HotelBooking();
        HotelBooking b = new HotelBooking("bcd","single",4);
        HotelBooking c = new HotelBooking(a);

        System.out.println(a.guestName);
        System.out.println(a.roomType);
        System.out.println(a.nights);

        System.out.println(b.guestName);
        System.out.println(b.roomType);
        System.out.println(b.nights);

        System.out.println(c.guestName);
        System.out.println(c.roomType);
        System.out.println(c.nights);

        
    }
}