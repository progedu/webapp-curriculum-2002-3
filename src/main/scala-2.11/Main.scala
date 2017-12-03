object Main {

  // 型をパラメータ化
  def isSorted[E](sortedSeq: Seq[E])(isOrdered: (E, E) => Boolean): Boolean = {
  	
    def isSortedRecursive(i: Int): Boolean = {
      
      if (i == sortedSeq.length - 1) true
      
      else if (!isOrdered(sortedSeq(i), sortedSeq(i + 1))) false

      // i,i+1の順番どおりであれば、1つ進めて、isSortedRecursive関数(自分自身)呼び出し->（末尾再帰）
      else isSortedRecursive(i + 1)

    }

    // isSortedRecursive 0からスタート
    if(sortedSeq.length == 0) true else isSortedRecursive(i = 0)
  }

}
