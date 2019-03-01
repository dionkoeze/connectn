sealed trait CellState {
  def isEmpty: Boolean
  def isNotEmpty: Boolean = !isEmpty
  def character: String = "."
}


object Empty extends CellState {
  override def isEmpty: Boolean = true
}


object X extends CellState {
  override def isEmpty: Boolean = false
}


object O extends CellState {
  override def isEmpty: Boolean = false
}