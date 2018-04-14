object Main {

  def isSorted[T](target: Seq[T])(isOrdered: (T, T) => Boolean): Boolean = {
    def isSortedRecursive(i: Int): Boolean = {
      if (i == target.length - 1) true
      else if (!isOrdered(target(i), target(i+1))) false
      else isSortedRecursive(i+1)
    }

    if (target.isEmpty) true else isSortedRecursive(0)
  }

}
