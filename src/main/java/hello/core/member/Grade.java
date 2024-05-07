package hello.core.member;

// enum: enumerated type, 열거형. 서로 연관된 상수들의 집합
// class, interface 와 동급의 형식을 가지는 단위지만 편의를 위해서이고 사실상 class 이다.
public enum Grade {
    BASIC,
    VIP

    // public static final Grade BASIC = new Grade();
    // public static final Grade VIP = new Grade();
    // private Grade(){} - 생성자(1)
    // private Grade(int a){a} - 생성자(2)
}
// 생성자의 접근 제어가 private 이다. (클래스 Grade 를 인스턴스로 만들 수 없다.)

// 데이터 타입에 맞는 데이터: 객체
// 객체를 생성할 때 실행되는 함수: 생성자


// Grade a = new Grade(3);