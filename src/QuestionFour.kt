fun main(){
    println("Please enter your Monthly salary.")
    var salary : Long  = readLine()!!.toLong()
    taxChecker(salary)
}

fun taxChecker(salary: Long) {
    if((salary * 12) > 200000 ){
        print("You have to pay tax.")
    }
    else{
        print("You don't have to pay tax.")
    }
}