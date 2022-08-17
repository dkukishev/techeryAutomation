import swapMethods.mySwapStep1
import swapMethods.mySwapStep2

var array = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)

object swapMethods {
    fun mySwapStep2() {
        for (index in 0..array.size - 2 step 2) {
            array[index] = array[index + 1].also { array[index + 1] = array[index] }
        }
        println(array)
    }

    fun mySwapStep1() {
        for (index in 0..array.size - 2 step 1) {
            array[index] = array[index + 1].also { array[index + 1] = array[index] }
        }
        println(array)
    }
}

// can be usefull val calc = IntArray(number, {i -> i * 3 + 2})

fun main(){
    println("Here is array of 11 elements: " + array.joinToString ( separator = ", "))
    mySwapStep2()
    mySwapStep1()
}