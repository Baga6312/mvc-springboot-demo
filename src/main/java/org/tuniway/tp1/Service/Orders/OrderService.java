package org.tuniway.tp1.Service.Orders;

import org.tuniway.tp1.Models.Orders ;
import java.math.BigDecimal;
import java.util.List ;
import java.util.Optional;

public interface OrderService {
    Optional<Orders> findOrderById(Long id);
    List<Orders> fidnOrderByPrice(BigDecimal price);
    List<Orders> findOrderByRef(String ref);
    List<Orders> getAllOrders();
    Orders creatOrder(Orders ord);
    Orders updateOrders(Orders ord);
    void deleteOrders(Long id);
}
