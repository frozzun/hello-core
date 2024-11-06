package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

/**
 *
 *
 * @filename : RateDiscountPolicy.java
 * @author frozzun
 * @since 11/06/24
 */
public class RateDiscountPolicy implements DiscountPolicy{

  private int discountPercent = 10; //10% discount

  @Override
  public int discount(Member member, int price) {

    if (member.getGrade() == Grade.VIP) {
      return price * discountPercent / 100;
    } else {
      return 0;
    }
  }
}
