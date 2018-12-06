object Main {

  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {

    def isSortedRec(i: Int): Boolean = {
      if (sortedSeq.length - 1 == i) true
      else if (ordered(sortedSeq(i), sortedSeq(i + 1)) != true) false
      else isSortedRec(i + 1)
    }
    isSortedRec(0)

  }

}
