import org.jetbrains.annotations.TestOnly
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


internal class FizzbuzzTest {
    private val fizz = Fizzbuzz()

    @Test
    fun `enter 1 get "1"`() {
        assertThat(fizz.calculate(1)).isEqualTo("1")
    }

    @Test
    fun `enter 2 get "2"`() {
        assertThat(fizz.calculate(2)).isEqualTo("2")
    }

    @Test
    fun `enter 3 get "fizz"`() {
        assertThat(fizz.calculate(3)).isEqualTo("fizz")
    }
    @Test
    fun `enter 4 get "4"`() {
        assertThat(fizz.calculate(4)).isEqualTo("4")
    }

    @Test
    fun `enter 5 get "buzz"`() {
        assertThat(fizz.calculate(5)).isEqualTo("buzz")
    }

    @Test
    fun `enter 6 get "fizz"`() {
        assertThat(fizz.calculate(6)).isEqualTo("fizz")
    }

    @Test
    fun `enter 7 get "7"`() {
        assertThat(fizz.calculate(7)).isEqualTo("7")
    }

    @Test
    fun `enter 9 get "fizz"`() {
        assertThat(fizz.calculate(9)).isEqualTo("fizz")
    }

    @Test
    fun `enter 10 get "buzz"`() {
        assertThat(fizz.calculate(10)).isEqualTo("buzz")
    }

    @Test
    fun `enter 11 get "11"`() {
        assertThat(fizz.calculate(11)).isEqualTo("11")
    }

    @Test
    fun `enter 15 get "fizzbuzz"`() {
        assertThat(fizz.calculate(15)).isEqualTo("fizzbuzz")
    }


}