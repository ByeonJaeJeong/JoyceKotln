package com.example.myapplication

import java.util.*

/**
 * 비행기를 타는  클래스
 */
//데이터 클래스 pojo 클래스
//비어있는 틀역할을 하는 클래스
//dto 와 같은 역할을함
//한 클래스에 여러개의 데이터 클래스를 만들수있음
data class  Ticket(val companyName :String, val name : String, var date : String, var seatNumber : Int)

// toString() ,hashCode(), equals() ,copy() method 를 자동으로 만들어줌
//간단하게 만들어주는 DTO 라고 생각하면댐

fun main(){
    val ticketA = Ticket("KoreanAir","Byeon JaeJeong", "2021-02-11", 14)
}
