import java.util.Scanner

fun main(args: Array<String>) {

    var reader = Scanner(System.`in`)
    var a: Int = reader.nextInt()
    var b: Int = reader.nextInt()
    var c: Int = reader.nextInt()

    if (a > b && a > c) {
        println("The largest Number ${a}")
    } else if (b > a && b > c) {
        println("the largest Number ${b}")
    } else if (c > a && c > b) {
        println("the largest number ${c}")
    } else if (a == b && a > c) {
        println("a and b are grater")
    } else if
                   (a == c && a > b) {
        println("a and c are grater")
    } else if
                   (b == c && b > a) {
        println("b and c are grater")
    } else {
        "they are equal"
    }


}