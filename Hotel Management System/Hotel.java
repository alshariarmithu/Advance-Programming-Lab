
class Hotel {

    private String hotelId;
    private String location;
    private String hotelType;
    private String roomType;
    private int costPerRoom;
    private int totalRoom;
    private int availableRoom;

    public Hotel(String hotelId, String location, String hotelType, String roomType, int costPerRoom, int totalRoom, int availableRoom) {
        this.hotelId = hotelId;
        this.location = location;
        this.availableRoom = availableRoom;
        this.hotelType = hotelType;
        this.costPerRoom = costPerRoom;
        this.roomType = roomType;
        this.totalRoom = totalRoom;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHotelType() {
        return hotelType;
    }

    public void sethotelType(String hotelType) {
        this.hotelType = hotelType;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getCostPerRoom() {
        return costPerRoom;
    }

    public void setCostPerRoom(int costPerRoom) {
        this.costPerRoom = costPerRoom;
    }

    public int getTotalRoom() {
        return totalRoom;
    }

    public void setTotalRoom(int totalRoom) {
        this.totalRoom = totalRoom;
    }

    public int getAvailableRoom() {
        return availableRoom;
    }

    public void setAvailableRoom(int availableRoom) {
        this.availableRoom = availableRoom;
    }

    public void cancelBooking(int rooms) {
        availableRoom += rooms;
        System.out.println(rooms + " room(s) booking cancelled.");
    }

    public void display() {
        System.out.println("Hotel ID: " + hotelId);
        System.out.println("Location: " + location);
        System.out.println("Hotel Type: " + hotelType);
        System.out.println("Room Type: " + roomType);
        System.out.println("Cost Per Room: " + costPerRoom);
        System.out.println("Available Rooms: " + availableRoom);
        System.out.println("Total Rooms: " + totalRoom);
    }

    public void bookRoom(int rooms) {
        if (availableRoom >= rooms) {
            availableRoom -= rooms;
            System.out.println(rooms + "room(s) booked sucessfully");
        } else {
            System.out.println("Sorry, only " + availableRoom + " rooms(s) are available");
        }
    }

    public void cancelRoom(int rooms) {
        availableRoom += rooms;
        System.out.println(rooms + " room(s) booking cancelled");
    }
}

