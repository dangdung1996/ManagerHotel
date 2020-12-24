import java.util.Arrays;
import java.util.Map;

public class Customer extends Person {
    private int dayCount;
    private String kindOfRoom;

    public Customer(String name, int[] birthday, int id, int dayCount, String kindOfRoom) {
        super(name, birthday, id);
        this.dayCount = dayCount;
        this.kindOfRoom = kindOfRoom;
    }
    public int getDayCount(){
        return this.dayCount;
    }
    public String getKindOfRoom(){
        return this.kindOfRoom;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "dayCount=" + dayCount +
                ", kindOfRoom='" + kindOfRoom + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + Arrays.toString(birthday) +
                ", cardNumber='" + id + '\'' +
                '}';
    }
}
