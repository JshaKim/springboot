package com.ohgiraffers.chapter02handler;

/*
* DTO 객체를 작성할 때 커맨드 객체로 이용하기 위해 Form의 name과 필드가 일치되도록 작성할 것.
*
* */

public class MenuDTO {

    private String name;
    private int price;
    private int category;
    private String orderableStatus;

    //기본 생성자를 이용하여 인스턴스 생성
    public MenuDTO() {
    }

    public MenuDTO(String name, int price, int category, String orderableStatus) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.orderableStatus = orderableStatus;
    }

    public String getName() {
        return name;
    }
    // 요청 파라미터의 name과 일치하는 필드의 setter를 이용하여 값 초기화
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }
}
