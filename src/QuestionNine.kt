fun main(){
    println ("Please Enter a start number ")
    val start : Int = readLine()!!.toInt();
    println ("Please Enter a end number ")
    val end : Int = readLine()!!.toInt();
    even(start, end);
}
fun even (start : Int, end : Int){
    for(i in start..end){
        if (i % 2 == 0) {
            println("$i is even number.")
        }
    }
}
