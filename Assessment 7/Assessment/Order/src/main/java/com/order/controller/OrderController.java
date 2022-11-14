package com.order.controller;

import com.order.dto.OrderDTO;
import com.order.model.OrderModel;
import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Order")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/addOrder")
    public OrderModel addOrder(@RequestBody OrderDTO order){
        return service.addOrder(order);
    }

    @GetMapping("/viewOrder")
    public List<OrderModel> viewOrder(){
        return service.viewOrder();
    }

    @PutMapping("/update/{orderid}")
    public OrderModel updateOrder(@PathVariable("orderid") long orderid, @RequestBody OrderModel model){
        return service.updateOrder(orderid, model);
    }

    @DeleteMapping("/delete/{orderid}")
    public void deleteOrder(@PathVariable("orderid") long orderid){
        service.deleteOrder(orderid);
    }
}
