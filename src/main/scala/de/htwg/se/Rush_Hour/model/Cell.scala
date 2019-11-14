package de.htwg.se.Rush_Hour.model

case class Cell(carID:Int){
  def isOcc: Boolean = carID > 0

  //override def toString: String = carID.toString.replace('0', ' ')
}
