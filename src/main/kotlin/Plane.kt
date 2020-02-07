import Airport.Airport

class Plane( var flying: Boolean = true, var currentAirport: Airport? = null) {

    fun isFlying(): Boolean {
        return flying
    }

    fun land(anAirport: Airport) {
        currentAirport = anAirport
        flying = false
    }

    fun isAt(): Airport? {
        return currentAirport
    }

}