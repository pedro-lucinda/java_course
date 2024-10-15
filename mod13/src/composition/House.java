package composition;

public class House {
    private Room bedroom;
    private Room kitchen;
    private Room livingRoom;


    public House(){
        this.bedroom = new Room( "Bedroom", 10, 10);
        this.kitchen = new Room( "Kitchen", 10, 10);
        this.livingRoom = new Room( "Living Room", 10, 10);
    }

    public void showDetails() {
        bedroom.showDetails();
        kitchen.showDetails();
        livingRoom.showDetails();
    }

    public Room getBedroom(){
        return bedroom;
    }

    public Room getKitchen(){
        return kitchen;
    }

    public Room getLivingRoom(){
        return livingRoom;
    }
}
