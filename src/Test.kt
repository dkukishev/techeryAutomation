fun outArray (array: Array<Int>): String {
   val arrayOfString = array.joinToString ( separator = " ")
    return arrayOfString
}

fun arrSum(array: Array<Int>): Int {
    var sum = 0
    var cou = 0
    for (i in array[0]..array.size){
        sum += array[cou]
        cou++
    }
    return sum
}

fun averageOfArr(array: Array<Int>): Int {
    var count: Int = array.size
    var sum: Int = arrSum(array)
    return (sum/count)
}

fun main() {
    val array1 = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var outWithouCom = outArray(array1)
    var sumArr = arrSum(array1)
    var aveFromArr = averageOfArr(array1)
    println("Here is the array without comma: $outWithouCom")
    println("Here is sum of the array: $sumArr")
    println("Here is average of the array: $aveFromArr")
}
