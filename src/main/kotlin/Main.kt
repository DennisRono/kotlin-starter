fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")
    deno()
}
fun deno(){
    for(i in 0..10){
        print(i)
    }
}