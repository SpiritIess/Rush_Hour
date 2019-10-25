package de.htwg.se.Rush_Hour.model

import org.scalatest._
class CarSpec extends WordSpec with Matchers{
  "A Car" when {
    "not set to any value" should {
      val emptyCar = Car(0, 0, 0)
      "not be set" in {
        emptyCar.isSet should be(false)
      }
      "have length 0" in {
        emptyCar.length should be (0)
      }
      "have alignmen 0" in {
        emptyCar.alignment should be (0)
      }
      "have value 0" in {
        emptyCar.carValue should be (0)
      }
    }
    "A Car" when {
      "set correctly" should {
        val correctCar = Car(1, 1, 2)
        "be set" in{
          correctCar.isSet should be(true)
        }
        "have a length" in {
          correctCar.length should be(1)
        }
        "have an Alignment" in {
          correctCar.alignment should be(1)
        }
        "have a Value" in {
          correctCar.carValue should be(2)
        }
      }
    }
    "A Car" when {
      "length is set incorrectly" should {
        val incorrectCarlength = Car(0, 1, 2)
        "not be set" in{
          incorrectCarlength.isSet should be(false)
        }
        "have a length" in {
          incorrectCarlength.length should be(0)
        }
        "have an Alignment" in {
          incorrectCarlength.alignment should be(1)
        }
        "have a Value" in {
          incorrectCarlength.carValue should be(2)
        }
      }
    }
    "A Car" when {
      "alignment is set incorrectly" should {
        val incorrectCaralignlow = Car(1,0,2)
        val incorrectCaralignhigh = Car(1,3,2)
        "not be set" in{
          incorrectCaralignlow.isSet should be(false)
          incorrectCaralignhigh.isSet should be(false)
        }
        "have a length" in {
          incorrectCaralignlow.length should be(0)
          incorrectCaralignhigh.length should be(0)
        }
        "have an Alignment" in {
          incorrectCaralignlow.alignment should be(0)
          incorrectCaralignhigh.alignment should be(3)
        }
        "have a Value" in {
          incorrectCaralignlow.carValue should be(2)
          incorrectCaralignhigh.carValue should be(2)
        }
      }
    }
  }
}
