package hello.core.config;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 수동 빈 등록
 */
@Configuration
public class DisCountPolicyConfig {

  @Bean
  public DiscountPolicy rateDiscountPolicy() {
    return new RateDiscountPolicy();
  }

  @Bean
  public DiscountPolicy fixDiscountPolicy() {
    return new FixDiscountPolicy();
  }
}
