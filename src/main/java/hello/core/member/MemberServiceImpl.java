package hello.core.member;

public class MemberServiceImpl implements MemberService {

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
