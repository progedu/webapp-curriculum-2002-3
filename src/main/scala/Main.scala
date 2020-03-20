object Main {

  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    def checkOrderRec(i: Int): Boolean = {
      if(sortedSeq.length == i + 1) true
      else if (ordered(sortedSeq(i), sortedSeq(i + 1))) checkOrderRec(i + 1)
      else false
    }

    checkOrderRec(0)
  }

}
