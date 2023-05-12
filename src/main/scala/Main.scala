object Main {

  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    sortedSeq.sliding(2).forall(x => ordered(x(0), x(1)))
  }

}
