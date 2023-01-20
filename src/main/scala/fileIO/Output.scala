import better.files._

object Output {
  final def writeLines(path: String, lines: List[String]): Unit = {
    val file = File(path)
    file.overwrite(lines.mkString(""))
  } 
}
