fun main(){
    var oddArray = IntArray(5)
    for (i in oddArray.indices){
        println("Please enter number ${i+1}")
        oddArray[i] = readLine()!!.toInt()
    }
    println("Odd numbers in an array are : ")
    for (i in oddArray.indices){
        if(oddArray[i] % 2 != 0){
            println(oddArray[i])
        }
    }
}