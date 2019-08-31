
package inheritance;


public class BedRoom extends Room {
    
    int height ;
    BedRoom(int x, int y, int z)
    {
    super(x , y)
            height = z;
    }
    int volume()
    {
    return (length * breadth * height);
    }    
}
