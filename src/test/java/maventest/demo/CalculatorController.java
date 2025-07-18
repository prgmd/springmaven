package maventest.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CalculatorController {
    @Autowired
    Calculator calculator;

    @RequestMapping("/sum")
    public String add(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(calculator.sum(a, b));
    }
}
