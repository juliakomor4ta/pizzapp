package pl.jakub.remote.rest.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import pl.jakub.pizza.domain.model.OrderStatusType;
import pl.jakub.pizza.remote.rest.dto.request.PersonOrderDto;
import pl.jakub.pizza.remote.rest.dto.request.PizzaOrderDto;

import java.util.List;

public class UpdateOrderDto {

    private OrderStatusType status;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto person;

    /*     private PersonOrderDto person; można też zapisać jako:
              @JsonProperty ("person")
              private PersonOrderDto personOrderDto;
           to jest to samo */

    public UpdateOrderDto() {
    }

    public UpdateOrderDto(OrderStatusType status, List<PizzaOrderDto> pizzas, PersonOrderDto person) {
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}


