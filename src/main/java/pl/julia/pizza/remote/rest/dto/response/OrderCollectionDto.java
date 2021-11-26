package pl.julia.remote.rest.dto.response;

import pl.jakub.pizza.remote.rest.dto.response.OrderDto;

import java.util.List;

public class OrderCollectionDto {
    private List<OrderDto> orders;

    public OrderCollectionDto() {
    }

    public OrderCollectionDto(List<OrderDto> orders) {
        this.orders = orders;
    }

    public List<OrderDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDto> orders) {
        this.orders = orders;
    }
}
