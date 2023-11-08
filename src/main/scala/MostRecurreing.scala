object MostRecurreing extends App {

  //input: words = ["i","love","HPE","i","love","coding", "HPE"], k = 2 and o/p : ["i","HPE"]

  def getTopElements(ls: List[String], topK: Int) = {
  ls.groupBy(x => x).map {
    case (key, value) => (key, value.length)
    }.toSeq.sortBy {
    case (key, value) => (-value, key)
    }.map {
    case (key, _) => key
    }.take(topK)
  }

  println(getTopElements(List("i","love","HPE","i","love","coding", "HPE"), 2))


}
