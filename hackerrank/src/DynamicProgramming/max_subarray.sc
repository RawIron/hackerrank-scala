object Solution {

  def loop(population: Array[Int]): Int = {
  }

  def recursive[A](population: List[A]): Int = {
  }

  def main(args: Array[String]) {
    val population: Array[Int] = "2 45 23 -4 12 343".split(" ").map(_.toInt)
    println(loop(population))
  }
}

Solution.main(Array.empty)