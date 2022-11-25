package hotelsimul;

public class Main {
    public static void main(String[] args) {

        Hotel h1 = new Hotel("ThisF", 5);
        Customer c1 = new Customer("Yoshi", h1);


        c1.checkIn(h1);

    }
}

