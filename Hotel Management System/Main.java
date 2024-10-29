
public class Main {

    public static void main(String[] args) {
        Hotel threeStar = new ThreeStarHotel("H001", "New York", "Normal", 100, 50, 30);
        Hotel fourStar = new FourStarHotel("H002", "Paris", "Deluxe", 200, 40, 25);
        Hotel fiveStar = new FiveStarHotel("H003", "Dubai", "Premium", 300, 30, 20);

        System.out.println("\n--- 3-Star Hotel ---");
        threeStar.display();
        threeStar.bookRoom(3);
        threeStar.cancelBooking(1);

        System.out.println("\n--- 4-Star Hotel ---");
        fourStar.display();
        fourStar.bookRoom(2);

        System.out.println("\n--- 5-Star Hotel ---");
        fiveStar.display();
        fiveStar.bookRoom(2);
    }
}
