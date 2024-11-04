package hello.core.member;

/**
 *
 *
 * @filename : MemberServiceImpl.java
 * @author frozzun
 * @since 11/04/24
 */
public class MemberServiceImpl implements MemberService {

  private final MemberRepository memberRepository = new MemoryMemberRepository();


  @Override
  public void join(Member member) {
    memberRepository.save(member);
  }

  @Override
  public Member findMember(Long memberId) {
    return memberRepository.findById(memberId);
  }
}