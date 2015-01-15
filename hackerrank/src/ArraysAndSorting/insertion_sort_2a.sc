object Solution {

  def printSort(sortThis: Array[Int]) = {
    sortThis.foreach(x => print(x + " "))
    println()
  }

  def reverse(that: List[Int]): List[Int] = {
    def copy(from:List[Int], to: List[Int]): List[Int] = {
      if (from.isEmpty) to
      else copy(from.tail, from.head :: to)
    }
    copy(that, List.empty)
  }

  def recursive(sortThis: List[Int]): List[Int] = {
    def insertionSort(sorted: List[Int], todo: List[Int]): List[Int] = {
      def insert(copyFrom: List[Int], afterInserted: List[Int],
                 elem: List[Int]): List[Int] = {
        if (copyFrom.isEmpty && elem.nonEmpty)
          elem.head :: afterInserted
        else if (copyFrom.isEmpty)
          afterInserted
        else if (elem.nonEmpty && elem.head < copyFrom.head)
          insert(copyFrom, elem.head :: afterInserted, elem.tail)
        else
          insert(copyFrom.tail, copyFrom.head :: afterInserted, elem)
      }

      if (todo.isEmpty) sorted
      else insertionSort(reverse(insert(sorted, List.empty, todo.head :: List.empty)), todo.tail)
    }

    insertionSort(List(sortThis.head), sortThis.tail)
  }

  def main(args: Array[String]) {
    val sortThis: Array[Int] = "2 1 22 26 12".split(" ").map(_.toInt)

    if (sortThis.length == 1) {
      printSort(sortThis)
    } else {
      printSort(recursive(sortThis.toList).toArray)
    }
  }

}

Solution.main(Array.empty)
