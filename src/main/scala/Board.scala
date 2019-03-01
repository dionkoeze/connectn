import coord._

package object board {

  type Line = Array[Char]
  type Board = Array[Line]

  def show_line(line: Line) = {
    println(line.fold("")(_.toString + _.toString))
  }

  def show(board: Board) = {
    board.foreach {show_line(_)}
  }

//  def win_check(board: Board, idx: (Int, Int), next: Unit => (Int, Int): (Boolean, Char) = {
//
//  }
//
//  def win_state(board: Board): (Boolean, Char) = {
//
//  }
}

