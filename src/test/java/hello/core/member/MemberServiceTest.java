package hello.core.member;

import hello.core.AppConfig;
import hello.core.order.OrderService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 *
 * @filename : MemberServiceTest.java
 * @author frozzun
 * @since 11/04/24
 */
class MemberServiceTest {

  MemberService memberService;

  @BeforeEach
  public void beforeEach() {
    AppConfig appConfig = new AppConfig();
    memberService = appConfig.memberService();
  }
}