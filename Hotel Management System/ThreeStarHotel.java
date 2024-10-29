
class ThreeStarHotel extends Hotel {

    public ThreeStarHotel(String hotelId, String location,String roomType, int costPerRoom, int totalRoom, int availableRoom) {
        super(hotelId, location, "3-star", roomType, costPerRoom, totalRoom, availableRoom);
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Note: 3-star hotels offer no discounts.");
    }
}
