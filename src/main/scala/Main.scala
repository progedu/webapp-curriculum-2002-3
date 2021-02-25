object Main {

  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    if (sortedSeq.length <= 1) return true
    for (i <- 0 until sortedSeq.length - 1) {
      if (!ordered(sortedSeq(i), sortedSeq(i + 1))) return false
    }
    true
  }

}
