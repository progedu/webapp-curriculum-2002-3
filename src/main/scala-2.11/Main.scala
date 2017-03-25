object Main {

  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    def review(i: Int): Boolean = {
      if (i == sortedSeq.length - 1 || sortedSeq.isEmpty) true
      else if (!ordered(sortedSeq(i), sortedSeq(i + 1))) false
      else review(i + 1)
    }

    review(0)
  }

}
