import scala.annotation.tailrec

object Main {

  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    @tailrec
    def checkSort(num: Int): Boolean = {
      if(num == sortedSeq.length - 1) {
        return true
      }
      if(ordered(sortedSeq(num), sortedSeq(num + 1))) {
        checkSort(num + 1)
      } else {
        return  false
      }
    }
    checkSort(0)
  }

}
