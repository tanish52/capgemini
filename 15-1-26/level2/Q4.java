package level2;

public class Q4 {
  static class MovieTicker{

    String movieName;
    String seatNumber;

    int price = 200;

    void booking(String seatNumber){

      this.seatNumber = seatNumber;
      System.out.println(this.seatNumber + " Seatbooked");
    }

    void display(){
      System.out.println("Movie name " + movieName);
      System.out.println("Seat number is " + seatNumber);
      System.out.println("The price is " + price);
    }

  }

  public static void main(String[] args) {
    
    MovieTicker m1= new MovieTicker();

    m1.movieName = "Godzilla";
    m1.booking("l5");

    m1.display();
  }
}
