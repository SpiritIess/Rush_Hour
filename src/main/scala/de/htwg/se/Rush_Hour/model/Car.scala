package de.htwg.se.Rush_Hour.model

case class Car(length:Int, alignment: Int, carValue: Int){
  def isSet: Boolean = length !=0 && alignment < 3 && alignment > 0 && carValue !=0
}
