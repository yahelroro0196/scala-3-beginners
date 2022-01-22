package com.rockthejvm.part1basics

import scala.annotation.tailrec

object Recursion {
  def sumUntil(n: Int): Int = {
    if (n <= 0) 0
    else n + sumUntil(n - 1)
  }

  def sumUntil_v2(n: Int): Int = {
    @tailrec
    def sumUntilTailrec(x: Int, accumulator: Int): Int =
      if (x <= 0) accumulator
      else sumUntilTailrec(x - 1, accumulator + x) // TAIL recursion = recursive call occurs LAST in its code path
    // no further stack frames necessary = no more rish of Stack Overflow

    sumUntilTailrec(n, 0)
  }


  def fibonacci(n: Int): Int = {
    @tailrec
    def fibonacciTailrec(i: Int, last: Int, previous: Int): Int =
      if (i >= n) last
      else fibonacciTailrec(i + 1, last + previous, last)

    if (n <= 2) 1
    else fibonacciTailrec(2, 1, 1)
  }

  def main(args: Array[String]): Unit = {
    println(fibonacci(4))
  }
}
