package Implementation

// object with a single method
object MiniMaxiSum {
  def ofFour(numbers: Seq[Long]): (Long,Long) = {
    val is_sorted = numbers.sorted
    (is_sorted.take(4).sum, is_sorted.takeRight(4).sum)
  }
}

// functions are objects
// instead of an object with a single method
// use a function object
object MiniMaxiSumFunc extends ((Seq[Long], Int) => (Long, Long)) {
  def apply(numbers: Seq[Long], cutSize:Int): (Long, Long) = {
    val is_sorted = numbers.sorted
    (is_sorted.take(cutSize).sum, is_sorted.takeRight(cutSize).sum)
  }
}


object Solution {
  def main(args: Array[String]): Unit = {
    val raw: String = scala.io.StdIn.readLine()
    val numbers:Seq[Long] = raw.split(" ").map(_.toLong)

    val (mini, maxi) = MiniMaxiSum.ofFour(numbers)
    println(f"$mini%d $maxi%d")
  }
}
