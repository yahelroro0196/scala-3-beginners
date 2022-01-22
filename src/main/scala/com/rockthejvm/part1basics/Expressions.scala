package com.rockthejvm.part1basics

object Expressions {
  val aCondition = true
  val anIfExpression = if (aCondition) 45 else 99

  val aCodeBlock = {
    val localValue = 78 == 2

    /* "return" */ !localValue
  }

  // everything is an expression

  val printExpression: Unit = println("Scala")
  val theUnit: Unit = ()

  def main(args: Array[String]): Unit = {
    println(aCodeBlock)
    println(printExpression)
  }
}
