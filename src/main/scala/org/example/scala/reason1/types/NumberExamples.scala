package org.example.scala.reason1.types

trait NumberExamples
{
  println("=> Running NumberExamples")

  // Freely instantiate java classes.
  val numbersJava = new JavaClass

  // By default, scala uses it's own types for numeric literals, like "Int".
  val one = 1
  assert(one.isInstanceOf[Int])

  // But it coerces them to the appropiate java types if needed.
  numbersJava.setNativeInteger(one)
  numbersJava.setInteger(one)

  // Numbers will auto convert to RichInt to use some neat extra functions.
  // Check them out at: http://www.scala-lang.org/api/current/index.html#scala.runtime.RichInt

  // Getting hex strings.
  assert(10.toHexString == "a")

  // Getting binary strings.
  assert(2.toBinaryString == "10")

  // For loops are actually iterations over a Range object, created by a 'to' method.
  for (i <- 1 to 20)
  {
    // do something 20 times with 'i'.
  }
}