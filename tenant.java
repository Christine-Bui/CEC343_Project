//includes:
// get methods
// constructor
// set methods


public class tenant {
    private String name;
    private int room;
    public tenant(){
        this.name = "";
        this.room = 000;
    }

    public tenant(String name, int room){
        this.name = name;
        this.room = room;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getRoomNum(){
        return room;
    }

    public void setRoomNum(int room){
        this.room = room;
    }
}
