fun main(){
    println("Please enter a number : ")
    val num = readLine()!!.toInt()

    when (num) {
        1 -> print("One")
        2 -> print("Two")
        3 -> print("Three")
        4 -> print("Four")
        5 -> print("Five")
        6 -> print("Six")
        7 -> print("Seven")
        8 -> print("Eight")
        9 -> print("Nine")
        0 -> print("Zero")
        else ->{
            print("Invalid")
        }


    }
}