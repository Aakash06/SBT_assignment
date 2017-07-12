package edu.knoldus

class Calculator {

  def add(a:Int,b:Int):Int={
    a + b
  }

  def subtract(a:Int,b:Int):Int={
    a - b
  }

  def multiply(a:Int,b:Int):Int={
    a * b
  }

  def divide(a:Int,b:Int):Int={
    require(b!=0)
    a / b
  }

  def power(a:Int,b:Int):Double={
    if (b<0)
      { power(a,b + 1)/a.toDouble }
    else if (b==0)
      {1}
    else
      { a*power(a,b-1) }
  }

  def modulus(a:Int,b:Int):Int={
    a%b
  }

  def absolute(a:Int):Int={
    if(a<0)
      {-1*a}
    else
      {a}
  }

  def maxTwo(a:Int,b:Int):Int={
    if(a>b)
      {a}
    else
      {b}
      }

  def minTwo(a:Int,b:Int):Int={
    if(a<b) a else b
      }

}
