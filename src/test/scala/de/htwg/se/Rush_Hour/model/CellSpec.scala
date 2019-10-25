package de.htwg.se.Rush_Hour.model

import org.scalatest._
class CellSpec extends WordSpec with Matchers{
  "A Cell" when {
    "not set to any value" should{
      val emptyCell = Cell(0,0,0)
      "have x-value 0" in {
        emptyCell.x should be (0)
        emptyCell.getX should be (0)
      }
      "have y-value 0" in {
        emptyCell.y should be (0)
        emptyCell.getY should be (0)
      }
      "have car-value 0" in{
        emptyCell.carValue should be (0)
        emptyCell.getOcc should be (0)
      }
      "not be occupied" in {
        emptyCell.isOcc should be (false)
      }
      "not be set" in {
        emptyCell.isSet should be (false)
      }
    }
    "set at a specific location(1,1) without being occupied by a car" should{
      val correctCell_noCar = Cell(1,1,0)
      "have x-value 1" in{
        correctCell_noCar.x should be (1)
        correctCell_noCar.getX should be (1)
      }
      "have y-value 1" in {
        correctCell_noCar.y should be (1)
        correctCell_noCar.getY should be (1)
      }
      "have car-value 0" in{
        correctCell_noCar.carValue should be (0)
        correctCell_noCar.getOcc should be (0)
      }
      "not be occupied" in{
        correctCell_noCar.isOcc should be (false)
      }
      "be set" in{
        correctCell_noCar.isSet should be (true)
      }
    }
    "set at a specific location(1,1) and being occupied by a car(1)" should{
      val correcCell_withCar = Cell(1,1,1)
      "have x-value 1" in{
        correcCell_withCar.x should be (1)
        correcCell_withCar.getX should be (1)
      }
      "have y-value 1" in {
        correcCell_withCar.y should be (1)
        correcCell_withCar.getY should be (1)
      }
      "have car-value 0" in{
        correcCell_withCar.carValue should be (1)
        correcCell_withCar.getOcc should be (1)
      }
      "not be occupied" in{
        correcCell_withCar.isOcc should be (true)
      }
      "be set" in{
        correcCell_withCar.isSet should be (true)
      }
    }
  }

}
