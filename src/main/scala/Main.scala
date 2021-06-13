object Main {

  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    sortedSeq.iterator.sliding(2).forall(seq => {
      ordered(seq(0), seq(1))
    })
  }
}
