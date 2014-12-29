
  def fibCount(end: BigInt): Array[BigInt] = {
    val fibs = new Array[BigInt](50)
    fibs(0) = 0
    fibs(1) = 1
    var j:Int = 1

    while(fibs(j) < end) {
      j += 1
      fibs(j) = fibs(j-2) + fibs(j-1)
    }

    fibs
  }

  val fibs = fibCount(10*1000000000)
  val tests = List[BigInt](32443434, 56*647674525, 44*44444444)

  for (t <- tests) {
    if (fibs.contains(t)) {
      println("IsFib")
    }
    else {
      println("IsNotFib")
    }
  }
