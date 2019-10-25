package de.htwg.se.Rush_Hour.model

case class Car(length:Int, alignment: Int, carValue: Int){
  def isSet: Boolean = length !=0 && alignment <3 && alignment > 0 && carValue !=0
  def getLength: Int = length
  def getAlignment: Int = alignment //1=horizontal 2=vertical
  def getValue: Int = carValue
}
