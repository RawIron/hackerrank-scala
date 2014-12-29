  def printMatrix(matrix: Array[Int], width:Int, height: Int) = {
    for (i <- 0 until height) {
      for (j <- 0 until width)
        print(matrix(i * width + j))
      println(" ")
    }
  }

  def binaryOr(lhs: Array[Int], rhs: Array[Int]): Array[Int] = {
    val result: Array[Int] = new Array[Int](lhs.length)
    var oneCount: Int = 0
    for (i <- 0 until lhs.length-1) {
      if (lhs(i) + rhs(i) > 0) {
        result(i) = 1
        oneCount += 1
      }
    }
    result(lhs.length-1) = oneCount
    result
  }

  val NUMBER_PEOPLE = 0
  val NUMBER_TOPICS = 1
//    val confLine: String = readLine
//    val conf: Array[String] = confLine.split(" ")
//    val numberPeople: Int = conf(NUMBER_PEOPLE).toInt
//    val numberTopics: Int = conf(NUMBER_TOPICS).toInt
  val numberPeople: Int = 4
  val numberTopics: Int = 5
  val testPattern: Array[String] = Array("01010", "00111", "11000", "01101")

  val peopleTopic = new Array[Int](numberPeople * (numberTopics + 1))
  var idx = 0
  var sumOfRow: Int = 0

  for (row <- 0 until numberPeople) {
    val rowLine: Seq[Char] = testPattern(row)
    sumOfRow = 0
    for (column <- 0 until numberTopics) {
      idx = row * (numberTopics+1) + column
      val columnValue: Int = rowLine(column).toString.toInt
      peopleTopic(idx) = columnValue
      sumOfRow += columnValue
    }
    peopleTopic(row * (numberTopics+1) + numberTopics) = sumOfRow
  }

  printMatrix(peopleTopic, numberTopics+1, numberPeople)

  var togetherMaxTopicsCounter: Int = 0
  var togetherMaxTopics: Int = 0

  for (i <- 0 until numberPeople) {
    val personA = peopleTopic.slice(i * (numberTopics+1), i * (numberTopics+1) + (numberTopics+1))

    for (j <- i+1 until numberPeople) {
      val personB = peopleTopic.slice(j * (numberTopics+1), j * (numberTopics+1) + (numberTopics+1))
      val together = binaryOr(personA, personB)
      if (together(numberTopics) == togetherMaxTopics) {
        togetherMaxTopicsCounter += 1
      }
      if (together(numberTopics) > togetherMaxTopics) {
        togetherMaxTopicsCounter = 1
        togetherMaxTopics = together(numberTopics)
      }
    }
  }

  println(togetherMaxTopicsCounter)
  println(togetherMaxTopics)
