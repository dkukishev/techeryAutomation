import SwapMethods.mySwapStep1
import SwapMethods.mySwapStep2

var array = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
var array2 = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)

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

        var i = 0

        while (i < 5) {

            val tmp = array2[i*2]
            array2[i*2] = array2[i*2+1]
            array2[i*2+1] = tmp

            i++
        }
        println(array2)
    }
}


fun main(){
    println("Here is array of 11 elements: " + array.joinToString ( separator = ", "))
    mySwapStep2()
    mySwapStep1()
}