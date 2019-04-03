object Main {
  def isSorted[E](sortedSeq: Seq[E])(isOrdered: (E, E) => Boolean): Boolean = {
    def isSortedRecursive(i: Int): Boolean = {
      if (i == sortedSeq.length - 1) true
      else if (!isOrdered(sortedSeq(i), sortedSeq(i + 1))) false
      else isSortedRecursive(i + 1)
    }
    if(sortedSeq.length == 0) true else isSortedRecursive(0)
  }
}
