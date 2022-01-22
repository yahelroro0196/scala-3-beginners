package com.rockthejvm.part1basics

object CBNvsCBV {
  // CBV = call by value = arguments are evaluated before function invocation
  def aFunction(arg: Int): Int = arg + 1

  def aComputation = aFunction(23 + 67)

  // CBN = call by name = arguments are passed LITERALLY
  def aByNameFunction(arg: => Int): Int = arg + 1
  def anotherComputation = aByNameFunction(23 + 67)

  def main(args: Array[String]): Unit = {
    println(aComputation)
    println(anotherComputation)
  }
}
