import java.util.Scanner
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    var year:Int = reader.nextInt()

    if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
        println("its a Leap Year")
    }
    else {
        println("its not Leap Year")
    }


}