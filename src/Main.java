import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Hotel hotel = new Hotel();
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("input member: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i =0; i<num;i++){
            addCustomer();
        }
        displayAllCustomer();
        checkout();
    }

    private static void addCustomer(){
        System.out.print("Name :");
        String name = sc.nextLine();
        System.out.print("Birthday :");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Id: ");
        int id = sc.nextInt();
        System.out.print("How many day? ");
        int dayCount = sc.nextInt();
        sc.nextLine();
        System.out.print("Kind of room: ");
        String kindOfRoom = sc.nextLine();
        String[] rooms = new String[3];
        rooms[0] = "small";
        rooms[1] = "normal";
        rooms[2] = "luxury";
        if (Arrays.binarySearch(rooms, kindOfRoom) == -1){
            System.out.println("Kind of room is not valid.");
        }
        hotel.addCustomer(new Customer(name, new int[]
                {day, month, year},
                id, dayCount, kindOfRoom));
    }

    private static void displayAllCustomer(){
        System.out.println(hotel);
    }
    private static void checkout(){
        System.out.println("Type card number of customer want to checkout:");
        try{
            int id = sc.nextInt();
            System.out.println(hotel.getBill(id));
            hotel.removeCustomer(id);
            System.out.println("Customer remoed!");
        } catch (Exception e){
            System.out.println(e);
        }
        displayAllCustomer();
    }

}
