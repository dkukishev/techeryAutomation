

fun outArray (array: Array<Int>): String {
   val arrayOfString = array.joinToString ( separator = " ")
    return arrayOfString
}

fun arrSum(array: Array<Int>): Double {
    var sum: Double = 0.0

    for (index in array.indices){
        sum += array[index]
    }
    return sum
}

fun averageOfArr(array: Array<Int>): Any {
    var count: Double = array.size.toDouble()
    var sum: Double = arrSum(array)
    var res = sum/count
    return (res)
}

fun main() {
    val array1 = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var outWithouCom = outArray(array1)
    var sumArr = arrSum(array1).toInt()
    var aveFromArr = averageOfArr(array1)
    println("Here is the array without comma: $outWithouCom")
    println("Here is sum of the array: $sumArr")
    println("Here is average of the array: $aveFromArr")
    println()
}
