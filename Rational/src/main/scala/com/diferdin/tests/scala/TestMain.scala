package com.diferdin.tests.scala

/**
  * Created by LONADF on 03/06/2016.
  */
object TestMain {
  def main(args: Array[String]): Unit = {
    val rational = new Rational(1, 2)
    val addendum = new Rational(2, 3)
    println(rational add addendum)
  }
}
