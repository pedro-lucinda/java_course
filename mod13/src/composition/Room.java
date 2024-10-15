package composition;

public class Room {
    private String name;
    private int width;
    private int length;

    public Room(String name, int width, int length){
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public void showDetails() {
        System.out.println("Room Name: " + name + ", Width: " + width + ", Length: " + length);
    }

    public String getName(){
        return name;
    }

    public int getWidth(){
        return width;
    }

    public int getLength(){
        return length;
    }
}
