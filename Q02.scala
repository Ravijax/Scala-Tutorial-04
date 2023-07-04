import scala.io.StdIn

def patternMatching(a: Int): Unit = a match
{
    case a if a == 0 => println("Zero")
    case a if a < 0  => println("Negative")
    case a if a > 0 && a%2 == 0 => println("Even Number")
    case a if a > 0 && a%2 == 1 => println("Odd Number")
}

def main(args: Array[String]): Unit = {     
    print("Enter a number: ")
    val a = scala.io.StdIn.readInt()
    patternMatching(a)
}