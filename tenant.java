//includes:
// get methods
// constructor
// set methods


public class tenant {
    String name;
    int room;
    public tenant(){
        this.name = "";
        this.room = 0;
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

    public String toString(){
        return(this.room + " " +  this.name);
    }
}
