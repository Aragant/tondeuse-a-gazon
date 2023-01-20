import better.files._

object Input {
  final def readLines(path: String): List[String] = {
    val file = File(path)
    file.lines.toList
  }
}