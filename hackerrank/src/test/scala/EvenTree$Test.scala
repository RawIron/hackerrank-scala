import algorithm.GraphTheory._

class EvenTree$Test extends org.scalatest.FunSuite {

  test("total cuts matches") {

    val numberOfVertices: Int = 20
    val numberOfEdges: Int = 19
    val edges: Array[(Int, Int)] = Array(
      (2, 1),
      (3, 1),
      (4, 3),
      (5, 2),
      (6, 5),
      (7, 1),
      (8, 1),
      (9, 2),
      (10, 7),
      (11, 10),
      (12, 3),
      (13, 7),
      (14, 8),
      (15, 12),
      (16, 6),
      (17, 6),
      (18, 10),
      (19, 1),
      (20, 8))

      assert(EvenTree.countCuts(numberOfVertices, edges) == 4)
  }

}
