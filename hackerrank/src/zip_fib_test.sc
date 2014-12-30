import scala.io.Source

def getCurrentDirectory = new java.io.File( "." ).getCanonicalPath
println(getCurrentDirectory)


val tests = Source.fromFile("/home/achtmhz/workspace_scala/scalaScratchpad/hackerrank/src/test_is_fibo.txt").getLines()
var testNumbers: List[BigInt] = List()

tests.next()
for (test <- tests) {
  testNumbers ::= BigInt(test)
}


val results = Source.fromFile("/home/achtmhz/workspace_scala/scalaScratchpad/hackerrank/src/test_is_fibo_result.txt")
var testResults: List[String] = List()

for (result <- results.getLines()) {
  testResults ::= result
}

println(testResults.length)


val combined: List[(BigInt, String)] = testNumbers.zip(testResults)
println(combined.length)

val onlyFibo = combined.filter(_._2 == "IsFibo")
println(onlyFibo.length)
for (fib <- onlyFibo) {
  println(fib._1)
}