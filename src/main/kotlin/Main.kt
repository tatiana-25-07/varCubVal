fun main(args: Array<String>) {
    //программа считает объем прямоугольного параллелепипеда

    println("Cuboid volume\n")

    println("First side size A:")
    val side1 = readln().toInt()
    println("Second side size B:")
    val side2 = readln().toInt()
    println("Third side size C:")
    val side3 = readln().toInt()


    val volume = side1*side2*side3
    println("Result: ")
    println(volume)
}