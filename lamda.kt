package com.example.myapplication



    //Lamda
    //람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
    //1) 메소드의 파라미터로 넘겨줄수가 있다. fun maxBy(a : Int)
    //2) return 값으로 사용할 수가 있다.

    // 람다의 기본 정의
    //val lamdaName : Type = {argumentList -> codeBody}
    //타입 추론 이 가능함
    //(int) ->(int) 둘중 한곳에는 타입을 선언해주어야함
val square : (Int) -> (Int) ={number ->number*number}

val nameAge  = {name :String, age:Int ->
    "my name is ${name} I'm ${age}"
}

fun main(){
    println(square(12))
    println(nameAge("Jeong",26))
    val a ="Jeong said"
    val b = "mac said"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("Byeon",  25))
    println(calculateGrade(500))

    val lamda = {number : Double ->
        number == 4.3213
    }
    println(invokeLamda(lamda))
    println(invokeLamda({it >3.22}))
    println(invokeLamda { it >3.22 })
    //람다의 파라미터가 마지막일경우 ()중괄호 생략 가능
}

//확장 함수

val pizzaIsGreat : String.() -> String= {
    this + "Pizza is the best"
}

fun extendString(name:String , age :Int ): String {
    //this 는 extendString 을 부르는 녀석을 말함 it 은 밑의 String(Int) 를 반환
    val introduceMyself : String.(Int) -> String ={"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

//람다의 Return
//입력값은 여러개 임으로 () 괄호로 묶어야하고 반환형태는 한개이기 때문에 안묶어도됨
val calculateGrade: (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 70..100 -> "perfect"
        else -> "Error"
    }
}

//람다를 표현하는 여러가지 방법

fun invokeLamda(lamda : (Double) -> Boolean) :Boolean{
    return lamda(5.2343)

}


