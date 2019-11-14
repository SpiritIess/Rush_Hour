object printProject {
  println("Project: Rush_Hour")
}
printProject

case class Cell(carID:Int){
  def isOcc: Boolean = carID > 0

}
case class Car(length:Int, align: Int, carID: Int){
  def isLength1 : Boolean = length ==1
  def isSet: Boolean = length !=0 && align < 3 && align > 0 && carID > 0 //align= 1 -> herizontal 2-> vertikal
}

val car1 = Car(2,1,1)
val car2 = Car(1,2,1)

val cell11 =Cell(1)
val cell12 =Cell(1)
val cell52 =Cell(5)

cell11.isOcc

case class Grid(val cells: Vector[Vector[Cell]]) {
  val std_size = 6
  def this(size:Int) = this(Vector.tabulate(6,6){(row,col) => Cell(0)}) // does not support a field with custom length yet
  def cell(row:Int, col:Int):Cell = cells(row)(col)
  def isEmpty: Boolean = cells.forall(row => row.forall(col => !col.isOcc))
  def set(row:Int, col:Int, carID:Int):Grid = copy(cells.updated(row, cells(row).updated(col, Cell(carID))))//jedes mal wenn .set aufgerufen wird, wird neues grid erstellt..warum?
  //funktioniert noch nicht: def isSolved(): Boolean = cells(0)(0).carID == 1
}

val grid1 = new Grid(5)
grid1.set(0,0,1)

