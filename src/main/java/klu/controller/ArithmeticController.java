package klu.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ArithmeticController {

    @GetMapping("/add/{A}/{B}")
    public Map<String, Object> add(@PathVariable("A") int a, @PathVariable("B") int b) {
        Map<String, Object> response = new HashMap<>();
        response.put("operation", "addition");
        response.put("A", a);
        response.put("B", b);
        response.put("result", a + b);
        return response;
    }

    @GetMapping("/sub/{A}/{B}")
    public Map<String, Object> sub(@PathVariable("A") int a, @PathVariable("B") int b) {
        Map<String, Object> response = new HashMap<>();
        response.put("operation", "subtraction");
        response.put("A", a);
        response.put("B", b);
        response.put("result", a - b);
        return response;
    }

    @GetMapping("/prod/{A}/{B}")
    public Map<String, Object> prod(@PathVariable("A") int a, @PathVariable("B") int b) {
        Map<String, Object> response = new HashMap<>();
        response.put("operation", "product");
        response.put("A", a);
        response.put("B", b);
        response.put("result", a * b);
        return response;
    }

    @GetMapping("/div/{A}/{B}")
    public Map<String, Object> div(@PathVariable("A") int a, @PathVariable("B") int b) {
        Map<String, Object> response = new HashMap<>();
        response.put("operation", "division");
        response.put("A", a);
        response.put("B", b);
        if (b == 0) {
            response.put("error", "Division by zero is not allowed!");
        } else {
            response.put("result", a / b);
        }
        return response;
    }
}
