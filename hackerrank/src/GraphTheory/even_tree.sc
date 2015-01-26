object Solution {

  def mergeTerminal(vertices: Array[Int], paths: Array[List[Int]]) = {
    for (i <- 0 until paths.length) {
      if (paths(i).size == 1) {
        val parent: Int = paths(i).head
        vertices(parent) += 1
        paths(parent) = paths(parent).filter(_ != i)
        vertices(i) = 0
        paths(i) = List.empty
      }
    }
  }

  def removeEven(vertices: Array[Int], paths: Array[List[Int]]): Int = {
    var cuts: Int = 0
    for (i <- 0 until paths.length) {
      if (paths(i).size == 1 && vertices(i) % 2 == 0) {
        val parent: Int = paths(i).head
        paths(parent) = paths(parent).filter(_ != i)
        vertices(i) = 0
        paths(i) = List.empty
        cuts += 1
      }
    }
    cuts
  }

  def main(args: Array[String]) {
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

    var vertices: Array[Int] = Array.fill[Int](numberOfVertices)(1)
    var paths: Array[List[Int]] = Array.fill[List[Int]](numberOfVertices)(List.empty)
    var totalCuts: Int = 0

    edges.foreach(x => {
      paths(x._1 - 1) = x._2 - 1 :: paths(x._1 - 1)
      paths(x._2 - 1) = x._1 - 1 :: paths(x._2 - 1)
    })
    paths.foreach(println)

    while (paths.exists(_.nonEmpty)) {
      mergeTerminal(vertices, paths)
      totalCuts += removeEven(vertices, paths)

      println
      vertices.foreach(println)
      paths.foreach(println)
    }

    println(totalCuts)
  }
}

Solution.main(Array.empty)
