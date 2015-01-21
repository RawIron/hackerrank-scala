object Solution {

  def allRoutesOf(routes: Array[Int]): Int = {
    val MOD: Int = 1234567
    routes.foldLeft(1) {(total, route) => (total % MOD) * (route % MOD)} % MOD
  }

  def main(args: Array[String]) {
      val routes: Array[Int] = "4 5 7".split(" ").map(_.toInt)
      println(allRoutesOf(routes))
  }
}

Solution.main(Array.empty)
