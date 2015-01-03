
val digits: Int = "588".toInt

var fives: Int = (digits / 3) * 3
var threes: Int = digits % 3

while (threes % 5 != 0 && fives > 0) {
  fives -= 3
  threes = digits - fives
}


val solution: StringBuilder = new StringBuilder()

if (threes % 5 == 0) {
  for (i <- 1 to fives) {
    solution.append("5")
  }

  for (i <- 1 to threes) {
    solution.append("3")
  }
} else {
  solution.append("-1")
}

println(solution.toString())
