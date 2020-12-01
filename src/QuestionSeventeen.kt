fun main(){
    var numArray = IntArray(5)
    for(i in numArray.indices){
        println("Please enter number ${i+1}")
        numArray[i] = readLine()!!.toInt()
    }
    var greatest : Int = numArray[0]
    var lowest : Int = numArray[0]
    for(i in numArray.indices){
        if(numArray[i] > greatest ){
            greatest = numArray[i]
        }
        else if (numArray[i] > lowest){
            lowest = numArray[i]
        }
    }
    println("Greatest number in an array is $greatest.")
    println("Lowest number in an array is $lowest.")
}
