object PrintString extends App {

  /*
  print number 1 to 100.
  if there are multiple of 3 ==> I
  if there are multiple of 5 ==> am
  if there are multiple of 3 and 5 ==> Reena
   */


  def printNumber(n: Int) = {
    val nums = 1 to n
    nums.foreach(x =>
      x match {
        case n if x % 3 == 0 && x % 5 == 0 => println("Reena")
        case n if x % 3 == 0 => println("i")
        case n if x % 5 == 0 => println("am")
        case _ => println(s"$x")
      }
    )
  }

  printNumber(1000)

}
















