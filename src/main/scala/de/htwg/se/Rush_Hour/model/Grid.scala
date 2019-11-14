package de.htwg.se.Rush_Hour.model

import de.htwg.se.Rush_Hour.model.{Cell,Player,CellFill}
case class Grid(statusnr:Int) {
  val rows = 6
  val columns = 6
  var cellArray = Array.ofDim[Cell](rows,columns)

  //def cellFill(statusnr:Int,x:Int,y:Int): Cell = new Car(length,alignment,carValue)

  for(x<-0 to rows; y<-0 until columns){
    cellArray(x)(y) = CellFill.cellFill(statusnr,x,y)
  }
}
