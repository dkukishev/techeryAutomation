class SingleLinkList<E> {
    private var size = 0
    private var head: Node<E>? = null
    private var tail: Node<E>? = null

    private inner class Node<E> (internal var element: E, internal var next: Node<E>?)

    fun linkTail (element: E) {
        var t = tail
        var newNode = Node<E>(element, null)
        tail = newNode

        if (t == null) {
            head = newNode
        } else {
            t.next = newNode
        }
        size++
    }

    fun linkHead (element: E) {
        var h = head
        var newNode = Node<E>(element, next = h)
        head = newNode

        if (h == null) {
            tail = newNode
        }
        size++
    }

    private fun node (index: Int): Node <E> {
        var x = head
        for (i in 0 until index){
            x = x!!.next
        }
        return x!!
    }

    fun appendTo (element: E) {
        linkTail(element)
    }

    fun insertInBeginning (element: E) {
        linkHead(element)
    }

    fun count (): Int {
        var newNode = head
        if (newNode != null) {
            var counter = 1
            while (newNode?.next != null){
                newNode = newNode?.next
                counter += 1
            }
            return counter
        } else {
            return 0
        }
    }

    override fun toString(): String {
        var curr = head
        if (curr == null) return "[]"
        else {
            val sb = StringBuilder()
            sb.append('[')
            while (curr != null) {
                sb.append(curr.element)
                curr = curr.next
                if (curr?.element == null) {
                    sb.append(']')
                } else {
                    sb.append(',').append(' ')
                }
            }
            return sb.toString()
        }
    }
}






fun main(args: Array<String>) {
    var linkyList = SingleLinkList<String>()
    linkyList.appendTo("Name0")
    linkyList.appendTo("Name1")
    linkyList.appendTo("Name2")
    println("Elements in list are - $linkyList")
    linkyList.appendTo("NameNew3")
    println("Elements in list are - $linkyList")
    linkyList.insertInBeginning("Name5")
    println("Elements in list are - $linkyList")
    linkyList.appendTo("NameNew11")
    println("Elements in list are - $linkyList")
    println("Amount of elements in list is - ${linkyList.count()}")
}