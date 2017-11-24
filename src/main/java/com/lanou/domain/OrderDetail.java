package com.lanou.domain;

public class OrderDetail {
    private Integer id;

    private Integer orderId;

    private Integer itemId;

    private Integer itemCount;

    private Double itemTotalPrice;

    public OrderDetail(Integer id, Integer orderId, Integer itemId, Integer itemCount, Double itemTotalPrice) {
        this.id = id;
        this.orderId = orderId;
        this.itemId = itemId;
        this.itemCount = itemCount;
        this.itemTotalPrice = itemTotalPrice;
    }

    public OrderDetail() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public Double getItemTotalPrice() {
        return itemTotalPrice;
    }

    public void setItemTotalPrice(Double itemTotalPrice) {
        this.itemTotalPrice = itemTotalPrice;
    }
}