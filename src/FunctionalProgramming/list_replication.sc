def f(num:Int, arr:List[Int]) : List[Int] = {
  if (num>1) f(num-1, arr ++ arr.toSet)
  else arr.sorted
}

f(3, List(1,2,3))