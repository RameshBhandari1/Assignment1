fun main(){
    println ("Please Enter a starting number :")
    val start : Int = readLine()!!.toInt();
    println ("Please Enter a ending number :")
    val end : Int = readLine()!!.toInt();
    addNos(start, end);
}
var sum : Int = 0;
fun addNos(start: Int, end: Int) {
    for(i in start..end){
        if(i % 2 == 0) {
            sum = sum + i
        }
    }
    print("Total sum of even numbers from $start to $end is $sum.")
}
