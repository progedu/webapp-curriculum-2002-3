object Main {

  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    val notSorted = !sortedSeq.iterator.sliding(2).forall(seq => {
      ordered(seq(0), seq(1))
    })

    !notSorted
  }

}
