fun main(args: Array<String>) {
    val obj = Example()
    obj.printMe()
    obj.print()
    val date= 6
    val result = when (date){
        1 -> {
          println("First day of the Week")
          println("Monday")
        }
        2 ->{
            println("Second Day of the week")
            println("Tuesday")
        }
        3 ->{
            println("Third day of the week")
          println("Wednesday")
        }
        4 ->{
           println("Fourth day of the week")
           println("Thursday")
        }
        5 -> {
            println("Fifth day of the week")
            println("Friday")
        }
        6 -> {
            println("Sixth day of the week")
            println("Saturday")
        }
        7 -> {
            println("Seventh day of the week")
            println("Sunday")
        }
        else -> "Invalid date"
    }
    println(result)
}