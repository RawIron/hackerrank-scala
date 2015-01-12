object Solution {

  def printSort(sortThis: Array[Int]) = {
    sortThis.foreach(x => print(x + " "))
    println()
  }

  def insert(sortThis: Array[Int], pos: Int, elem: Int) = {
    var i: Int = pos
    while (i >= 0 && sortThis(i) > elem) {
      sortThis(i+1) = sortThis(i)
      i -= 1
    }

    sortThis(i+1) = elem
    printSort(sortThis)
  }

  def main(args: Array[String]) {
    val sortThis: Array[Int] = "2".split(" ").map(_.toInt)

    if (sortThis.length == 1) {
      printSort(sortThis)
    }

    var elem: Int = 0
    var i: Int = 0

    while (i < sortThis.length - 1) {
      elem = sortThis(i+1)
      insert(sortThis, i, elem)
      i += 1
    }
  }

}

Solution.main(Array.empty)
