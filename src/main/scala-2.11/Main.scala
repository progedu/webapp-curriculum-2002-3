object Main {

  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    def isSourtedRec(i: Int): Boolean = {
      if ((sortedSeq.length - 1) == i) true
      else if (ordered(sortedSeq(i), sortedSeq(i + 1))) isSourtedRec(i + 1)
      else false
    }
    isSourtedRec(0)
  }

}
