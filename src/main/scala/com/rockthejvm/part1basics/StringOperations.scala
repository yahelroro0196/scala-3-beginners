package com.rockthejvm.part1basics

object StringOperations {

  val age = 20
  val name = "Yahel"

  //s-interpolation
  val greeting = "Hello, I'm " + name + " and I am " + age + " years old."
  val betterGreeting = s"Hello I'm $name and I am $age years old."

  // f-interpolation
  val speed = 1.2
  val myth = f"$name can eat $speed%2.10f burgers per minute."

  // raw-interpolation
  val normal_escapes = "This is a \n newline"
  val escapes = raw"this is a \n newline"

  def main(args: Array[String]): Unit = {
    println(greeting)
    println(betterGreeting)
    println(myth)
    println(normal_escapes)
    println(escapes)
  }
}
