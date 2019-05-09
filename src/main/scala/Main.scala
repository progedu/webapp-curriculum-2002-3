object Main extends App {
  println(s"isSorted(Seq('a', 'b', 'c', 'd'))(_ < _)): ${isSorted(Seq('a', 'b', 'c', 'd'))(_ < _)}")
  println(s"isSorted(Seq(1, 2, 3, 4))(_ < _): ${isSorted(Seq(1, 2, 3, 4))(_ < _)}")
  println(s"isSorted(Seq(1, 2, 3, 2))(_ < _): ${isSorted(Seq(1, 2, 3, 2))(_ < _)}")

  def isSorted[E](sortedSeq: Seq[E])(isOrdered: (E, E) => Boolean): Boolean = {
    def loop(seq: Seq[Seq[E]]): Boolean = seq match {
      case Seq(a, b)::xs => if(isOrdered(a, b)) loop(xs) else false
      case Seq(a):: _ => true
      case Seq() => true
      case _ => true
    }
    val seq = sortedSeq.grouped(2).toList
    loop(seq)
  }
}
