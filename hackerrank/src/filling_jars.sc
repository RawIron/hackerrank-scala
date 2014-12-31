val lineWithJarsAndMoves: Array[String] = "5 17".split(" ")
val numberOfJars: Int = lineWithJarsAndMoves(0).toInt
val numberOfMoves: Int = lineWithJarsAndMoves(1).toInt

val moves: Array[(Int, Int, Int)] = new Array(numberOfMoves)
val jars: Array[BigInt] = Array.fill(numberOfJars)(0)

for (i <- 0 until numberOfMoves) {
  val lineWithMove: Array[String] = "1 3 12".split(" ")
  moves(i) = (lineWithMove(0).toInt,
              lineWithMove(1).toInt,
              lineWithMove(2).toInt)
}

for (move <- moves) {
  for (i <- (move._1 - 1) until move._2) {
    jars(i) += move._3
  }
}

println(jars.sum / numberOfJars)

var total: BigInt = 0

for (move <- moves) {
  total += (move._2 - move._1 + 1) * move._3
}

println(total / numberOfJars)


val x: Int = 2000000000
val y: Int = 2000000
val z: BigInt = x * y

println(z)