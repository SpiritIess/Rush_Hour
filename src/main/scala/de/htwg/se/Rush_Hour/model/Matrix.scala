package de.htwg.se.Rush_Hour.model

case class Matrix(cells: Vector[Vector[Cell]]) {
  def this(size: Int) = this(Vector.tabulate(size, size) { (row, col) => Cell(0)})

  val size: Int = cells.size

  def cell(row: Int, col: Int): Cell = cells(row)(col)

  def fill(filling: Cell): Matrix = copy(Vector.tabulate(size, size) { (row, col) => filling })

  //def replaceCell(row: Int, col: Int, carID: Int): Matrix = copy(cells.updated(row, cells(row).updated(col, cells)))
}
