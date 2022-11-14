package com.order.model;

import com.order.dto.OrderDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderid;
    private String name;
    private String item;
    private String qntity;
    private String totalamount;
}
