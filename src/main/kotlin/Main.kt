fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")
}
class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}