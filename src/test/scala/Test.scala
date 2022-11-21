import play.api.libs.ws._

object Test extends org.specs2.mutable.Specification:

  "body" should {
    "be the right body call" in {
      val r: StandaloneWSRequest#Response = ???
      val body = r.body
      body must ===("")
    }
  }

