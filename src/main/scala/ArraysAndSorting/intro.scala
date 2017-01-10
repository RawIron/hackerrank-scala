package ArraysAndSorting


object FirstOccur {

  def loop(haystack: Array[Int], needle: Int): Int = {
    var first: Int = -1
    var i: Int = 0

    while (first < 0 && i < haystack.length) {
      if (haystack(i) == needle) {
        first = i
      }
      i += 1
    }

    first
  }

  def recursive[A](haystack: List[A], needle: A): Int = {
    def searchForward(haystack: List[A], needle: A, position: Int): Int = {
      if (haystack.isEmpty) -1
      else if (haystack.head == needle) position
      else searchForward(haystack.tail, needle, position + 1)
    }

    searchForward(haystack, needle, 0)
  }
}


object Solution {
    val sc = new java.util.Scanner(System.in)
    val needle = sc.nextInt()
    val haystack: Array[Int] = sc.nextLine().split(" ").map(_.toInt)

    println(FirstOccur.recursive(haystack.toList, needle))
}
