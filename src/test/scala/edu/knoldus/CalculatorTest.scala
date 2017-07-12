package edu.knoldus

import org.scalatest.FunSuite

class CalculatorTest extends FunSuite {

  val cal = new Calculator()

  test("Testing Addition"){
    assert(cal.add(2,3) === 5)
  }

  test("Testing Subtraction"){
    assert(cal.subtract(2,5) === -3)
  }

  test("Testing Multiplication"){
    assert(cal.multiply(2,3) === 6)
  }

  test("Testing Division with b not equalto 0"){
    assert(cal.divide(2,5) === 0)
  }

  test("Testing Division with 0"){
    intercept[java.lang.IllegalArgumentException] {
    cal.divide(2,0)
    }
  }
  test("Testing Power with < 0"){
      assert(cal.power(2,-1)===0.5)
      }

  test("Testing Power with 0"){
    assert(cal.power(2,0) === 1)
  }

  test("Testing Power with positive n "){
    assert(cal.power(2,3) === 8)
  }

  test("Testing Modulo"){
    assert(cal.modulus(21,5) === 1)
  }

  test("Testing Absolute Positive "){
    assert(cal.absolute(2) === 2)
  }

  test("Testing Absolute Negative"){
    assert(cal.absolute(-2) === 2)
  }

  test("Testing Max Two,Second is max"){
    assert(cal.maxTwo(2,3) === 3)
  }

  test("Testing Max Two First is max"){
    assert(cal.maxTwo(3,2) === 3)
  }

  test("Testing Min Two First is small"){
    assert(cal.minTwo(2,3) === 2)
  }

  test("Testing Min Two Second is Small"){
    assert(cal.minTwo(3,2) === 2)
  }

}
