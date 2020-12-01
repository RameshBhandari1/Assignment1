fun main(){
    println("Please enter a number : ")
    var num : Int = readLine()!!.toInt();
    greater(num)
}
fun greater(num : Int){
    if(num >= 100){
        print("$num is greater than 100.")
    }
    else{
        print("$num is smaller than 100.")
    }
}