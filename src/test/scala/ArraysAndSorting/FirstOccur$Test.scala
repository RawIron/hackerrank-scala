package ArraysAndSorting

import org.scalatest.FunSuite


class FirstOccur$Test extends FunSuite {

  test("fist match using recursion") {
    val needle: Int = 12
    val haystack: Array[Int] = "2 45 23 -4 12 343".split(" ").map(_.toInt)
    assert(FirstOccur.recursive(haystack.toList, needle) == 4)
  }

  test("fist match of needle in haystack using iteration") {
    val needle: Int = 12
    val haystack: Array[Int] = "2 45 23 -4 12 343".split(" ").map(_.toInt)
    assert(FirstOccur.loop(haystack, needle) == 4)
  }

}
