package com.lanou.domain;

public class Order {
    private Integer id;

    private Integer userId;

    private String orderNumber;

    private Double orderPrice;

    public Order(Integer id, Integer userId, String orderNumber, Double orderPrice) {
        this.id = id;
        this.userId = userId;
        this.orderNumber = orderNumber;
        this.orderPrice = orderPrice;
    }

    public Order() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }
}