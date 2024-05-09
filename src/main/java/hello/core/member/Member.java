package hello.core.member;

public class Member { // Member 클래스 (데이터 타입)
    private Long id; // 클래스 데이터 1
    private String name; // 클래스 데이터 2
    private Grade grade; // 클래스 데이터 3

    // Member 클래스 생성자
    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // 메소드 get, set
    public Long getId() { // 객체의 ID 불러오기
        return id;
    }

    public void setId(Long id) { // 객체에 ID 넣어주기
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    // 최상위 클래스의 toString() 함수를 재정의(override)
    @Override
    public String toString() {
        return name;
    }
}
