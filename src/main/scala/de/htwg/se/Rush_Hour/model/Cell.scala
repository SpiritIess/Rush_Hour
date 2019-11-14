package de.htwg.se.Rush_Hour.model

case class Cell(carID:Int){
  def isOcc: Boolean = carID > 0
}
