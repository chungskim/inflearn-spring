package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    // 테스트 할 서비스(클래스)
    // MemberService 인터페이스 변수에 MemberServiceImpl 클래스 객체를 할당
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given (테스트용 데이터)
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when (테스트 할 클래스 함수에 테스트 데이터를 넣어본다)
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then (의도한 결과인지 확인)
        Assertions.assertThat(member).isEqualTo(findMember);
    }
    // 사람이 결과물을 보고 직접 확인하지 않아도 된다.
}
