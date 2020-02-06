class Fizzbuzz {

    fun calculate(input: Int): String = when {
        input % 3 == 0 && input % 5 == 0 -> "fizzbuzz"
        input % 3 == 0 -> "fizz"
        input % 5 == 0 -> "buzz"
        else -> input.toString()
    }
}

//  /      if (input % 3 == 0 && input % 5 == 0)
//            return "fizzbuzz"
//        else if (input % 3 == 0)
//            return "fizz"
//        else if (input % 5 == 0)
//            return "buzz"
//        else
//            return input.toString()

//        return if (input % 3 == 0 && input % 5 == 0)
//            "fizzbuzz"
//        else if (input % 3 == 0)
//            "fizz"
//        else if (input % 5 == 0)
//            "buzz"
//        else
//            input.toString()

//        return if (input % 3 == 0 && input % 5 == 0)
//
//        else if (input % 3 == 0)
//            "fizz"
//        else if (input % 5 == 0)
//            "buzz"
