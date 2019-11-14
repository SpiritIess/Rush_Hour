package de.htwg.se.Rush_Hour.model
import de.htwg.se.Rush_Hour.model.Car
case class CellFill(statusnr:Int, x:Int, y:Int){
  val car1 = Car(2,1,1)
  val car2 = Car(2,2,2)
  val car3 = Car(3,1,3)
  val car4 = Car(3,2,4)
  val car5 = Car(2,1,5)
  val car6 = Car(2,1,6)
  val car7 = Car(2,2,7)
  val car8 = Car(3,1,8)
  val car9 = Car(2,1,9)
  val car10 = Car(3,1,10)
  val car11 = Car(2,1,11)
  val car12 = Car(2,2,12)
  val car13 = Car(2,2,13)
  val car14 = Car(3,2,14)
  val car15 = Car(2,1,15)
  val car16 = Car(3,2,16)
  val status1 = List(car1, car4, car7, car9, car15)
  val status2 = List(car1, car2, car5, car7, car10)
  val status3 = List(car1, car3, car4, car8, car13)
  val status4 = List(car1, car4, car7, car6, car12)
  val status5 = List(car1, car3, car10, car13, car14)
  val statusList = List(status1,status2,status3,status4,status5)

}

object CellFill {
  def cellFill(statusnr: Int, x: Int, y: Int): Cell = ??? //status + statusnr.toString()
  //Teil des Autos einfügen statusnr hochzählen

}
