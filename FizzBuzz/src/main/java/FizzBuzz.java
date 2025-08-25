import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> getNumbers() {
        List<String> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {

            numbers.add(getNUmber(i));
        }
        return numbers;
    }

    private String getNUmber(int i) {
        
        
        
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        else if (i % 3 == 0) {
            return "Fizz";
        }
        else if (i %5 == 0) {
            return "Buzz";
        }
        return "" + i;
    }
}
