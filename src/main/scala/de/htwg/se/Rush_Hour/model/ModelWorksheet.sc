object printProject {
  println("Project: Rush_Hour")
}

case class Cell(x:Int,y:Int,car:Car){
  println("Cell was created")
  def occ: Car = car
}
case class Car(length:Int, alignment: Int, value: Int){
  def getLength: Int = length
  def getAlignment: Int = alignment //1=horizontal 2=vertical
  def getValue: Int = value
}
val car1 = Car(3,1,1)
car1.getLength
car1.getAlignment
val car2 = Car(2,2,2)

val cell11 =Cell(1,1,car1)
val cell12 =Cell(1,2,car1)
val cell52 =Cell(5,2,car2)

cell12.occ
cell11.occ

