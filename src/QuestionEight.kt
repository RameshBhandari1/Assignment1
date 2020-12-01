fun main(){
    println("Please enter your salary: ")
    val salary : Double = readLine()!!.toDouble()
    val yearlySalary = salary * 12
    incomeTaxChecker(yearlySalary)
}

fun incomeTaxChecker(salary: Double) {
    if (salary<200000){
        val tax = salary * 0.01
        print("The tax of $salary is $tax")
    }
    else if(salary in 200000..350000){
        val tax = ((200000 * 0.01)+((salary-200000) * 0.15))
        print("The tax of $salary is $tax")
    }
    else if(salary>350000){
        val tax = ((200000 * 0.01)+(150000 * 0.15)+((salary-350000) * 0.25))
        print("The tax of $salary is $tax")
    }
}