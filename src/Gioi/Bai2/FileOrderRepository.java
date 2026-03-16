package Gioi.Bai2;

import Kha.Bai1.Order;

class FileOrderRepository implements OrderRepository {
    @Override
    public void save(Order order) {
        System.out.println("Lưu đơn hàng vào file: " + order.id);
    }
}
