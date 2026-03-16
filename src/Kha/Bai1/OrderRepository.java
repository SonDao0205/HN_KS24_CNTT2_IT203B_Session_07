package Kha.Bai1;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    public static List<Order> orders = new ArrayList<>();

    public static Order findById(String id){
        for(Order o : orders){
            if(o.id.equals(id)){
                return o;
            }
        }
        return null;
    }
}
