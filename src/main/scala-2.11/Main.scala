import scala.annotation.tailrec

object Main {

  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    @tailrec
    def f(seq: Seq[E]): Boolean = seq match {
      case Nil | _ :: Nil => true
      case h1 :: h2 :: tail if ordered(h1, h2) => f(h2 :: tail)
      case _ => false
    }

    f(sortedSeq)
  }

}
