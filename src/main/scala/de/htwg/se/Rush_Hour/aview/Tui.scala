package de.htwg.se.Rush_Hour.aview


import de.htwg.se.Rush_Hour.controller.Controller
import de.htwg.se.Rush_Hour.model.{Grid, Solver, GridCreator}
import de.htwg.se.Rush_Hour.util.Observer

class Tui(controller: Controller) extends Observer{

  controller.add(this)
  val size = 9
  val randomCells:Int = size*size/4

  def processInputLine(input: String):Unit = {
    input match {
      case "q" =>
      case "n"=> controller.createEmptyGrid(size)
      case "r" => controller.createRandomGrid(size, randomCells)
      case "s" =>
        val success= controller.solve
        if (success) println("Puzzle solved")else println("This puzzle could not be solved!")
      case _ => input.toList.filter(c => c != ' ').map(c => c.toString.toInt) match {
        case row :: column :: value :: Nil => controller.set(row, column, value)
        case _ =>
      }

    }
  }

  override def update: Unit =  println(controller.gridToString)
}
