package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void get100Numbers() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.getNumbers(1, 100)).hasSize(100);
    }
}
