import scala.io.Source

def getCurrentDirectory = new java.io.File( "." ).getCanonicalPath
println(getCurrentDirectory)

val tests = Source.fromFile("/home/achtmhz/workspace_scala/scalaScratchpad/hackerrank/src/test_is_fibo.txt")
var testNumbers: List[BigInt] = List()

for (test <- tests.getLines()) {
  testNumbers ::= BigInt(test)
}

val results = Source.fromFile("/home/achtmhz/workspace_scala/scalaScratchpad/hackerrank/src/test_is_fibo_result.txt")
var testResults: List[String] = List()

for (result <- results.getLines()) {
  testResults ::= result
}

println(testResults.length)
