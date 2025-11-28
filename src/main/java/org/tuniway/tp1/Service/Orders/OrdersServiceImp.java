package org.tuniway.tp1.Service.Orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tuniway.tp1.Models.Orders;
import org.tuniway.tp1.Repository.OrdersRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImp implements OrderService  {
    @Autowired
    private OrdersRepository orderRepository ;

    @Override
    public Optional<Orders> findOrderById(Long id){return orderRepository.findById(id);}
    @Override
    public List<Orders> fidnOrderByPrice(BigDecimal price) {return orderRepository.find(price);}

    @Override
    public List<Orders> findOrderByRef(String ref) {return orderRepository.find(ref);}

    @Override
    public List<Orders> getAllOrders() {return orderRepository.findAll();}

    @Override
    public Orders creatOrder(Orders ord) {return orderRepository.save(ord);}

    @Override
    public Orders updateOrders(Orders ord) {return orderRepository.saveAndFlush(ord);}

    @Override
    public void deleteOrders(Long id) {orderRepository.deleteById(id);}
}
