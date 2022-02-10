fun main() {
    //enquire user to login or to create an account
    starting()
    val (a, b) = readLine()!!.split(' ')
    println(a.toInt() + b.toInt())
}
fun starting() {
    println("WELCOME TO OUR ATM")
    println("1. Login to your account")
    login()
    println("2. Register for a new account")
    register()
}
fun login() {
    println("LOGIN")
    print("Enter your Username or Email")
    print("Enter your Password")
    dashboard()
}
fun register(){
    println("REGISTER")
    print("Enter your username")
    print("Enter your email address")
    print("Enter your password")
    print("Confirm your Password")
    login()
}
fun dashboard() {
    println("WELCOME TO OUR ATM")
    println("what services do you wish to use")
    println("1. deposit your cash")
    println("2. check your account balance")
    println("3. withdraw from your account")
    println("4. change your account balance")
}