import SwapMethods.mySwapStep1
import SwapMethods.mySwapStep2

var array = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)

object SwapMethods {
    fun mySwapStep2() {
        for (index in 0..array.size - 2 step 2) {

            val tmp = array[index]
            array[index] = array[index + 1]
            array[index + 1] = tmp
        }
        println(array)
    }

    fun mySwapStep1() {

        var i = 1

        while (i < array.size) {

            var firstNumb = array.indexOf(i)*2
            var secondNumb = array.indexOf(i)*2+1

            val tmp = firstNumb
            firstNumb = secondNumb
            secondNumb = tmp

            i++
        }
        println(array)
    }
}


fun main(){
    println("Here is array of 11 elements: " + array.joinToString ( separator = ", "))
    mySwapStep2()
    mySwapStep1()
    //println(array.indexOf(1))
}