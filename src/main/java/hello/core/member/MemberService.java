package hello.core.member;

/**
 *
 *
 * @filename : MemberService.java
 * @author frozzun
 * @since 11/04/24
 */
public interface MemberService {

  void join(Member member);

  Member findMember(Long memberId);
}
