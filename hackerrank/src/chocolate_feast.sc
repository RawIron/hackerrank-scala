
    val numberOfTests: Int = 1

    val test: Array[Int] = "20 3 4".split(" ").map(_.toInt)

    var total: Int = test(0) / test(1)
    var wrappers: Int = total

    while (wrappers >= test(2)) {
      val exchanged: Int = wrappers / test(2)
      wrappers = (wrappers % test(2)) + exchanged
      total += exchanged
    }

    println(total)
