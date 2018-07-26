fun main(args: Array<String>) {

    // Constants
    val number: Int = 10
    val myAge: Int = 32
    val testNumber: Int = 100
    val evenOdd: Int = testNumber % 2

    // Variables
    var averageAge: Double = 32.0
    var answer: Int = 0

    answer += 1
    answer += 10
    answer *= 10
    answer shr(3)

    // Ex. 1
    val exercises: Int = 9
    var exercisesSolved: Int = 0

    // Ex. 2
    var age: Int
    age = 16
    println(age)
    age = 30
    println(age)

    // Ex. 3
    val a: Int = 46
    val b: Int = 10

    val answer1: Int = (a * 100)
    println(answer1)
    val answer2: Int = (a * 100) + (b * 100)
    println(answer2)
    val answer3: Int = (a * 100) + (b / 10)
    println(answer3)

    // Ex. 4

    print((5 * 3) - (4 / 2 * 2))


    println("%d".format(answer))

    // Will print: Some text
    println("%.0f".format(28.0 % 10.0))

    // Shift left example
    println("%d".format(2 shl 3))



}