object printProject {
  println("Project: Rush_Hour")
}
printProject

case class Cell(x:Int,y:Int,carValue:Int){
  def getX: Int = x
  def getY: Int = y
  def getOcc: Int = carValue
  def isSet: Boolean = x != 0 && y != 0
  def isOcc: Boolean = carValue > 0

}
case class Car(length:Int, alignment: Int, carValue: Int){
  def isSet: Boolean = length !=0 && alignment < 3 && alignment > 0 && carValue !=0
  def getLength: Int = length
  def getAlignment: Int = alignment //1=horizontal 2=vertical
  def getValue: Int = carValue
}
val car1 = Car(3,1,1)
car1.getLength
car1.getAlignment
val car2 = Car(2,2,2)

val cell11 =Cell(1,1,1)
val cell12 =Cell(1,2,1)
val cell52 =Cell(5,2,2)

cell12.getOcc
cell11.isOcc

