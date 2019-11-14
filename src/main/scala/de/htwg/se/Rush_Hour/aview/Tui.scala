package de.htwg.se.Rush_Hour.aview
import de.htwg.se.Rush_Hour.model.{Cell,Grid,Car,Game}

class Tui {



  def processInputLine(grid: Grid, input: String):Grid = { //man gibt das derzeitige level(speicherstand)
    // , den move und das auto auf das der move ausgeführt werden soll
    def toInt(s: String): Int = {
      try {
        s.toInt
      } catch {
        case e: Exception => 0
      }
    }

    val r = scala.util.Random
    val carID: Int = toInt(input)
    input match {
      case "r" => Game().createGame(r.nextInt)
      case "n" => Game().newGame()
      case "e" => Game().createGame(0) //grid filled with cells with value 0
      //ab hier tut sich nichts
      //case "c" => grid.isSolved //(check if solved)
      case "w" => grid.moveCar(carID, 1) // 1= hoch 2= rechts 3= unten 4=links
      case "a" => grid.moveCar(carID, 4)
      case "s" => grid.moveCar(carID, 3)
      case "d" => grid.moveCar(carID, 2)
      case _ => {
        input.toList.filter(c => c != ' ').map(c => c.toString.toInt) match {
          case row :: column :: value :: Nil => grid.set(row, column, carID)
          case _ => grid


        }
      }
    }
  }


}
