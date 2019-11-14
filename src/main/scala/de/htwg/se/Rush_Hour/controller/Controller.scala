package de.htwg.se.Rush_Hour.controller

class Controller {
  def createEmptyGrid(size: Int):Unit = {
    grid = new Grid(size)
    notifyObservers
  }

  def createRandomGrid(size: Int, randomCells:Int):Unit = {
    grid = new GridCreator(size).createRandom(randomCells)
    notifyObservers
  }

  def gridToString: String = grid.toString

  def set(row: Int, col: Int, value: Int):Unit = {
    grid = grid.set(row, col, value)
    notifyObservers
  }

  def solve: Boolean = {

    val (success, g) = new Solver(grid).solve
    grid = g
    notifyObservers
    success
  }
}
