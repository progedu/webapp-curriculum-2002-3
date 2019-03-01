import scala.annotation.tailrec

object Main {

  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {

    @tailrec
    def go(seq: Seq[E]): Boolean = seq match {
      case _ :: Nil | Nil => true
      case x :: xs if !ordered(x, xs.head) => false
      case _ :: xs => go(xs)
    }
    go(sortedSeq)
  }

}
