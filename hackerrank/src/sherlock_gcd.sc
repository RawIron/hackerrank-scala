val primes: Vector[Int] = Vector.empty

def gcd(x: Int, y: Int): Int = {
  
}

val series: Array[Int] = "21 210 30".split(" ").map(_.toInt)

if (!series.exists(_ % 2 > 0)) {
  println("NO")
}

if (series.exists(primes.contains _)) {
  println("YES")
}

