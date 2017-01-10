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

  def main(args: Array[String]) {
    val needle: Int = 12
    val haystack: Array[Int] = "2 45 23 -4 12 343".split(" ").map(_.toInt)
    println(FirstOccur.loop(haystack, needle))
    println(FirstOccur.recursive(haystack.toList, needle))
  }
}


Solution.main(Array.empty)
