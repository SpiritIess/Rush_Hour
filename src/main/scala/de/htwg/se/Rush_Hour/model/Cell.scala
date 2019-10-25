package de.htwg.se.Rush_Hour.model

case class Cell(value: Int) {
  def isEmpty : Boolean = value == 0
}
