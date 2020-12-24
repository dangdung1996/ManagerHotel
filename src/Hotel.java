import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel {
    public static final String NO_ID_AVAILABLE = "No id available";
    private static Map<String, Integer> priceEachRoom = new HashMap<String, Integer>();

    static {
        priceEachRoom.put("Normal", 1000);
        priceEachRoom.put("Vip", 2000);
        priceEachRoom.put("VipPro", 5000);
    }
    List<Customer> customers;

    public Hotel(){
        this.customers= new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    public Customer getCustomerById(int id){
        for (Customer customer:customers){
            if (customer.getId()==id) return customer;
        }
        throw new UnsupportedOperationException(NO_ID_AVAILABLE);
    }

    public void removeCustomer(int id){
        this.customers.remove(getCustomerById(id));
    }

    public int getBill(int id){
        Customer customer = getCustomerById(id);
        int dayCount = customer.getDayCount();
        int price = priceEachRoom.get(customer.getKindOfRoom());
        return dayCount * price;
    }

    @Override
    public String toString() {
        return "Hotel{"
                + "customers = "
                + customers
                + "}"
                +"\n";
    }
}
