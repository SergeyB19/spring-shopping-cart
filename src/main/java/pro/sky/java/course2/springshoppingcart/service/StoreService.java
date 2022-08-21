package pro.sky.java.course2.springshoppingcart.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.springshoppingcart.component.Basket;
import pro.sky.java.course2.springshoppingcart.model.Item;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoreService {
    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }

    public List<Item> add(List<Integer> ids) {
        return basket.add(ids.stream().map(Item::new).collect(Collectors.toList()));
    }

    public List<Item> get() {
        return basket.get();
    }
}
