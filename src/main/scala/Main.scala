object Main extends App {
  println(s"isSorted(Seq('a', 'b', 'c', 'd'))(_ < _)): ${isSorted(Seq('a', 'b', 'c', 'd'))(_ < _)}")
  println(s"isSorted(Seq(1, 2, 3, 4))(_ < _): ${isSorted(Seq(1, 2, 3, 4))(_ < _)}")
  println(s"isSorted(Seq(1, 2, 3, 2))(_ < _): ${isSorted(Seq(1, 2, 3, 2))(_ < _)}")

  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    sortedSeq.grouped(2).foldLeft(true) ((acc, x) => x match {
      case Seq(a) => acc && true
      case Seq(a, b) => acc && ordered(a, b)
      case _ => acc
    })
  }

}
