
val names = List("Her", "Jar")

names.filter(_.startsWith("J")).foreach(println)


/*
 *  exists one element that is in both sets?
 */

val a: Set[Int] = Set(1,3)
val b: Set[Int] = Set(4,5)

implicit def pimp(n:Int) = new { def ! = (1 /: (1 to n)) ( _ * _ ) }

println((2+4)!)