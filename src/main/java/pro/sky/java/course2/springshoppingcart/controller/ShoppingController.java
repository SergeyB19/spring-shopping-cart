package pro.sky.java.course2.springshoppingcart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.springshoppingcart.service.ShoppingServiceImpl;

@RestController
public class ShoppingController {
    private final ShoppingServiceImpl shoppingService;

    public ShoppingController(ShoppingServiceImpl shoppingService) {
        this.shoppingService = shoppingService;
    }

    @GetMapping("/store/order/add")
    public int add(int id) {

    }


    @GetMapping("/store/order/get")
    public String get() {

    }
}
