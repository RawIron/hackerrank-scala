/**
 * A "Pearson Correlation Score" algorithm, written in Scala,
 * based on the Python example in the book, "Collective Intelligence."
 */
object PearsonCorrelationScore {

  //todo this may consume a lot of ram for a big data set
  def commonMapKeys[A, B](a: Map[A, B], b: Map[A, B]): Set[A] = a.keySet.intersect(b.keySet)

  /**
   * Calculate the Pearson Correlation Score for two Maps of movie reviewer data.
   */
  def pearsonCorrelationScore(
                               p1MovieRatings: Map[String, Double],
                               p2MovieRatings: Map[String, Double]): Option[Double] = {

    // find the movies common to both reviewers
    val listOfCommonMovies = commonMapKeys(p1MovieRatings, p2MovieRatings).toSeq
    val n = listOfCommonMovies.size
    if (n == 0) return None

    // reduce the maps to only the movies both reviewers have seen
    val p1CommonMovieRatings = p1MovieRatings.filterKeys(movie => listOfCommonMovies.contains(movie))
    val p2CommonMovieRatings = p2MovieRatings.filterKeys(movie => listOfCommonMovies.contains(movie))

    // add up all the preferences
    val sum1 = p1CommonMovieRatings.values.sum
    val sum2 = p2CommonMovieRatings.values.sum

    // sum up the squares
    val sum1Sq = p1CommonMovieRatings.values.foldLeft(0.0)(_ + Math.pow(_, 2))
    val sum2Sq = p2CommonMovieRatings.values.foldLeft(0.0)(_ + Math.pow(_, 2))

    // sum up the products
    val pSum = listOfCommonMovies.foldLeft(0.0)((accum, element) => accum + p1CommonMovieRatings(element) * p2CommonMovieRatings(element))

    // calculate the pearson score
    val numerator = pSum - (sum1*sum2/n)
    val denominator = Math.sqrt( (sum1Sq-Math.pow(sum1,2)/n) * (sum2Sq-Math.pow(sum2,2)/n))
    if (denominator == 0) None else Some(numerator/denominator)
  }

  def main(args: Array[String]) {
    println("Rose/Seymour distance: " + pearsonCorrelationScore(Critics.critics("Lisa Rose"), Critics.critics("Gene Seymour")))
  }

}


object Critics {

  val lisaRose = Map(
    "Lady in the Water"  -> 2.5,
    "Snakes on a Plane"  -> 3.5,
    "Just My Luck"       -> 3.0,
    "Superman Returns"   -> 3.5,
    "You, Me and Dupree" -> 2.5,
    "The Night Listener" -> 3.0)

  val geneSeymour = Map(
    "Lady in the Water"  -> 3.0,
    "Snakes on a Plane"  -> 3.5,
    "Just My Luck"       -> 1.5,
    "Superman Returns"   -> 5.0,
    "The Night Listener" -> 3.0,
    "You, Me and Dupree" -> 3.5)

  val michaelPhillips = Map(
    "Lady in the Water"  -> 2.5,
    "Snakes on a Plane"  -> 3.0,
    "Superman Returns"   -> 3.5,
    "The Night Listener" -> 4.0)

  val claudiaPuig = Map(
    "Snakes on a Plane"  -> 3.5,
    "Just My Luck"       -> 3.0,
    "The Night Listener" -> 4.5,
    "Superman Returns"   -> 4.0,
    "You, Me and Dupree" -> 2.5)

  val mickLaSalle = Map(
    "Lady in the Water"  -> 3.0,
    "Snakes on a Plane"  -> 4.0,
    "Just My Luck"       -> 2.0,
    "Superman Returns"   -> 3.0,
    "The Night Listener" -> 3.0,
    "You, Me and Dupree" -> 2.0)

  val jackMatthews = Map(
    "Lady in the Water"  -> 3.0,
    "Snakes on a Plane"  -> 4.0,
    "The Night Listener" -> 3.0,
    "Superman Returns"   -> 5.0,
    "You, Me and Dupree" -> 3.5)

  val toby = Map(
    "Snakes on a Plane"  -> 4.5,
    "You, Me and Dupree" -> 1.0,
    "Superman Returns"   -> 4.0)

  val critics = Map(
    "Lisa Rose"        -> lisaRose,
    "Gene Seymour"     -> geneSeymour,
    "Michael Phillips" -> michaelPhillips,
    "Claudia Puig"     -> claudiaPuig,
    "Mick LaSalle"     -> mickLaSalle,
    "Jack Matthews"    -> jackMatthews,
    "Toby"             -> toby
  )
}