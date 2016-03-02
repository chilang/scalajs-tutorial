package tutorial.webapp

import org.scalatest.FunSuite


import org.scalajs.jquery.jQuery

class TutorialTest extends FunSuite {

  TutorialApp.setupUI()

  test("HelloWorld") {
    assert(jQuery("p:contains('Hello World')").length == 1)
  }

  test("ButtonClick") {
    def messageCount =
      jQuery("p:contains('You clicked the button!')").length

    val button = jQuery("button:contains('Click me!')")
    assert(button.length == 1)
    assert(messageCount == 0)

    for (c <- 1 to 5) {
      button.click()
      assert(messageCount == c)
    }
  }
}
