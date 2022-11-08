package hello.core.member;

public interface MemberRepository {

    void save(Member menmber);

    Member findById(Long memberId);
}
