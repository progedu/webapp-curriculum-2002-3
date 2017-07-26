object Main {

  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    def isSortedRec(i: Int): Boolean = {
      if(sortedSeq.length - 1 == i) true
      else if(ordered(sortedSeq(i), sortedSeq(i + 1))) isSortedRec(i + 1)
      else false
    }

    if(sortedSeq.isEmpty || sortedSeq.length == 1) {
      throw new IllegalArgumentException(s"sortedSeq.length is ${sortedSeq.length} and therefore unable to check if elements are sorted.")
    } else {
      isSortedRec(0)
    }
  }

}
