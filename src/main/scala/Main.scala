import board._

object Main extends App {
  println("hello world!")

  var b: Board = Array(Array('.', '.', '.', '.', '.', '.'), Array('.', '.', '.', '.', '.', '.'),
    Array('.', '.', '.', '.', '.', '.'), Array('.', '.', '.', '.', '.', '.'),
    Array('.', '.', '.', '.', '.', '.'), Array('.', '.', '.', '.', '.', '.'))


  b(2)(1) = 'o'

  show(b)
}
