
val boxes: Array[Int] = Array(45, 12, 4, 67, 2, 33)

val sortedBoxes: Array[Int] = boxes.sorted

val numberOfChildren: Int = 3
val numberOfBoxes: Int = boxes.length

var minDistance: Int = sortedBoxes(sortedBoxes.length-1) - sortedBoxes(0)
val interval = numberOfChildren - 1

for (idx <- interval until boxes.length) {
  val distance = sortedBoxes(idx) - sortedBoxes(idx-interval)
  if (distance < minDistance) {
    minDistance = distance
  }
}

println(minDistance)