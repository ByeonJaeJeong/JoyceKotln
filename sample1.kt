package com.example.myapplication

import java.lang.IllegalArgumentException

//코틀린은 무조건 반환을 함 공백일경우 Unit을 반환
/**
 *
 */
fun main(){
  // forAndWhile()
   //nullcheck()
    ignoreNulls("Jeong@naver.com")
}
//두수 비교해서 더큰수를 알아내는 함수 생성
fun maxBy(a:Int ,b: Int ) : Int{
    if(a > b){
        return a
    }else{
        return b
    }
}
//코틀린의 형식 3항 연산자 의 코틀린 형식
fun maxBy2(a: Int , b:Int ) :Int =if(a>b) a else b

fun checkNum(score: Int){
    when(score){ //statement 의 when
        0-> println("this is 0")
        1-> println("this is 1")
        2,3 -> println("this 2 or 3 ")
        else -> println("I don't know")
    }

    var b:Int =when(score){ //Expression 의 when
        1->1
        2->2
        else->3
    }

    println("b: ${b}")
    when (score){
        in 90..100 ->println("90점에서 100점 사이입니다.")
        in 10..80 -> println("망했어요.")
        else ->println(" 자살을 추천합니다.")
    }
}
fun helloworld(){ //없는 경우는 반환형 생략가능 생략 안하고 적는경우 Unit 이라고 적음
    println("hello World!")
}
fun add(a :Int , b: Int) : Int {// 아닐경우 생략 불가
    return a+b
}

//val 과 var 이 있음
// val 은 변경불가 var 은 변경가능
// val =value
fun hi(){
    val a: Int = 10
    var b : Int =9
//    a =100 변경 불가
    b = 100 //변경 가능
    val c= 100
    var d = 100
    var name : String = "Jeong" //String 형태 선언


}
//Array and List

//Array는 메모리가 정해져있음
//List 는 List(수정이 불가능) MutableList(수정이 가능)

fun array(){
    val array:Array<Int> =  arrayOf(1,2,3)
    val list : List<Int> = listOf(1,2,3)

    val array2: Array<Any> = arrayOf(1,"d",3.4f)
    val list2: List<Any> = listOf(1,"d",11L)

    array[0]=3 //변경 가능
    //list[0]=2 변경불가
    val arrayList :ArrayList<Int> = arrayListOf<Int>(1,2,3)
    arrayList.add(10)
    arrayList.add(20)

}
//For / While
fun forAndWhile(){
    val students = arrayListOf("joyce","james","jenny","jennifer")
    for ((index:Int ,name:String) in students.withIndex()){
        println("${index+1}번째 학생 :${name}")
    }

    var sum : Int =0
    for (i in 1..100){//  i in number downTo 내려가는것 step 올라가는것 until 10을 포함하지 않음
        sum= sum+i
    }
    println(sum)
    var index= 0
    while(index <10 ){ //다른문법과 차이가 없음
        println("current index: ${index}")
        index++
    }
}
//Nullable /NonNull
fun nullcheck(){
    //NPE :Null pointer Exception
    //코틀린은 컴파일 시점에서 Exception 을 잡을수 있게 만드는것 으로 ? 를 사용함

    var name: String ="JaeJeong"

    var nullName :String? = null //변수명 옆에 ? 을 넣음으로써 null을 넣을수있고  안넣을수 있음

    var nameInUpperCase = name.toUpperCase() //UpeerCase 같은것을 사용할때
    // ?가 들어가는 null이 들어갈수있는 변수는 변수명에 ? 를 넣어주어야함
    //if(nullName != null) 이런것을 간략화 시켜줌
    var nullNameInUpperCase =nullName?.toUpperCase()

    val lastName : String? ="Byeon"
    val fullName =name+(lastName?: " NO lastName") //null일경우 옆의것을 반환
    var mLastName =lastName ?: throw  IllegalArgumentException("No last Name")
    println(fullName)

}

// !!
fun ignoreNulls(str: String?){
    val mNotNull: String =str!! //컴파일러에게 null이 들어올리 없다고 알려줌
    val upper =mNotNull.toUpperCase() //컴파일러는 오류를 내지않으나 null이 들어갈경우 Exception을 일으킴

    val email :String?= "qsz78547@naver.com"
    email?.let {
        println("my email is ${email}")//null이 아니면 실행
    }
}


