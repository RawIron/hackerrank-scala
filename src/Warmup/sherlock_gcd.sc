
def divisors(x: Int): Set[Int] = {
  def searchBackwards(dividend: Int, isDivisor: Int, divisors: List[Int]): List[Int] = {
    if (isDivisor == 1) divisors
    else if (dividend % isDivisor == 0) {
      searchBackwards(dividend, isDivisor-1, isDivisor :: divisors)
    } else {
      searchBackwards(dividend, isDivisor-1, divisors)
    }
  }

  if (x == 1) {
    Set.empty
  } else {
    searchBackwards(x, x / 2, x :: List.empty).toSet[Int]
  }
}


val series: Array[Int] = "2 4".split(" ").map(_.toInt)

var intersectOfDivisors: Set[Int] = divisors(series(0))
var i: Int = 1

while (i < series.length && intersectOfDivisors.size > 0) {
  intersectOfDivisors = intersectOfDivisors.intersect(divisors(series(i)))
  i += 1
}

if (intersectOfDivisors.size == 0) {
  println("YES")
} else {
  println("NO")
}
