package de.htwg.se.Rush_Hour.model

case class Cell(carID: Int){
  def isSet: Boolean = carID > 0
}
