package de.htwg.se.Rush_Hour.model

case class Cell(x:Int,y:Int,carValue:Int){
  def isSet: Boolean = x != 0 && y != 0
  def isOcc: Boolean = carValue > 0
}
