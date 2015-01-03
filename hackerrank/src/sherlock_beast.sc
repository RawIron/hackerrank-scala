
val digits: Int = "2".toInt

var fives: Int = (digits / 3) * 3
var threes: Int = digits % 3

while (threes % 5 != 0 && fives > 0) {
  fives -= 3
  threes = digits - fives
}


var solution: String = ""

if (threes % 5 == 0) {
  for (i <- 1 to fives) {
    solution += "5"
  }

  for (i <- 1 to threes) {
    solution += "3"
  }
} else {
  solution = "-1"
}

println(solution)
