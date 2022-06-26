//includes:
// get methods
// constructor
// set methods


public class tenant implements Comparable<tenant>{
    private String name;
    private int room;
    public tenant(){
        /*this.name = "";
        this.room = 0;*/
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

    public int compareTo(tenant t){
        int compareInt = this.name.compareTo(t.name);
        if(compareInt < 0){
            return -1;
        }
        else{
            return 1;
        }
    }
    public boolean equals(Object obj){
        if(obj == this)
            return true;
        if(!(obj instanceof tenant))
            return false;
        final tenant other = (tenant) obj;
        return name.equals(other.getName());
    }

    public int hashCode(){
        return name.hashCode();
    }

    public String toString(){
        return(this.room + "   " +  this.name);
    }
}
