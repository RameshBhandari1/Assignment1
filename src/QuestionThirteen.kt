fun main(){
    println("Please enter a number.")
    var num : Int = readLine()!!.toInt()
    design(num)
}

fun design(num: Int) {
    for(i in 1..num){
        for(k in 1..i){
            print("*")
        }
        println("")
    }
}
