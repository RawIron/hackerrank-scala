object Solution {

  def loop(population: Array[Int]): (Int, Int, Int, Int) = {
    var sum: Int = 0
    var high: (Int, Int, Int, Int) = (0, 0, Int.MinValue, 0)

    for (i <- 0 until population.length) {
      sum += population(i)

      if (population(i) > 0) {
        high = (high._1, high._2, high._3, high._4 + population(i))
      }

      println(sum, high)

      if (sum > high._3) {
        high = (high._1, i, sum, high._4)
      }
      if (sum <= 0) {
        high = (i + 1, i + 1, high._3, high._4)
        sum = 0
      }
    }

    if (high._4 == 0) {
      high = (high._1, high._2, high._3, high._3)
    }

    high
  }

  def main(args: Array[String]) {
    val population: Array[Int] = "2 45 -50 23 -4 12 -65 343 14 -11 -4".split(" ").map(_.toInt)
    println(loop(population))
  }
}

Solution.main(Array.empty)