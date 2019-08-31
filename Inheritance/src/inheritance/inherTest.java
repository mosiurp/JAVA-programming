
package inheritance;


public class inherTest {

    public static void main(String[] args) {
        BedRoom room1 = new BedRoom(14,12,10);
        int area1 = room1.area();
        System.out.println("area1 = " + area1);
        int volume1 = room1.volume();
        System.out.println("volume1 = " + volume1);
    }
    
}
