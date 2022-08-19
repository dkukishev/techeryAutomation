import interfaces.Iterable

fun main() {
    var MyCar = Car()
    MyCar.good1()
    MyCar.good2()
    MyCar.good3()
}


class Car: Iterable {
    override fun good1() {
        println("good1 added to the car")
    }

    override fun good2() {
        println("good2 added to the car")
    }

    override fun good3() {
        println("good3 added to the car")
    }

}