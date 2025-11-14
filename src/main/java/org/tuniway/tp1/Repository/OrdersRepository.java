package org.tuniway.tp1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.tuniway.tp1.Models.Orders;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {

    @Query("SELECT o FROM ORDER o WHERE o.price = :price")
    List<Orders> findOrderByPrice(@Param("price") BigDecimal price);

    @Query("SELECT o from ORDER o WHERE o.ref =:ref")
    List<Orders> findOrderByRef(@Param("ref") String ref);

    List<Orders> getAllOrders();
    Orders creatOrder(Orders ord);
    Orders updateOrder(Orders ord);
    void deleteOrder(Long id);

}
