package de.htwg.se.Rush_Hour.model
import org.scalatest.{Matchers, WordSpec}

class GridSpec extends WordSpec with Matchers{
  "A Grid is the board of RushHour. A Grid" when {
    "to be constructed" should {
      "be created with the size 6x6." in {
        val normalGrid = new Grid(1)
      }
    }
  }
}
