object Solution {
  val numberOfTests: Int = 1

  val interval: Array[Int] = "17 24".split(" ").map(_.toInt)

  var squares: Int = 0
  var firstSquare: Int = 0
  var square: Int = 0

  var value: Int = interval(0)
  while (value <= interval(1) && squares == 0) {
    val isSquare: Int = math.sqrt(value.toDouble).toInt
    if (isSquare * isSquare == value) {
      firstSquare = isSquare
      squares += 1
    }
    value += 1
  }

  if (firstSquare > 0) {
    square = firstSquare + 1
    while (square * square <= interval(1)) {
      squares += 1
      square += 1
    }
  }

  println(squares)
}
