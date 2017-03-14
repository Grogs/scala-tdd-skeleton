import org.scalatest.{FunSuite, Matchers}

class CounterSpec extends FunSuite with Matchers {

  test("Starts at 0") {

    val counter = new Counter

    counter.value() shouldBe 0
  }

  test("Increment works") {

    val counter = new Counter

    for(i <- 1 to 5)
      counter.inc()

    counter.value() shouldBe 5
  }
}