package hello.core.member;
// 내부 구조
// 개발자에게만 지원되는 기능들
public interface MemberRepository {
    void save(Member member);


    Member findById(Long memberId); // Member 데이터 타입으로 리턴
}


/* 자바 save(T)
    public <S extends T> S save(S entity) { // S: Entity T 를 저장하는 Entity (Repository)
        Assert.notNull(entity, "Entity must not be null.");
        if (entityInformation.isNew(entity)) { // isNew 메서드를 통해 매개변수로 들어온 entity 가 새로운 것인지 확인
            em.persist(entity); // 영속성 컨텍스트(entity 를 영구 저장하는 환경)에 entity 저장
            return entity;
        } else {
            return em.merge(entity); // 이미 선언된(사용중인) entity 에는 merge 한다.
        }
    }
*/