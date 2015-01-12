
val cuts: BigInt = "7".toInt

if (cuts % 2 == BigInt(0)) {
  println((cuts/2) * (cuts/2))
} else {
  println((cuts/2) * ((cuts/2) + 1))
}
