package hello.core.member;

import java.util.HashMap;
import java.util.Map;

// MemberRepository 인터페이스의 구현체
public class MemoryMemberRepository implements MemberRepository {
    // implements: 부모 객체는 선언만 하며(interface) 정의(내용)은 자식에서 오버라이딩(재정의)해서 사용해야함
    // 부모에서 선언, 정의를 모두 했다면 'extends' 사용

    public static Map<Long, Member> store = new HashMap<>(); // 동시성 이슈가 있다.
    // MAP: key-value 형식의 클래스. 리스트나 배열처럼 순차적 구성이 아니라 key 값으로 데이터(value)를 얻는다.
    // HashMap: 순서가 없는 순수 MAP 데이터 타입
    @Override
    public void save(Member member) { //
        store.put(member.getId(), member); // 'store' 의 MAP Table 에 key-value 입력
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId); // 'store' 의 MAP Table 에서 key 값에 해당하는 value 값 가져오기
    }
}
