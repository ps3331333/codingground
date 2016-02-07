object HelloWorld extends App {

  def test() = {
    val numbs = List ((1,1,1),(2,2,2),(3,3,3))
    val a = for {
      i <- numbs
      j <- List(i._1, i._2, i._3)
    } yield j
    println(a)
  }

  test()

}
