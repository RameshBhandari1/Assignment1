fun main(){
    println("Hello! What day is today?")
    var day : String = readLine()!!.toString()
    week(day)
}
fun week(day : String){
    if(day == "saturday" || day == "SATURDAY"){
        print("It is a happy holiday.")
    }
    else{
        print("It is a weekday.")
    }
}