
package inheritance;


public class Room {
    int length;
    int breadth;
    
    Room(int x, int y)
    {
        length = x;
        breadth = y;
    }
    int area()
    {
        return (length * breadth );
    
    }
}
