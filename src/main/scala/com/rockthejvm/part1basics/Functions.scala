package com.rockthejvm.part1basics

object Functions {
  // function = a reusable piece of code that you can invoke with some arguments and return a result
  def aFunction(a: String, b: Int): String =
    a + " " + b // ONE Expression

  // function invocation
  val aFunctionInvocation = aFunction("Scala", 999999)

  def aNotArgFunction(): Int = 45

  def aParamterlessFunction: Int = 45

  //functions can be recursive
  def stringConcat(str: String, n: Int): String = {
    if (n == 0) ""
    else if (n == 1) str
    else str + " " + stringConcat(str, n - 1)
  }

  def aVoidFunction(aString: String): Unit =
    print(aString)

  def computeDoubleStringwWithSideEffect(aString: String): String = {
    aVoidFunction(aString) // Unit
    aString + aString // meaningful value
  } // discouraging side effects

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n + 1)
  }

  def factorial(n: Int): Int = {
    if (n == 1) 1
    else n * factorial(n - 1)
  }

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  def main(args: Array[String]): Unit = {
    val scalax3 = stringConcat("Scala", 3)
    println(scalax3)
  }
}
