fun main() {
    val evenArray = IntArray(5)
    for (i in evenArray.indices) {
        println("Enter element ${i + 1} :")
        evenArray[i] = readLine()!!.toInt()
    }
    println ("Even number in an array")
    for(i in evenArray.indices){
        if(evenArray[i] % 2 == 0 ){
            println(evenArray[i])
        }
    }
}