
val numberOfTests: Int = 1

val interval: Array[Int] = "32 1456".split(" ").map(_.toInt)
var squares: Int = 0

for (value <- interval(0) to interval(1)) {
  val isSquare: Double = math.sqrt(value.toDouble)
  val square: Int = isSquare.toInt
  if (square * square == value) {
    squares += 1
  }
}

println(squares)
