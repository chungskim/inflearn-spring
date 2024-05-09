package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

// 자바 코드로 member service 테스트
public class MemberApp {

    public static void main(String[] args) { // 'psvm' + enter
        // MemberService 인터페이스 데이터 타입을 가지는 변수에 MemberService 구현 객체를 선언
        MemberService memberService = new MemberServiceImpl();

        // Member 데이터 타입을 가지는 변수에 Member 객체를 선언
        Member member = new Member(1L, "memberA", Grade.VIP); // 1L: Long Type 1
        // ctrl + alt + v 'new Member(1L, "memberA", Grade.VIP) '

        // MemberService 인터페이스에 있는 함수 실행
        memberService.join(member);

        // Member 데이터 타입을 가지는 변수에, MemberService 인터페이스에 있는 함수로 가져온, Member 객체 할당
        Member findMember = memberService.findMember(1L);
        // 'soutv'
        System.out.println("new member = " + member);
        System.out.println("find member = " + findMember);
        // MemoryMemberRepository 에 Member 객체가 잘 저장되고, 불러지는지 테스트
    }
    // 매번 main 에서 테스트 하려면 코드를 짜주고 실행 결과과 올바른지 사람이 체크 해야하기 때문에 좋은 방법이 아니다.
    // test/java/hello.core 에서 junit 을 이용하자.
}


// 현재 구조
// 사용자는 MemberService(I) 를 사용할 뿐이지만 개발자는 이를 위해서 MemberServiceImpl 를 구현한다.
// MemberService(I) 를 MemberServiceImpl 로 구현하기 위해
// MemberServiceImpl 가 MemberRepository(I), MemoryMemberRepository(C) 를 동시에 의존하고 있다.
// 또한, Grade 와 Member 클래스를 public 으로 만들어서 각 클래스들이 해당 객체 데이터 타입을 가지고 코드를 짤 수 있도록 이루어져 있다.

