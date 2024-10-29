
class FiveStarHotel extends Hotel {

    public FiveStarHotel(String hotelId, String location, String roomType, int costPerRoom, int totalRoom, int availableRoom) {
        super(hotelId, location, "5-star", roomType, costPerRoom, totalRoom, availableRoom);
    }

    @Override
    public void bookRoom(int rooms) {
        double discounts = getdiscount();
        double finalCost = getCostPerRoom() * (1 - discounts);
        System.out.println("Booking " + rooms + " room(s) with a discount of " + (discounts * 100) + "%");
        System.out.println("Final cost per room: $" + finalCost);
        super.bookRoom(rooms);
    }

    private double getdiscount() {
        return switch (getRoomType().toLowerCase()) {
            case "deluxe" ->
                0.15;
            case "premium" ->
                0.20;
            default ->
                0.05;
        };
    }
}
