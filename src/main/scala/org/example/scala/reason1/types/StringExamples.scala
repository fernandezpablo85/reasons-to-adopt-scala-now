package org.example.scala.reason1.types

import java.lang.{String => JavaString}

trait StringExamples
{
  println("=> Running StringExamples")

  val stringsJava = new JavaClass

  // String literals are an exception. It defaults to java.lang.String.
  val string = "hello world"
  assert(string.isInstanceOf[JavaString])

  // No need for coercion here.
  stringsJava.setString(string)

  // Scala auto converts (using implicit conversions) to StringOps to add some useful methods of it's own.
  assert(string.reverse == "dlrow olleh")
  
  // Note that this doesn't change the string type.
  assert(string.isInstanceOf[JavaString])
  assert(string.reverse.isInstanceOf[JavaString])
  stringsJava.setString(string.reverse)
  
  /* 
   * More great stuff available on StringOps:
   * (check the full list at: http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.StringOps)
   */

  // Access single chars of the string with an array like syntax.
  assert('h' == string(0))

  // NOTE that it returns Characters not Strings.
  assert("h" != string(0))

  // Use diff to get the differences between two strings.
  assert(string.diff("hello ") == "world")

  // mkString is like join()
  assert("abcd".mkString(",") == "a,b,c,d")

  // Scala also supports three quote strings, that allow any character (like quotes or slashes) without escaping.
  // They also support multiple lines.
  val threeQuote = """this is my "long" string, it's cool uh?"""
  val markup = """
<div class='%s'>
  <span>Hello my friend '%s'</span>
</div>"""
  // println(String.format(markup, "greet", "Pablo"))

  
}
