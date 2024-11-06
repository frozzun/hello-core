package hello.core.discount;

import hello.core.member.Member;

/**
 *
 *
 * @filename : DiscountPolicy.java
 * @author frozzun
 * @since 11/06/24
 */
public interface DiscountPolicy {
  /**
   * @return 할인 대상 금액
   */
  int discount(Member member, int price);
}
