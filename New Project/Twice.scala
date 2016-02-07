object Twice {
  def apply(x: Int): Int = x * 2
  def unapply(z: Int): Option[Int] = if (z%2 == 0) Some(z/2) else None
}

object TwiceTest extends App {
  val x = 20 // Twice(5)
  println(x)
  x match { case Twice(n) => println(n) }
}