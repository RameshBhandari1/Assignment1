fun main(){
    println("Please enter a number.")
    var num : Int = readLine()!!.toInt()
    multiply(num)
}
var result : Int = 1;
fun multiply(num: Int) {
    for (i in 0..10){
        result = num * i
        println("$num * $i = $result")
    }
}
