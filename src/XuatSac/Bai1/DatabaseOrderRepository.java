package XuatSac.Bai1;

import java.util.ArrayList;
import java.util.List;

public class DatabaseOrderRepository implements OrderRepository {
    private List<Order> db = new ArrayList<>();
    public void save(Order o) { db.add(o); System.out.println("Đã lưu đơn hàng " + o.id + " vào Database."); }
    public List<Order> findAll() { return db; }
}
