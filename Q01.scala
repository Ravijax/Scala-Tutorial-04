import scala.io.StdIn

def interest(dep: Double): Double = dep match
{
    case dep if dep <= 0 => dep * 0.0
    case dep if dep <= 20000 => dep * 0.02
    case dep if dep <= 200000  => dep * 0.04
    case dep if dep <= 2000000 => dep * 0.035
    case dep if dep > 2000000 => dep * 0.065
}

def main(args: Array[String]): Unit = {   
    print("Enter deposit amount: ")
    val deposit = scala.io.StdIn.readDouble()
    println("The interest is: " + interest(deposit))
}

