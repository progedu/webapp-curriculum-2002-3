object Main {

def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    def sortRec(i: Int): Boolean = {
      if (i == sortedSeq.length - 1) true
      else if (!ordered(sortedSeq(i), sortedSeq(i + 1))) false
      else sortRec(i + 1)
    }
    sortRec(0)
 }

  
  
