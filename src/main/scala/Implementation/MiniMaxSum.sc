object MiniMaxi {

  def ofFour(line: String): (Long,Long) = {
    val numbers: Seq[Long] = line.split(" ").map(_.toLong).sorted

    (numbers.take(4).sum, numbers.takeRight(4).sum)
  }

}


object Solution {
  def main(args: Array[String]): Unit = {
    val raw: String = scala.io.StdIn.readLine()

    val (mini, maxi) = MiniMaxi.ofFour(raw)
    println(f"$mini%d $maxi%d")
  }
}

Solution.main(Array.empty)