package hello.core.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 *
 *
 * @filename : Order.java
 * @author frozzun
 * @since 11/06/24
 */
@Getter
@AllArgsConstructor
@ToString
public class Order {
  private Long memberId;
  private String itemName;
  private int itemPrice;
  private int discountPrice;

  public int calculatePrice() {
    return itemPrice - discountPrice;
  }
}
