package com.order.service;

import com.order.dto.OrderDTO;
import com.order.model.OrderModel;
import com.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderModel addOrder(OrderDTO orderDTO){
        OrderModel order = new OrderModel();

        order.setItem(orderDTO.getItem());
        order.setQntity(orderDTO.getQntity());
        order.setName(orderDTO.getName());
        order.setTotalamount(orderDTO.getTotalamount());

        return orderRepository.save(order);
    }

    public List<OrderModel> viewOrder(){
        return orderRepository.findAll();
    }

    public OrderModel updateOrder(long orderid, OrderModel order){
        return orderRepository.save(order);
    }

    public void deleteOrder(long orderid){
        orderRepository.deleteById(orderid);
    }
}
