object MergeSortedList extends App{

  def merge(ls1: List[Int], ls2: List[Int]): List[Int] = {
    def loop(ls1: List[Int], ls2: List[Int], res: List[Int]): List[Int] = (ls1, ls2) match {
      case (Nil, Nil) => res
      case (Nil, y) => res ++ y
      case (x, Nil) => res ++ x
      case (x::xs, y::ys) =>
        if (x <= y) loop(xs, y::ys, res :+ x)
        else loop(x::xs, ys, res :+ y)
    }
    loop(ls1, ls2, Nil)
  }

  println(merge(List(1, 5, 15, 20, 25), List(2, 4, 6, 8, 10)))
}
