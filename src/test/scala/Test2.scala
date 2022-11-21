import play.api.libs.ws._

object Test2 extends org.specs2.mutable.Specification:

  "body" should {
    "be the right body call" in {
      val r: StandaloneWSRequest#Response = ???
      r.body must ===("")
    }
  }

