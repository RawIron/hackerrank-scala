import scala.language.postfixOps

object Application {

  def successor(n: BigInt): Stream[BigInt] =
    Stream.cons(n, successor(n + 1))

  def sieve(nums: Stream[BigInt]): Stream[BigInt] =
    Stream.cons(nums.head, sieve(nums.tail filter (x => x % nums.head != 0)))

  def main(args: Array[String])
  {
    val primes = sieve(successor(BigInt(2)))
    primes.take(10) print
  }
}

Application.main(Array.empty)