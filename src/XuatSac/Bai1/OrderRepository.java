package XuatSac.Bai1;

import java.util.List;

public interface OrderRepository {
    void save(Order o);

    List<Order> findAll();
}
