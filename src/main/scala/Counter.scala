
class Counter {


  private var count = 0

  def inc(): Unit =
    count += 1

  def value(): Int =
    count
}