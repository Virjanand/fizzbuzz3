package fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public List<String> getNumbers(int i) {
        return IntStream.rangeClosed(1, 100).mapToObj(Integer::toString).collect(Collectors.toList());
    }
}
