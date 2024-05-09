package hello.core.member;

public class MemberServiceImpl implements MemberService {

    // MemberRepository 인터페이스 의존
    // 그런데 실제 할당 하는 부분이 구현체인 MemoryMemberRepository 의존 (문제점(DIP 위반); 인터페이스(추상황)와 구현체(구체화)를 동시에 의존. 인터페이스만 의존 해야함.)
    private final  MemberRepository memberRepository = new MemoryMemberRepository(); // 구현 메모리 지정
    /// MemberRepository: Member 데이터들이 HashMap 형식으로 저장되는 클래스 구조
    @Override
    public void join(Member member) { // 사용자에게 제공되는 join 서비스(함수)를
        memberRepository.save(member); // MemberRepository 에서 정의해 놓은 'save' 함수로 구현
    }

    @Override
    public Member findMember(Long memberId) { // 사용자에게 제공되는 findMember 서비스(함수)를
        return memberRepository.findById(memberId); // MemberRepository 에서 정의해 놓은 'findById' 함수로 구현
    }
}
