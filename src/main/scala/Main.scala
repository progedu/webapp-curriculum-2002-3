object Main {

  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    def isSortedRec(seq: Seq[E]): Boolean = seq match{
      case Seq() => true
      case first :: rest  =>  if(isSortedRec(rest)) rest match {
        case Seq() => true
        case r1 :: r2 => ordered(first,r1)
      } else false
    }
    isSortedRec(sortedSeq)
  }

}
