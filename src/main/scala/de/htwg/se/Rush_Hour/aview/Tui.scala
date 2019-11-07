package de.htwg.se.Rush_Hour.aview
import de.htwg.se.Rush_Hour.model.{Grid,Cell,CellFill,Car}
import scala.util.Random

class Tui {

  def processInputLine(input: String):CellFill = {
    val statusNr = -1
    val randomStatusNr = scala.util.Random
    input match {
      case "r" => CellFill(randomStatusNr.nextInt(4) + 1,0,0)
      case "1" => CellFill(1,0,0)
      case "2" => CellFill(2,0,0)
      case "3" => CellFill(3,0,0)
      case "4" => CellFill(4,0,0)
      case "5" => CellFill(5,0,0)
    }
  }

}
