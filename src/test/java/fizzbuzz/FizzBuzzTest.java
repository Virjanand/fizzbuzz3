package fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void createFizzBuzz() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void get100Numbers() {
        assertThat(fizzBuzz.getNumbers(1, 100)).hasSize(100);
    }

    @Test
    void replace3withFizz() {
        assertThat(fizzBuzz.getNumbers(1, 3).get(2)).isEqualTo("Fizz");
    }
}
