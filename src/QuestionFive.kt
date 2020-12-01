fun main(){
    println("Please enter your age: ")
    val age : Int = readLine()!!.toInt()
    ageChecker(age)
}

fun ageChecker(age: Int) {
    if(age in 0..19){
        print("Child")

    } else if(age in 20..59 ){
        print("Young")
    }
    else if(age in 60..150 ){
        print("Old")
    }
    else{
        print("Invalid")
    }
}