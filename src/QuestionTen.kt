fun main(){
    println ("Please Enter a start number ")
    val start : Int = readLine()!!.toInt();
    println ("Please Enter a end number ")
    val end : Int = readLine()!!.toInt();
    odd(start, end);
}
fun odd (start : Int, end : Int){
    for(i in start..end){
        if (i % 2 != 0) {
            println("$i is odd number.")
        }
    }
}