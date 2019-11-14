package de.htwg.se.Rush_Hour.model
import de.htwg.se.Rush_Hour.model.Grid

case class Game(){
  //val list1 = List(gamestates
  def createGame(level:Int):Grid = fillGrid(level)
  def newGame():Grid = {
    println("Bitte Level eingeben: ")
    val lvl = scala.io.StdIn.readLine.toInt
    createGame(lvl)
  }
  val game1 = new Grid(6)
  def fillGrid(level:Int) :Grid =
    level match {
      //erstelle einfaches grid und füge ein paar autos ein:
      case 0 => new Grid(10)
      case _ =>
        game1.set(0, 2, 3)
        game1.set(0, 3, 3)
        game1.set(1, 1, 2)
        game1.set(2, 1, 2)
        game1.set(1, 2, 1)
        game1.set(2, 2, 1)
        game1.set(3, 3, 4)
        game1.set(3, 4, 4)
        game1.set(5, 3, 5)
        game1.set(5, 4, 5)
        game1.set(3, 0, 13)
        game1.set(3, 1, 13)
        game1.set(3, 2, 13)
        game1.set(5, 1, 14)
        game1.set(5, 2, 14)
        game1.set(5, 3, 14)
        game1.set(2, 3, 15)
        game1.set(2, 4, 15)
        game1.set(2, 5, 15)
    }
}
