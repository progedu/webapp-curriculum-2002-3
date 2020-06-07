import scala.annotation.tailrec

object Main {

  def isSorted[E](sortedSeq: Seq[E])(isOrdered: (E, E) => Boolean): Boolean = {
    @tailrec
    def isSortedRecursive(i: Int): Boolean = {
      if (i == sortedSeq.length - 1) true
      else if (!isOrdered(sortedSeq(i), sortedSeq(i + 1))) false
      else isSortedRecursive(i + 1)
    }
    if (sortedSeq.isEmpty) true else isSortedRecursive(0)
  }

}
