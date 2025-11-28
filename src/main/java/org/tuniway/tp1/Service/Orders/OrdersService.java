package org.tuniway.tp1.Service.Orders;

import org.tuniway.tp1.Models.Orders;
import java.math.BigDecimal;
import java.util.List;

public interface OrderService {
    Orders addOrder(Orders order);
    Orders updateOrder(Orders order);
    void deleteOrder(Long id);
    Orders getOrderById(Long id);
    List<Orders> getAllOrders();
    List<Orders> findOrderByPrice(BigDecimal price);
    List<Orders> findOrderByRef(String ref);
}