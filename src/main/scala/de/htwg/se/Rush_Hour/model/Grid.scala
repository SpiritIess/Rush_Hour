package de.htwg.se.Rush_Hour.model

import scala.math.sqrt

case class Grid(private val cells: Vector[Vector[Cell]]) {
  val std_size = 6
  val blocknum: Int = sqrt(std_size).toInt
  def this(size:Int) = this(Vector.tabulate(6,6){(row,col) => Cell(0)}) // does not support a field with custom length yet
  def cell(row:Int, col:Int):Cell = cells(row)(col)
  def isEmpty: Boolean = cells.forall(row => row.forall(col => !col.isOcc))
  def set(row:Int, col:Int, carID:Int):Grid = copy(cells.updated(row, cells(row).updated(col, Cell(carID))))

  //jedes mal wenn .set aufgerufen wird, wird neues grid erstellt..warum?
  def isSolved(): Boolean = ??? //cells(0)(0).carID == 1 funktioniert noch nicht(grund unklar)
  def moveCar(carID: Int, direction: Int): Grid = {
      Grid(cells) //gibt einfach derzeitiges grid mit derzeitigen cells zurück, damit die IDE nicht rummeckert
    /*direction match {
      case 1 => println(s"move car $carID one field upwards")// suche in cells nach 1. Cell mit carID
      case 2 => println(s"move car $carID one field to the right")
      case 3 => println(s"move car $carID one field downwards")
      case 4 => println(s"move car $carID one field to the left")
    }*/
  }
  override def toString: String = {
    val lineseparator = ("+-" + ("--" * blocknum)) * blocknum + "+\n"
    val line = ("| " + ("x " * blocknum)) * blocknum + "|\n"
    var box = "\n" + (lineseparator + (line * blocknum)) * blocknum + lineseparator
    for {
      row <- 0 until std_size
      col <- 0 until std_size
    } box = box.replaceFirst("x", cell(row, col).toString)
    box
  }
}
