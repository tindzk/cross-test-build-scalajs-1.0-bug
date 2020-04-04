package hello

object Hello {
  def greet(name: String): String = {
    s"Hello, $name!"
  }

}

object App {
  def main(args: Array[String]): Unit = {
    println(Hello.greet("world"))
  }
}
