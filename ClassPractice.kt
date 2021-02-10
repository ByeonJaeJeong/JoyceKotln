package com.example.myapplication
//코틀린은 파일명이랑 클래스명이랑 같을필요는 없다
open class Human (name:String="Anonymous"){ //옆에 값을 줌으로써 default 값을 줄수있음
    //코틀린의 생성자 는 클래스 옆에 constructor 를 이용해 사용(생략도 가능)
    //코틀린은 기본적으로 클래스는 final 클래스이기 때문에 open을 적어줘야 상속이 가능함
    constructor(name :String , age:Int) : this(name){
        println("my name  is ${name },${age}years old!")
        //부생성자 constructor 는 사용하기 위해서는 :this()로 주생성자의  변수를 받아와야함
        //init 먼저 생성 되고 그후에 실행됨
    }
    init {//클래스 생성 했을때의 동작
        println("New human has been born!!")
    }

    val name =name
    open fun eatingCake(){   //메소드도 final 이기때문에 overrding 을 위해선 open을 적어줘야함
        println("Crunch Crunch")
    }
}
class Korean : Human(){ //자바의 오버라이딩 개념 상속은 한개씩만 받을수있음 여러명에게 상속은 가능함
    override fun eatingCake() {
        super.eatingCake()
        println("냠냠 쭵쭵")
        println("my name is : ${name}") //상속받은 생성자로 부터 받아옴
    }
}
fun main(){
    /*val human=Human("JaeJeong") //객체 생성
    val stranger = Human()
    human.eatingCake()*/
    val mom= Human("Jeong",25)
    val korean= Korean()
    korean.eatingCake()    //기본적으로 상속이되면 메소드를 가지고옴
    //println("this human's name is ${stranger.name}")
}