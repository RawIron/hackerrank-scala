object Solution {

  implicit def pimp(n:Int) = new { def handshakes = (0 /: (1 to n)) ( _ + _ ) }

  def main(args: Array[String]) {
    val tests = "1 3 11".split(" ").map(_.toInt)

    for (members <- tests) {
      if (members < 2) println(0)
      else println((members-1).handshakes)
    }
  }

}

Solution.main(Array.empty)
