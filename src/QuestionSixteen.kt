fun main(){
    var evenArray = IntArray(5)
    for (i in evenArray.indices){
        println("Please enter number ${i+1}")
        evenArray[i] = readLine()!!.toInt()
    }
    var sum : Int = 0
    for (i in evenArray.indices){
        if(evenArray[i] % 2 == 0){
            sum = sum + evenArray[i]
        }
    }
    println("Sum of even numbers are $sum.")
}