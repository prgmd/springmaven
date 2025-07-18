package maventest.demo;

import org.springframework.stereotype.Service;

@Service
public class Calculatorlmpl implements Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
    
}
