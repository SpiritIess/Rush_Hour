package de.htwg.se.Rush_Hour

import de.htwg.se.Rush_Hour.model.{Car,Cell,Game,Grid,Player}
import de.htwg.se.Rush_Hour.aview.Tui

import scala.io.StdIn.readLine

object Rush_Hour {
  var grid = new Grid(6) //which int is give as parameter doesn't matter yet
  val tui = new Tui
  def main(args: Array[String]): Unit = {
    val student = Player("Jakob Strakhof")
    println("Hello, " + student.name)
    var input: String = ""
    var IDInput: Int = 0
    do{
      println("Grid : " + grid.toString)
      input = readLine()
      grid = tui.processInputLine(grid,input)
    } while (input != "q")
  }
}
