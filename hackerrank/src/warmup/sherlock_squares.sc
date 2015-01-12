object Solution {
  val numberOfTests: Int = 1

  val interval: Array[Int] = "4 9".split(" ").map(_.toInt)

  var squares: Int = 0
  var square: Int = 0

  square = math.sqrt(interval(0)).toInt
  if (square * square < interval(0)) {
    square += 1
  }

  while (square * square <= interval(1)) {
    squares += 1
    square += 1
  }

  println(squares)
}
