package hello.core.member;
// 외부 구조
// 사용자에게 지원되는 기능들
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
