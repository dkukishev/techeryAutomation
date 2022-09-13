import kotlin.system.exitProcess

// The Function for entering Int and check that it's really Int number. Show exception and if so, start function from the begining
fun enterNumber(): Int {
    print("'9' number is not working yet! Sorry! " +
            "Enter a number from 1 to 8: ")

    var numberInput = 0

    try {
         numberInput = readLine()!!.toInt()
    } catch (e: NumberFormatException) {
        println("Not a number! Please enter only Integer numbers!")
        enterNumber()
    }

    return numberInput
}

//The function make a mutable list from entered value and then calculating the next exprassion: (1+2)*(1+2+3)*...*(1+2+...+N), via memoize
fun sumOfTitle(number: Int): Int {
    val calc = (1..number).toList().toTypedArray()

    var prevMemo = calc[0]+calc[1];
    var endMemo = prevMemo;

    for (i in calc[1]..calc.size-1){
        prevMemo += calc[i]
        endMemo *= prevMemo
    }

    println("Calculation result is: $endMemo")
    return endMemo
}



fun main() {
    sumOfTitle(enterNumber())
}