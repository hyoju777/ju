package com.ohgiraffers.section03.constant;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 상수란?
        * 변수가 메모리에 변경될 값을 저장하기 위한 공간을 나타낸다면, 상수는 이와 상반되는 개념으로
        * 변하지 않는 값을(항상 고정된 값을) 지정하기 위한 메모리상의 공간을 상수라고 한다.
        *
        * 상수의 사용 목적
        * 변경되진 안흔ㄴ 고정된 값을 지정할 목적으로 사용한다.
        * 초기화 이후 값 대입 시 컴파일 레러를 발생시켜 값이 수정되지 못하도록 한다.
        * */

        final int AGE;

        AGE = 10;
        // AGE =20;

        int age = AGE;
        age = 20;
        System.out.println(age);



    }
}
