object Distinct extends  App{

  def distinct(ls: List[Long]) = {
    def loop(l: List[Long], res: List[Long]): List[Long] = l match {
      case Nil => res
      case x::xs => loop(xs, if(res.contains(x)) res else res :+ x)
    }
    loop(ls, Nil)
  }

  def distinctV2(ls: List[Long]) = {
    ls.groupBy(x => x).keys
  }

  println(distinctV2(List(1L, 2L, 3L, 2L, 1L, 5L)))
}
