package hello.core.member;

/**
 * @filename : MemberRepository.java
 * @author frozzun
 * @since 11/04/24
 */
public interface MemberRepository {

  void save(Member member);

  Member findById(Long memberId);
}
