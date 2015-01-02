val stones: Int = 4
val a: Int = 2
val b: Int = 1

var sums: Set[Int] = Set.empty

for (i <- 0 to stones-1) {
  sums += (i * a) + (stones - 1 - i) * b
}

sums.toList.sorted.foreach(x => print(x + " "))
