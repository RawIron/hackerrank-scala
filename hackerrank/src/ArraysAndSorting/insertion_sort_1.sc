object Solution {

  def main(args: Array[String]) {
    val sortThis: Array[Int] = "2 6 9 23 4".split(" ").map(_.toInt)

    val elem: Int = sortThis(sortThis.length - 1)
    var i: Int = sortThis.length - 2

    while (i >= 0 && sortThis(i) > elem) {
      sortThis(i+1) = sortThis(i)
      sortThis.foreach(x => print(x + " "))
      println()
      i -= 1
    }

    sortThis(i+1) = elem
    sortThis.foreach(x => print(x + " "))
    println()
  }

}

Solution.main(Array.empty)
