package Implementation

import org.scalatest.FunSuite


class MiniMaxiSum$Test extends FunSuite {

  class MiniMaxi$Test extends FunSuite {
    test("small numbers") {
      val numbers: Seq[Long] = Seq(2, 3, 6, 3, 2)
      assert (MiniMaxiSum.ofFour(numbers) == (11, 11))
    }
  }

}
