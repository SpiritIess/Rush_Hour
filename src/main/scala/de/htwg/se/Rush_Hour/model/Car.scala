package de.htwg.se.Rush_Hour.model

case class Car(carID: Int){
  def isSet: Boolean = carID > 0
}
