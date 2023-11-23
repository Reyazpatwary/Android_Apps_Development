import java.io.Reader
import java.util.Scanner
fun main(args: Array<String>) {

    var reader = Scanner(System.`in`)


    var num1:Int = reader.nextInt()
    var num2:Int = reader.nextInt()

    var sum = num1+num2

    println("The total is: ${sum}")


}