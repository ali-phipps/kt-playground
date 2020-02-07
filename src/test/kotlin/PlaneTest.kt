import Airport.Airport
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import com.nhaarman.mockitokotlin2.mock

internal class PlaneTest {
    private val plane = Plane()
//    private val anAirport : Airport = mock()

    @Test
    fun `When plane is created it is flying`() {
         assertThat(plane.isFlying()).isEqualTo(true)
    }

    @Test
    fun `land plane at an airport, check plane isn't flying`() {
        plane.land(anAirport)
        assertThat(plane.isFlying()).isEqualTo(false)
    }

    @Test
    fun `land plane at an airport`() {
        plane.land(anAirport)
        assertThat(plane.isAt()).isEqualTo(anAirport)
    }
    companion object {
       private val anAirport = Airport()
    }
}