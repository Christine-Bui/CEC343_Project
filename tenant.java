public class tenant {
    String name;
    int room;
    public tenant(){

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
